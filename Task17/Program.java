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

     public static void Min(int[][] array) {
       for (int j = 0; j < array[0].length; j++) {
         int min = array[0][j];
         for (int i = 0; i < array.length; i++) {
 				   if (array[i][j] < min) {
 					min = array[i][j];
 				   }
 			  }
 			System.out.println("Минимальное значание столбца = " + min);
      }
 		}

	public static void main(String[] args) {
		int array[][] = new int[5][3];

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = random.nextInt(10);
			}
		}

		showArray(array);
    Min(array);
	}
}
