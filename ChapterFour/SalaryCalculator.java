package ChapterFour;

import java.util.Scanner;

public class SalaryCalculator {
    private int grossPay;
    private int hoursWorked = 40;


    public SalaryCalculator(int grossPay, int hoursWorked) {
        this.grossPay = grossPay;
        this.hoursWorked = hoursWorked;
    }

    public int getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(int grossPay, int hoursWorked) {
        if(hoursWorked > 40)
            grossPay = grossPay + grossPay/2;
        this.grossPay = grossPay;

    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
