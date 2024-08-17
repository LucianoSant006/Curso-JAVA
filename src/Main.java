import java.util.Locale;
import java.util.Scanner;

public class Main {


		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int code = sc.nextInt();
			int Quant = sc.nextInt() ;
			
			double valorT;
			
			switch(code) {
			case 1 :{
				 valorT = Quant * 4.00;  
					System.out.printf("Total %.2f",valorT);
			}break;
			case 2:{
				valorT = Quant * 4.50;
				System.out.printf("Total %.2f",valorT);
			}break;
			case 3:{
				
				valorT = Quant * 5.0;
				System.out.printf("Total %.2f",valorT);
			}break;
			case 4:{
				valorT = Quant * 2.0;
				System.out.printf("Total %.2f",valorT);
				
			}break;
			case 5:{
				valorT = Quant * 1.50;
				
				System.out.printf("Total %.2f",valorT);
			}break;
			default:{
				System.out.println("Valor não encontrado");
				break;
			}
			
			
			}
			sc.close();
		}
}

		
