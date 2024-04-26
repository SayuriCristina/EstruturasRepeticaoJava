package aprendendorepeticao;
import java.util.Scanner;

public class ExercicioFor {

		public static void main(String[] args) {
			Scanner read = new Scanner(System.in);
			
			System.out.print("Digite o primeiro número do intervalo: ");
			int primeiro = read.nextInt();
			
			System.out.print("Digite o segundo número do intervalo: ");
			int segundo = read.nextInt();
			
			if(segundo <= primeiro) {
				System.out.println("Intervalo inválido!");
				
			} else {
				for (int i = primeiro ; i <= segundo ; i++) {
					if ((i % 3 == 0) && (i % 5 == 0)) {
						System.out.printf("%d é múltiplo de 3 e de 5.\n", i);
					}
				}
			}
			
			read.close();
	
		}

}
