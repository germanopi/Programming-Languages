import java.util.Scanner;

public class ArrayDinamico {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int x = 1;
		int y = 1;

		int[] array = new int[x];
		int[] arrayAux = new int[y];

		for (int i = 0; i < 10; i++) {
			if (i == 0) {
				array[i] = in.nextInt();
			}
			if (i >= x) {
				y = 2 * x;
				if (i >= x) {
					arrayAux = new int[y];
					for (int j = 0; j < i; j++) {
						arrayAux[j] = array[j];
					}

					array = new int[y];
					for (int k = 0; k < i; k++) {
						array[k] = arrayAux[k];
					}

					x = y;
				}

			}
			if (i != 0) {
				array[i] = in.nextInt();
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}
	}
}