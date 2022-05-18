package interfaces;

public class Gato implements IAnimal, IMamifero{

	@Override
	public void sleep() {
		System.out.println("zzzzzzzzzzzzzz");
		
	}

	@Override
	public void barulho() {
		System.out.println("miau miau");
		
	}
	
	public void saltar() {
		System.out.println("qixz");
	}

	@Override
	public void qtdePatas(int qtdePatas) {
		System.out.println("qixz");
		
	}
}
