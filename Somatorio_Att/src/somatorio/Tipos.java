package somatorio;

import java.util.Scanner;

public class Tipos {
	public static void main(String[] args) {
		int in; // Consegue computar apenas numeros inteiros
		float flo; //Presição simples consegue computar até 7 casas decimais sendo impreciso
		// mas mais eficiente
		double dob; //Presição dupla consegue computar até 15 casas decimais sendo mais preciso
		//mas menos eficiente
		Scanner sc = new Scanner(System.in);
		in = sc.nextInt();
		flo = sc.nextFloat();
		dob = sc.nextDouble();
		System.out.println(in + "\n"+ flo + "\n"+ dob);
	}
}
