package net.skhu.lecture01.exer01;

// o, O를 단어에서 제거하여 출력

public class Example04 {

	static String removeO(String s) {
		char[] o = new char[] {'o', 'O' };
		int index = 0;

		for(char c : o) {
			if(s.indexOf(c) != -1) {
				index = s.indexOf(c);
				s = s.substring(0, index) + s.substring(index + 1, s.length());
			}
			if(s.lastIndexOf(c) != -1) {
				index = s.lastIndexOf(c);
				s = s.substring(0, index) + s.substring(index + 1, s.length());
			}
		}
		return s;
    }

    public static void main(String[] args) {
        String[] a = new String[] { "One", "Two", "Three", "Four", "Five", "hello world", "yahoo" };
        for (String s : a) {
            String temp = removeO(s);
            System.out.println(temp);
        }
    }

}
