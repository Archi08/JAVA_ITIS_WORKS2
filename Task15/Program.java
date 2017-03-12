class Program {
  public static double [] sqr(double a, double b, double c) {
    double[] result = new double[2];


  double D = b * b - 4 * a * c;
  result[0] = (-b + Math.sqrt(D))/(2*a);
  result[1] = (-b - Math.sqrt(D))/(2*a);


  return result;

  }
  public static void main(String[] args) {
    double x = 4.0;
    double y = 5.0;
    double z = -10.0;

    double[] ans = sqr(x,y,z);

    for (int i = 0; i < ans.length; i++) {
      System.out.println(ans[i]);
    }

  }
}
