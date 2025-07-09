package array_program;

public class copyonearraytoanother {
	public static void main(String args[]) {
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = new int[a.length];

		System.out.println(" this  is the original array");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// copy array to another

		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		System.out.println(" this is the copy array");

		for (int i = 0; i < b.length; i++)  {
			System.out.println(b[i]);
		}

	}

}
