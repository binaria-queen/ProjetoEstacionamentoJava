import entidades.Calculadora;
import entidades.Pessoa;
import heranca.Motocicleta;
import heranca.Veiculo;

public class Poo {

	public static void main(String[] args) {
		//criarObjetoPessoa();
		//criarObjetoCalculadora();
		//criarObjetoVeiculo();
		criarObjetoMotocicleta();
	}
		public static void criarObjetoMotocicleta() {
			Motocicleta m1 = new Motocicleta();
			m1.setCilindradas(190);
			m1.setMarca("Honda");
			m1.setModelo("XRE");
			m1.setPlaca("LZE-8976");
			System.out.println(m1.toString());
			m1.imprimirDados();
			
			Motocicleta m2 = new Motocicleta("Honda", "ML","ABC-1233",125);
			System.out.println(m2.toString());
		}
		public static void criarObjetoVeiculo() {
			Veiculo v1 = new Veiculo ("Chevrolet", "Corsa", "LZZ-2323");
			System.out.println(v1.toString());
		}
		
		public static void criarObjetoCalculadora() {
			Calculadora c1 = new Calculadora();
			c1.x = 200;
			c1.y = 100;
			
			int[] array1 = {10,20,30,40};
			
			System.out.println(c1.soma());
			System.out.println(c1.soma(300,281));
			System.out.println(c1.soma(array1));
		}
		
		
		
		public static void criarObjetoPessoa() {
			Pessoa obj = new Pessoa();
		
		
		/*
		obj.nome = "Maria";
		obj.email = "maria@gmail.com";
		
		Pessoa obj2 = new Pessoa();
		obj2.nome = "Joaninha";
		obj2.email = "joaninha@gmail.com";*/
		
		/*obj.setNome("Maria");
		obj.setEmail("maria@gmail.com");
		obj.setCpf("074.835.446-89");
		
		System.out.println(obj.getNome());
		System.out.println(obj.getEmail());
		System.out.println(obj.getCpf());
		
		
		Pessoa obj3 = new Pessoa("Jos?");
		System.out.println(obj3.getNome());*/
		
		Pessoa obj4 = new Pessoa("Janete","janete@gmail.com","12378923561");
		System.out.println(obj4.getNome());
		System.out.println(obj4.getEmail());
		System.out.println(obj4.getCpf());
	}

}

//encapsulamento -> proteger um recurso: atributo, m?todo