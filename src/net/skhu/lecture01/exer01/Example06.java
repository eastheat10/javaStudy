package net.skhu.lecture01.exer01;

// String 메소드를 사용하여 공백제거
// split1: String.replace, String.split 사용
// split2: String.split, String.trim 사용

public class Example06 {
	static String[] split1(String s) {
		s = s.replace(" ", "");
		String[] str = s.split(",");
		return str;
	}

	static String[] split2(String s) {
		String[] str = s.split(",");
		int i = 0;
		for(String s1 : str) {
			str[i] = s1.trim();
			i++;
		}
		return str;
	}

	public static void main(String[] args) {
		String s = "One, Two ,Three , Four,Five";
		String[] a1 = split1(s);
		for (String t : a1)
			System.out.printf("[%s]\n", t);
		System.out.println("");
		String[] a2 = split2(s);
		for (String t : a2)
			System.out.printf("[%s]\n", t);
	}
}
