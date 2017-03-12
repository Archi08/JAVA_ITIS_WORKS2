import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a;
		int sum = 0;

    a = scanner.nextInt();

    while (a != 0) {
      sum += (a % 10);
      a /= 10;
    }

    System.out.println(sum);
	}
}
