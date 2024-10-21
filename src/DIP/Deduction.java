package Ejer4;

public class Deduction implements IDeductionCalculator {
	@Override
	public float calc(float amount, float percentage) {
		return (amount * percentage) / 100;
	}
}