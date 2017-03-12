class Program {
  public static void main(String[] args) {
    int a[] =  {2, 1, 3, 1, 4, 1};
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      if ((i % 2) == 0) {
          sum = sum + a[i];
        }
      }
      System.out.println(sum);
    }

  }
