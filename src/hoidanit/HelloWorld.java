package hoidanit;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int age;
//		String name;
//
//		System.out.printf("Name: ");
//		name = sc.nextLine();
//		System.out.printf("Tuoi: ");
//		age = sc.nextInt();
//
//		System.out.println("My name is " + name + ", i am " + age);
//		sc.close();

		int a;
		int b;

		System.out.printf("A: ");
		a = sc.nextInt();
		System.out.printf("B: ");
		b = sc.nextInt();

		System.out.println("Max = " + Math.max(a, b));
		System.out.println("Min = " + Math.min(a, b));
		System.out.println("A mũ B = " + Math.pow(a, b));
		System.out.println("Can bac 2 cua A = " + Math.sqrt(a));

	}

}
