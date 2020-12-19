package net.skhu.lecture01;

public class Test01 {
	public static void main(String[] args) {

		int a = 3;
		method1(a);

		Person p = new Person("동열", 24);
		p.age = 3;
		method2(p);

		String s = "hello";
		method3(s);

		System.out.println("a: " + a);
		System.out.println("p.age: " + p.age);
		System.out.println("s: " + s);

	}

	public static int method1(int a) {
		a++;
		return a;
	}

	public static void method2(Person p) {
		p.age++;
	}

	public static void method3(String s) {
		s = "world";
	}
}
