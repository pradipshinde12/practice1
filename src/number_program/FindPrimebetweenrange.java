package number_program;

public class FindPrimebetweenrange {
	public static void main(String args[]) {

		
		for (int n = 10; n < 21; n++) {
			int i;
			for (i = 2; i <= n; i++) {
				if (n % i == 0) {
					break;
				}
			}

			if (n == i) {
				System.out.println(n);
			}
		}
	}

}
