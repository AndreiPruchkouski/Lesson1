package by.htp.lesson1;

public class Lesson01Task05 {

	public static void main(String[] args) {
		// Пройти циклом по числам от 1 до 12 и вывести название месяца, соответствующее каждому числу (используя цикл и оператор if else)
		// Version 1
		 for (int i = 1; i <= 12; i++) {
		 if (i == 1)
		 System.out.println("January");
		 else if (i == 2)
		 System.out.println("February");
		 else if (i == 3)
		 System.out.println("March");
		 else if (i == 4)
		 System.out.println("April");
		 else if (i == 5)
		 System.out.println("May");
		 else if (i == 6)
		 System.out.println("June");
		 else if (i == 7)
		 System.out.println("July");
		 else if (i == 8)
		 System.out.println("August");
		 else if (i == 9)
		 System.out.println("September");
		 else if (i == 10)
		 System.out.println("October");
		 else if (i == 11)
		 System.out.println("November");
		 else if (i == 12)
		 System.out.println("December");
		 else
		 System.out.println("Are you sure?");
		}
	}
}
