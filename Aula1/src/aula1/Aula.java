package aula1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;

import javax.swing.JOptionPane;

public class Aula {
	
	public static void main(String[] args) {
		//conceitos();
		//System.out.println("no main novamente");
		//variaveis();
		//conversao();
		//desvioCondicional();
		//estruturaControle();
		//arrays();
		//arrayLista();
		//listaLinkada();
		//listahashMap();
		hashMapList();
		listaHashSet();
		
	}
	public static void listaHashSet() {
		HashSet<String> capitais = new HashSet<String>();
		capitais.add("Volvo");
		capitais.add("BMW");
		capitais.add("Mazda");
	}
	
	public static void hashMapList() {
		HashMap<String, String> capitais = new HashMap<>();
		capitais.put("SC", "Florianópolis");
		capitais.put("PR", "Curitiba");
		capitais.put("BA", "Salvador");
		
		for(String key: capitais.keySet()) {
			System.out.println("Chave: " + key + " Valores: " + capitais.get(key));
		}
		
	}
	public static void listaLinkada() {
		//armazenar os valores em container
		LinkedList<String> cars = new LinkedList<>();
		cars.add("Mobi");
		cars.add("Focus");
		
		imprimirLista(cars);
		//cars.addFirst("Chevette");
		cars.add(0, "Chevette");
		imprimirLista(cars);
 	}
	
	public static void arrayList() {
		//simula o array
		//ao inserir recria o array original acrescentando a nova posição
		//ArrayList<String> cars = new ArrayList<>();
		List<String> cars = new ArrayList<>();
		cars.add("Fusca");
		cars.add("Brasilia");
		cars.add("Kombi");
		
		imprimirLista(cars);
		
		cars.set(1, "Chevete");
		
		imprimirLista(cars);
		cars.add(2, "Etios");
		cars.add("Corolla");
		imprimirLista(cars);
		
		System.out.println(cars.get(2));
		
		
		}
	
	
	private static void imprimirLista(List<String> cars) {
		for(String car: cars) {
			System.out.println(car);
	}
		System.out.println();
	}
	
	
	public static void arrays() {
		String[] cars = {"Fusca", "Kombi", "Brasilia", "Tl"};
		for(String car : cars) {
			System.out.println(cars.length);
		}
		
		String[] frutas = new String[3];
		frutas[0] = "Maça"; 
		frutas[1] = "Banana";
		frutas[2] = "Laranja";
		for (int i = 0; i < frutas.length; i++) {
			System.out.println(frutas[i]);
		}
		
	}
	public static void estruturaControle() {
		int x = 0;
		System.out.println(x < 5);
		while(x < 5) {
			System.out.println("Linha " + x);
			x++;//x = x + 1;
		}
		System.out.println("next line to for");
		System.out.println();
		
		int i;
		for(i = 0; i < 5; i++) {
			System.out.println("Linha for " + i);
		}
		System.out.println();
		//executa o teste lógico no final do bloco de comando
		int z = 10;
		System.out.println(z < 5);
		do {
			System.out.println("linha do " + z);
			z++;
		}while(z < 5);
	}
	public static void desvioCondicional() {
		int numero = 18;
		System.out.println(numero < 18);
		if(numero < 18) {
			System.out.println(numero + " é menor que 18");
		}else if(numero > 18) {
			System.out.println(numero + " é maior que 18");
		} else {
			System.out.println(numero + " é igual a 18.");
		}
	}
	
	public static void conversao() {
		byte idade;
		idade = 47;
		
		idade = Byte.parseByte(JOptionPane.showInputDialog("Informe idade"));
		JOptionPane.showMessageDialog(null, "sua idade é: " + idade + " anos");
		
		float peso = Float.parseFloat(JOptionPane.showInputDialog("Informe peso"));
		JOptionPane.showMessageDialog(null, "seu peso é: " + peso + " kg");
		
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe altura"));
		JOptionPane.showMessageDialog(null, "sua altura é: " + altura + " cm");

		float nota = 9.8f;
		double notad = 9.8;
		
		String notaString = String.valueOf(nota); 
		System.out.println(notaString);
	}
	
	public static void variaveis() {
		//String nome = "Jaqueline";
		//String sobreNome;
		String nome;
		String sobreNome;
		nome = JOptionPane.showInputDialog("Informe nome");
		
		
		sobreNome = "Gabriela";
		String nomeCompleto = nome + " " + sobreNome;
		
		System.out.println(nomeCompleto);
	}
	public static void conceitos() {
		Aula2 obj; 
		obj = new Aula2();
		obj.soma();
		
		
		String nota = "10";
		System.out.println("Aula de conceitos");
	}

}
