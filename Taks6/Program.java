import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

    int a;
		int sum = 0;
		a = scanner.nextInt();
		int i = 1;
    while (a != -1) {
      if ( i % 2 == 0) {
        sum += a;
      }
      i++;
      a = scanner.nextInt();
    }
    System.out.println(sum);
  }
}
