class Program {
  public static void main(String[] args) {
    int a[] =  {2, 2, 3, 2, 4, 1};
    int sum = 0;
    for (int i = 1; i < a.length - 1; i++) {
      if (a[i] > a[i-1] && a[i] > a[i+1]) {
          sum = sum + 1;
        }
      }
      System.out.println(sum);
    }
  }
