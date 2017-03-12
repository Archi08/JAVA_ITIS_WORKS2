class Program {
	public static void main(String[] args) {

		int countHumansWithAges[] = new int[120];

		Human human1 = new Human("Marsel", 23);
		Human human2 = new Human("Artur", 23);
		Human human3 = new Human("Kirill", 25);
		Human human4 = new Human("Denis", 22);
		Human human5 = new Human("Ayaz", 24);
		Human human6 = new Human("Artur", 23);
		Human human7 = new Human("Andrey", 25);
		Human human8 = new Human("Chuck", 37);
		Human human9 = new Human("Ron", 32);
		Human human10 = new Human("Charlie", 15);
		Human human11 = new Human("Bob", 78);
		Human human12 = new Human("Terk", 22);
		Human human13 = new Human("Cox", 43);
		Human human14 = new Human("Dmitry", 25);
		Human human15 = new Human("Dwayne", 9);


		Human humans[] = {human1,human2,human3,
			human4,human5,human6,human7,human8,human9,human10,human11,
      human12,human13,human14,human15};




		for (int i = humans.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (humans[j].getAge() < humans[j+1].getAge()) {
					Human temp = humans[j];
					humans[j] = humans[j+1];
					humans[j+1] = temp;
				}
			}
		}

		for (int i = 14; i > 0; i--) {
			System.out.println(humans[i].getAge() + " " + humans[i].getName());
		}
	}
}
