package Ejer4;

import java.util.Date;

public class Bill {
	public String code; // Representa un número de 5 dígitos
	public Date date;
	public float initialAmount;
	public float totalVAT;
	public float totalDeduction;
	public float billTotal;
	public int deductionPercentage;
	private IDeductionCalculator deductionCalculator;
	private IVatCalculator vatCalculator;
	
	public Bill(IDeductionCalculator deductionCalculator, IVatCalculator vatCalculator) {
		this.deductionCalculator = deductionCalculator;
		this.vatCalculator = vatCalculator;
	}
	public void billTotalCalc() {
		totalDeduction = deductionCalculator.calc(initialAmount, deductionPercentage);
		totalVAT = vatCalculator.calc(initialAmount);
		billTotal = (initialAmount - totalDeduction) + totalVAT;
		
	}
}