
class Program {
	public static int [] MaxAndMin(int a[]) {
		int[] result = new int[2];
		result[0] = a[0];
		result[1] = a[0];


		for (int i = 1; i < a.length; i++) {
			if (a[i] > result[0]) {
			result[0] = a[i];
			}
			if (a[i] < result[1]) {
			result[1] = a[i];
			}
		}


		return (result);

	}

	public static void main(String[] args) {
		int[] b = {11, 24, 10, 15, 23};
		int[] c = MaxAndMin(b);

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

	}
}
