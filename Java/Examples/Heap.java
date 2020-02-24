import java.util.Arrays;
import java.util.Scanner;

public class Heap {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] H = new int[1];
		int heapsize = 0;
		int i = 0;
		int x = 10;
		while (x > 0) {
			H[i] = in.nextInt();
			i++;
			heapsize++;

			if (heapsize == H.length) {
				int[] aux = new int[2 * heapsize];
				for (int j = 0; j < heapsize; j++) {
					aux[j] = H[j];
				}
				H = aux;
			} else {
				// continue
			}
			x--;
		}
		int HeapSize = heapsize;
		MaxHeap(H, HeapSize);
		System.out.println(Arrays.toString(H));
		remover(H, HeapSize);
		System.out.println(Arrays.toString(H));
		Heapsort(H,HeapSize);
		System.out.println(Arrays.toString(H));
	}

	public static void Heapsort(int[] H, int heapsize) {
		int[] v = MaxHeap(H, heapsize);
		while (heapsize > 0) {
			remover(H, heapsize);
			heapsize--;
		}
	}

	public static int[] MaxHeap(int[] H, int heapsize) {

		for (int i = (heapsize / 2) - 1; i >= 0; i--) {
			Heapify(H, i, heapsize);

		}
		return H;
	}

	private static void Heapify(int[] H, int i, int heapsize) {
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		int m = i;

		if (l < heapsize && H[l] >= H[m]) {
			m = l;
		}
		if (r < heapsize && H[r] >= H[m]) {
			m = r;
		}
		if (m != i) {
			int aux = H[i];
			H[i] = H[m];
			H[m] = aux;
			Heapify(H, m, heapsize);
		}
	}

	private static void remover(int[] H, int heapsize) {
		int r = H[0];
		int aux = H[0];
		H[0] = H[heapsize - 1];
		H[heapsize - 1] = aux;
		heapsize = heapsize - 1;
		Heapify(H, 0, heapsize);
	}

}