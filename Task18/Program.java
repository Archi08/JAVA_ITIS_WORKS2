import java.util.Random;
class Program {
	public static void showArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");


			}
			 System.out.println();
	   }
   }

     public static void Max(int[][] array) {
       int m = 0;
       for (int i = 0; i < array.length; i++) {
         int max = array[0][array.length - 1];

         for (int j = 0; j < array[0].length; j++) {
 				   if (i+j == array.length - 1) {
 					     if (array[i][j] > max) {
                 max = array[i][j];
               }
 				   }
 			  }
        m = max;
      }
      System.out.println(m);
 		}

	public static void main(String[] args) {
		int array[][] = new int[3][3];

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = random.nextInt(10);
			}
		}

		showArray(array);
    Max(array);

	}
}
