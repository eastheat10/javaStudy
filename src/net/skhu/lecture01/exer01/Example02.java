package net.skhu.lecture01.exer01;

// charAt 메소드 사용하여 자음 개수확인

public class Example02 {

	static int getVowelCount(String s) {

		int count = 0;
		char[] vowel = new char[] {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

		for (int i = 0; i < s.length(); i++) {
			for(char c : vowel) {
				if(s.charAt(i) == c)
					count++;
			}
		} return count;
	}


	public static void main(String[] args) {

		String[] a = new String[] { "One", "Two", "Three", "Four", "Five", "hello world" };

		for (String s : a) {
			int count = getVowelCount(s);
			System.out.printf("%s %d\n", s, count);
		}

	}
}
