import java.util.Scanner;


public class exercicio3 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		
		double num;
		double num1,r1, rp = 0, r2;
		
		System.out.println("Olá, a empresa irá fazer um aumento no seu salário.");
		System.out.println("Então, por favor, digite o seu salário, que eu irei mostrar o seu aumento:");
		num = leitor.nextDouble();	

		
		if (num >=0 && num <= 1000) {
			
			num1 = (double) (num * 15)/100;
		    r1 = (double) (num + num1);
		    System.out.println("Muito bem, o seu salário atual agora é de: "+r1);
	
		
		} else if (num >=1000 && num <= 2500) {	
		rp = (double) (num * 7)/100;
		r2 = (double) (num + rp);
	System.out.println("Muito bem, o seu salário atual agora é de: "+r2);
		
		
	} else {
		System.out.println("O seu salário é "+num+", então, você não receberá o aumento. ");	
	
			
			 
	   
				 
				 
	
			
				 
			 
			 	
	 		 
			 
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
	}
}
