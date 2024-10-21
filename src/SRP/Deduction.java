package SRP;
import java.sql.Date;

public class Deduction implements ICalculation {
	// Quitamos lo que varía
    private float deductionPercentage;
    
    // Constructor para crear la clase
    public Deduction(float deductionPercentage) {
        this.deductionPercentage = deductionPercentage;
    }
    
	// Método que calcula el total de la factura
	@Override
	public float calculate(Bill bill) {
		float initialAmount = bill.getInitialAmount();
		// Calculamos la deducción
		if (initialAmount > 35600) {
			return (float) (initialAmount * deductionPercentage + 4.5) / 100;
		} else {
			return (initialAmount * deductionPercentage) / 100;
		}
	}
}