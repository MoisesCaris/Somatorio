package somatorio;

public class Somatorio {
	public static void main(String[] args) {
		double x1 = 0.1;//Presição
		float x2 = (float) 0.125;//Economia de memoria
		double som1 = 0;
		float som2 = 0;
		for (int i = 1; i <= 100000; i++) {
			som1 = x1 + som1;
		}
		for (int i = 1; i <= 80000; i++) {
			som2 = x2 + som2;
		}
		double result1 = 10000 - som1;
		System.out.println(result1);

		float result2 = 10000 - som2;
		System.out.println(result2);
	}
}
