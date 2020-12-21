package net.skhu.lecture02;

public class NullableInteger {

	public static void main(String[] args) {

		Integer intObj1 = 23, intObj2 = null;

		int intValue1 = intObj1.intValue();
		int intValue2 = intObj1; // unboxing
		// intObj1이 null이면 error

		int intValue3 = (intObj2 == null) ? 0 : intObj2.intValue();
		int intValue4 = (intObj2 == null) ? 0 : intObj2;

		System.out.printf("%d %d %d %d\n", intValue1, intValue2, intValue3, intValue4);

	}
}
