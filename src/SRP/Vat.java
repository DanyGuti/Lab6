package SRP;

public class Vat implements ICalculation {
	// Se podrá modificar el IVA cada vez que se cree VAT
	private float IVA = 0.16f;
	
	// Constructor para crear la clase
    public Vat(float IVA) {
        this.IVA = IVA;
    }
    
    @Override
    public float calculate(Bill bill) {
        if (bill.getCode().length() < 10) {
            return 0;
        }
        return bill.getInitialAmount() * IVA;
    }
}