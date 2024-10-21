package SRP;
import java.sql.Date;


public class Main {
	public static void main(String[] args) {
		
		Deduction deduction = new Deduction(10);
		
        Vat vat = new Vat((float) 0.16);
        
        Bill bill = new Bill("1234", new Date(System.currentTimeMillis()), 100, deduction, vat);
        float totalBill = bill.calculateTotal();
		System.out.println(totalBill);
	}
}