class Program {
      public static void main(String[] args) {
        int countHumansWithAges[] = new int[120];

        Human human1 = new Human(14);
        Human human2 = new Human(34);
        Human human3 = new Human(4);
        Human human4 = new Human(5);
        Human human5 = new Human(8);
        Human human6 = new Human(15);
        Human human7 = new Human(18);
        Human human8 = new Human(14);
        Human human9 = new Human(13);
        Human human10 = new Human(23);
        Human human11 = new Human(28);
        Human human12 = new Human(21);
        Human human13 = new Human(55);
        Human human14 = new Human(31);
        Human human15 = new Human(19);

        Human humans[] = {human1,human2,human3,human4,human5,human6,human7,
          human8,human9,human10,human11,human12,human13,human14,human15,};

          for (int i = 0; i < humans.length; i++) {
          			countHumansWithAges[humans[i].age()]++;
          		}

           public static int bubbleSort(int[] arr) {
                  for (int i = arr.length - 1; i >= 0; i--) {
                      for (int j = 0; j < i; j++) {
                          if (arr[j] > arr[j + 1]) {
                              int t = arr[j];
                              arr[j] = arr[j + 1];
                              arr[j + 1] = t;
                          }
                      }
                  }
          }
          bubbleSort(countHumansWithAges[])
      }
}
