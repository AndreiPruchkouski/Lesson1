package by.htp.lesson1;

public class Lesson01Task01 {

	public static void main(String[] args) {
		// Вывести на экран все четные цифры от 1 до 100 (используя цикл for) (+остаток от деления)
		System.out.println("Results for Task001");
		for (int i=1;i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
