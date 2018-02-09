package by.htp.lesson1;

public class Lesson01Task02 {

	public static void main(String[] args) {
		// Вывести на  экран все нечетные цифры от 1 до 15 (не используя цикл for)
		// Version 1
		System.out.println("Results for Task002 v.1");
		int x = 1;
		while (x < 16) {
			if (x != 2 && x != 4 && x != 6 && x != 8 && x != 10 && x != 12 && x != 14)
				System.out.println(x);
			x = x + 1;
		}
		// Version 2
		System.out.println("Results for Task002 v.2");
		System.out.println(1);
		System.out.println(3);
		System.out.println(5);
		System.out.println(7);
		System.out.println(9);
		System.out.println(11);
		System.out.println(13);
		System.out.println(15);

		// Version 3
		System.out.println("Results for Task002 v.3");
		print(1, 16);
	}

	private static void print(int x, int end) {
		if (x % 2 == 1) {
			System.out.println(x);
		}
		if (x < end) {
			print(x + 1, end);
		}
	}
}