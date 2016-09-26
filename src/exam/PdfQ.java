package exam;

public class PdfQ {

	public static void main(String[] args) {

		// Q66 correct answer is A 2468, not D
		int a1[] = { 2, 4, 6, 8 };
		int a2[] = { 1, 3, 5, 7, 9 };
		a2 = a1;
		for (int e2 : a2) {
			System.out.println(e2);
		}

	}

}
