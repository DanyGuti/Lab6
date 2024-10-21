package SRP;
import java.sql.Date;


public class Bill {
	public String code; // Representa un número de 5 dígitos
	public Date date;
	public float InitialAmount;
    private Deduction deduction;
    private Vat vat;
    
	// Constructor to initialize bill
    public Bill(String code, Date date, float initialAmount, Deduction deduction, Vat vat) {
        this.code = code;
        this.date = date;
        this.InitialAmount = initialAmount;
        this.deduction = deduction;
        this.vat = vat;
    }
    
	public String getCode() {
		return code;
	}
	
	public float getInitialAmount() {
		return InitialAmount;
	}
	// Method to calculate the total bill amount
    public float calculateTotal() {
        float totalDeduction = deduction.calculate(this);
        float totalVat = vat.calculate(this);
        return InitialAmount - totalDeduction + totalVat;
    }
}
