import java.util.Locale;
import java.util.Scanner;

public class Main {


		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int horaInicial = sc.nextInt();
			int horaFinal = sc.nextInt();
			
			int duracao;
			
			if(horaInicial < horaFinal) {
				
				duracao = horaFinal - horaInicial;
				
			}
			
			else{
				duracao = 24 - horaInicial + horaFinal;
			}
			
			System.out.println("O jogo durou "+duracao+"Horas");
			
			sc.close();

			{
				
			}
			
			sc.close();
		}

}
