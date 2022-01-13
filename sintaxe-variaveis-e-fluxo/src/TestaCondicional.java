
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("voçe tem mais de 18 anos !");
		    System.out.println("Seja Bem Vindo");
		}
		else {
			if(quantidadePessoas >= 2)
				System.out.println("voce nao tem 18, mas pode entar, "
						+ "pois está acompanhado");
			System.out.println("Infelizmente voce não pode entrar");
		}
		    	    
	}
}
