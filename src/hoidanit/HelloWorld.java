package hoidanit;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		String name;

		System.out.printf("Name: ");
		name = sc.nextLine();
		System.out.printf("Tuoi: ");
		age = sc.nextInt();

		System.out.println("My name is " + name + ", i am " + age);
		sc.close();
	}

}
