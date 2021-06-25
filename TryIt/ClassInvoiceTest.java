package TryIt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class ClassInvoiceTest {
    public static void main(String[] args) {

        ClassInvoice[] classInvoice = {
                new ClassInvoice(83, "Electric sander", 7, 57.98),
                new ClassInvoice(24, "Power saw", 18, 99.99),
                new ClassInvoice(7, "Sledge hammer", 11, 21.50),
                new ClassInvoice(77, "Hammer", 76, 11.99),
                new ClassInvoice(39, "Lawn mower", 3, 79.50),
                new ClassInvoice(68, "Screw driver", 106, 6.99),
                new ClassInvoice(56, "Jig saw", 21, 11.00),
                new ClassInvoice(3, "Wrench", 34, 7.50)
        };

        List<ClassInvoice> list = Arrays.asList(classInvoice);
        System.out.printf("%s%20s%12s%8s%n", "PartNumber", "PartDescription", "Quantity", "Price");
        list.stream().forEach(System.out::println);

        List<ClassInvoice> list1 = Arrays.asList(classInvoice);
        Function<ClassInvoice, Integer> byPartNumber = ClassInvoice::getPartNumber;
        Comparator<ClassInvoice> partNumber = Comparator.comparing(byPartNumber);
        System.out.println(" ");
        System.out.println("part Description in descending order");
        list.stream()
                .sorted(partNumber.reversed())
                .forEach(System.out::println);

        System.out.println();
        System.out.println();



        List<ClassInvoice> list2 = Arrays.asList(classInvoice);
        Function<ClassInvoice, Double> byPrice = ClassInvoice::getPrice;
        Comparator<ClassInvoice> price = Comparator.comparing(byPrice);
        System.out.println(" ");
        System.out.println(" Description by Price in descending order");
        list.stream()
                .sorted(price.reversed())
                .forEach(System.out::println);

        System.out.println();
        System.out.println();
        System.out.println();

    }


        Function<ClassInvoice, Double> byPrice = ClassInvoice::getPrice;
        Comparator<ClassInvoice> price = Comparator.comparing(byPrice);


}
