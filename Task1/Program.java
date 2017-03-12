import java.util.Scanner;

class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a;

    int a5000 = 0;
    int a1000 = 0;
    int a500 = 0;
    int a100 = 0;
    int a50 = 0;
    int a10 = 0;
    int a5 = 0;
    int a2 = 0;
    int a1 = 0;

    a = scanner.nextInt();
    while (a != 0) {
      a5000 = a / 5000;
      a = a % 5000;
      a1000 = a /1000;
      a = a % 1000;
      a500 = a / 500;
      a = a % 500;
      a100 = a / 100;
      a = a % 100;
      a50 = a / 50;
      a = a % 50;
      a10 = a / 10;
      a = a % 10;
      a5 = a / 5;
      a =  a % 5;
      a2 = a / 2;
      a = a % 2;
      a1 = a / 1;
      a = a % 1;

    }
    System.out.println(a5000 + " номинал по 5000");
    System.out.println(a1000 + " номинал по 1000");
    System.out.println(a500 + " номинал по 500");
    System.out.println(a100 + " номинал по 100");
    System.out.println(a50 + " номинал по 50");
    System.out.println(a10 + " номинал по 10");
    System.out.println(a5 + " номинал по 5");
    System.out.println(a2 + " номинал по 2");
    System.out.println(a1 + " номинал по 1");


  }
}
