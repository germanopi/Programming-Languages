import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] array = new int[10];
		int aux = 0;

		for (int i = 0; i < 10; i++) {
			array[i] = in.nextInt();
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if (array[j] > array[j + 1]) {
					aux = array[j + 1];
					array[j + 1] = array[j];
					array[j] = aux;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
