
public class TestaEscopo {
	public static void main(String[] args) {
		int idade = 20;
		int quantidadeDePessoas = 3;
		//boolean estaAcompanhado = quantidadeDePessoas >= 2;
		boolean estaAcompanhado;
		
		if (quantidadeDePessoas >=2) {
			estaAcompanhado = true;
		}else {
			estaAcompanhado = false;
		}
		
		if (idade >= 18 && estaAcompanhado) {
			System.out.println("Podem entrar, sejam bem vindos!");
		} else {
			System.out.println("Infelizmente não podem entrar.");
		}
	}

}
