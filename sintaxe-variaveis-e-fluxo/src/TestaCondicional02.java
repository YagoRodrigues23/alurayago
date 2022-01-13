
public class TestaCondicional02  {
	public static void main(String[] args) {
		System.out.println("testando condionais");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("valor do acompanhado = ");
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja Bem Vindo");
		}else {
			System.out.println("Infelizmente voce nao pode entrar" + acompanhado); 
			}
			
			
		