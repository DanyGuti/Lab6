package LSK;

public class Trailer implements IRides, IMatricula {
	public String matricula;
	@Override
	public void matricular(String matricula){
		this.matricula = matricula;
	}
	@Override
	public void rides() {}
}