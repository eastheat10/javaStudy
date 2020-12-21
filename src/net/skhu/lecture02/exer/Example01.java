package net.skhu.lecture02.exer;

public class Example01 {

	static int count = 5;
	static Object[] obj = new Object[count * 2];
	static int i = 0;

	static void addData(int count) {
		for(int i = 0; i < count; i++) {
			obj[2 * i + 1] = String.valueOf(i);
			obj[2 * i] = i;
		}
	}

	static int findIndex(int value) {

		for(i = 0; i < count; i++) {
			if(obj[2 * i].equals(i))
				break;

		}return i;
	}


	static int findIndex(String value) {

		for(i = 0; i < count; i++) {
			if(obj[2 * i + 1].equals(value))
				break;

		}return i;
	}

	public static void main(String[] args) {

		addData(count);
		System.out.println(obj[1]);
	}
}
