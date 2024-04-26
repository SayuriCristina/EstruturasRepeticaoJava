package aprendendorepeticao;

import java.util.Scanner;

public class ExercicioWhile {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
	
		int idade = 0;
		int menores = 0;
		int maiores = 0;
	
		while(idade > -1) {
			System.out.print("Digite uma idade: ");
			idade = read.nextInt();
		
			if ((idade < 21) && (idade >=0)) {
				menores++;
			} else if (idade > 50) {
				maiores++;
			}
		}
	
		System.out.printf("Total de pessoas menores de 21 anos: %d\n", menores);
		System.out.printf("Total de pessoas maiores de 50 anos: %d", maiores);
	
		read.close();
		
	}
}


