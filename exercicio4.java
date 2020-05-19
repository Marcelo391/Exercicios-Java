import java.util.Scanner;

public class exercicio4 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		
       int num1, num2, num3;
       
       System.out.println("Olá, me dê 3 medidas de um triangulo, que eu irei classificar para você que tipo de triângulo ele é");
       System.out.println("Me dê a primeira medida:");
		num1 = leitor.nextInt();	
		
		System.out.println("Me dê a segunda medida:");
		num2 = leitor.nextInt();
		
		System.out.println("Me dê a terceira medida:");
		num3 = leitor.nextInt();
		
		
		
		if (num1 == num2 & num2 == num3) {
			
			System.out.println("O seu triângulo tem as três medidas iguais, então ele é um equilátero");
		
		
	} else if (num1 == num2 || num1 == num3 || num2 == num3) {	
		
	System.out.println("O seu triângulo tem dois lados iguais, então ele é um isósceles. ");
		
		
	} else if (num1 != num2 && num2 != num3)  {
		System.out.println("O seu triângulo tem três lados diferentes, então ele é um escaleno. ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
}
}