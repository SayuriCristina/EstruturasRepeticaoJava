package aprendendorepeticao;

import java.util.Scanner;

public class ExercicioDoWhile {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int numero, soma = 0; 
		do {
			System.out.println("Digite um número: ");
			numero = read.nextInt();
			
			if(numero > 0) {
				soma += numero;
			}
			
		} while (numero != 0);
		
		System.out.printf("A soma dos números positivos é: %d", soma);
		
		read.close();

	}

}
