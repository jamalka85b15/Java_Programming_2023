package day05_operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        double hourlyRate = 47.5;
        double weeklyHours = 40;
        double stateTaxRate = 7 ;
        double federalTaxRate = 24.5;

      double salaryBeforeTax = hourlyRate * weeklyHours * 52;
        System.out.println(salaryBeforeTax);

        double stateTax = salaryBeforeTax * stateTaxRate /100;
        double federalTax = salaryBeforeTax * federalTaxRate /100;
        double totalTax = stateTax+federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay "+ salaryBeforeTax);
        System.out.println(stateTax);
        System.out.println(federalTax);
        System.out.println(totalTax);
        System.out.println("Net pay "+ salaryAfterTax );

        System.out.println("Gross pay "+ salaryBeforeTax +
                "\n State Tax is "+ stateTax+
                "\n Federal tax is "+ federalTax+
                "\n Total tax is "+ totalTax+
                "\n Net pay "+ salaryAfterTax);

    }


}
