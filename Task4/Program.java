import java.util.Scanner;


class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

    int a;
		int sum = 0;
    int p = 1;
		a = scanner.nextInt();

		while (a != -1) {
			if (a % 2 != 0) {
				sum = sum + a;
			}
      if (a > 0) {
        p = p * a;
      }
			a = scanner.nextInt();
		}

		System.out.println("Произведение положительных " + p);
    System.out.println("Сумма нечетных " + sum);
  }
}
