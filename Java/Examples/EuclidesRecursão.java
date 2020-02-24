import java.util.Scanner;

public class Euclides {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int x = in.nextInt();

		while (x != 0) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			int resposta = euclides(a, b, 0);
			System.out.println("MDC(" + a + "," + b + ") = " + resposta);
			x--;

		}
	}
	public static int euclides(int a, int b, int r) {
		r = (a % b);
		if (r == 0) {
			return b;
		} else {
			return euclides(b, r, a % b);
		}
	}
}
