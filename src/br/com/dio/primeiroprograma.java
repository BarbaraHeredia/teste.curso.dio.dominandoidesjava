package br.com.dio;

import br.com.dio.model.Gate;

public class primeiroprograma {

	public static void main(String[] args) {
		
		Gate gate = new Gate(null, null, null);
		Livros livros = new Livros();
		
		System.out.println(gate);
		System.out.println(livros);
		
		/*int a = 2;
		int b = 3;
		System.out.println("Hello word!" + (a+b));*/

	}

}
class Livros{
	private String nome;
	private String npag;
}
