import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);

		int num;
		
		
		System.out.println("Olá, digite, por favor, um número entre 20 e 90:");
		num = leitor.nextInt();	
		
		if (num >=20 && num <= 90) {
			
			System.out.println("O número digitado foi "+num+", e ele está entre 20 e 90, muito bem!");
		
		
		}
		
	 else {
System.out.println("O número digitado não está entre 20 e 90, por favor, digite novamente.");		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 }	
	}
}
