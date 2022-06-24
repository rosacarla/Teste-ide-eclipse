package br.com.dio;

import br.com.dio.model.Gato; //usou-se teclas Ctrl + Shift + o pra importar classe

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gato gato = new Gato(); 
		Livros livros = new Livros(); 
		//IDE sugere criar var local; nao precisa importar a classe 
		
		System.out.println(gato + "\n");
		System.out.println(livros);		
		
		int a = 2;
		int b = 3;
		System.out.println("\nHello World! " + (a+b));  
		//digitar sysout + ctrl + espaco pra auto escrita do comando de impressao				

	}

}

class Livros {
	private String nome;
	private Integer npag;
	
	//metodo toString pra nao imprimir endereco de memoria
	@Override
	public String toString() {
		return "Livros [nome=" + nome + ", npag=" + npag + "]";
	}
	
	
}