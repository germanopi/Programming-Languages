import java.util.Scanner;

public class BubbleSort2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] array = new int[5];
		int aux;

		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;

				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}
