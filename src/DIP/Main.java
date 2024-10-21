package Ejer4;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
    	IDeductionCalculator deductionCalculator = new Deduction();
    	IVatCalculator vatCalculator = new Vat();
    	
    	Bill bill = new Bill(deductionCalculator, vatCalculator);
    	
    	// Set some bill properties
        bill.code = "BILL001";
        bill.date = new Date(); // Current date
        bill.initialAmount = 1000.0f; // Example initial amount
        bill.deductionPercentage = 10; // Example deduction percentage

        // Calculate the bill total
        bill.billTotalCalc();
        System.out.println(bill.billTotal);
    }
}