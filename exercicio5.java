import java.util.Scanner;

public class exercicio5 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		
       float num1, num2, num3, num4;
       float m1, m2;
       
       System.out.println("Olá, eu irei fazer a sua média de física. Então, por favor, digite as suas 4 notas.");
       System.out.println("Me dê a primeira nota:");
		num1 = leitor.nextFloat();	
		
		System.out.println("Me dê a segunda nota:");
		num2 = leitor.nextFloat();
		
		System.out.println("Me dê a terceira nota:");
		num3 = leitor.nextFloat();
		
		System.out.println("Me dê a quarta nota:");
		num4 = leitor.nextFloat();
		
		m1 = (float) (num1 + num2 + num3 + num4)/4;
		
		System.out.println("Sua média é:" +m1);
		
if (m1 > 7 || m1 == 7) {
			
			System.out.println("Você está aprovado!");
		
		
	} else if (m1 >= 3.5 || m1 < 7) {	
		
	System.out.println("Você está de recuperação! ");
		
		
	} else if (m1 < 3.5)  {
		System.out.println("Você está reprovado!");
		
		

       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
	}      
}
}