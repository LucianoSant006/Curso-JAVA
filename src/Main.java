import java.util.Scanner;

public class Main{
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int gasolina =0;
		int alcool =0;
		int diesel = 0;
		
		int tipo = sc.nextInt(); 
		while (tipo != 4) {
			
			if(tipo == 1) {
				
				gasolina +=1;
			}else if(tipo == 2){
				alcool+=1;
			}else if (tipo  == 3) {
				
				diesel += 1;
			}
			
			tipo = sc.nextInt();
			
			
		}
		System.out.println("Gasolina  "+gasolina);
		System.out.println("Alcoil  "+alcool);
		System.out.println("diesel  "+diesel);
		System.out.println("Muito Obrigado");
		

		
	}
}
	

