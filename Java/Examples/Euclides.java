import java.util.Scanner;

public class Euclides {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int A = in.nextInt();
		int B = in.nextInt();

		while (B != 0) {
			int R = A % B;
			A = B;
			B = R;
		}
		System.out.println(A);
	}

}
