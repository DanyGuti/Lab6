package LSK;

public class Car implements IEngineTDevice, IMatricula {
	public String matricula;
	@Override
	public void startEngine() {}
	@Override
	public void matricular(String matricula) {
		this.matricula = matricula;
	}
}