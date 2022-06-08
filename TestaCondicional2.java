
public class TestaCondicional2 {
	public static void main(String[] args) {
		int idade = 18;
		int quantidadeDePessoas = 3;
		boolean estaAcompanhado = quantidadeDePessoas >=2;
		
		System.out.println("O valor da variável estaAcompanhado é igual a : " + estaAcompanhado);
		
		if (idade >=18 && estaAcompanhado) {
			System.out.println("Pode entrar, seja bem vindo!");
		} else {
			System.out.println("Infelizmente não pode entrar.");
		}
	}

}
