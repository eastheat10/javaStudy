package net.skhu.lecture01.exer01;

// trim, length 메소드 사용

public class Example05 {

	public static void main(String[] args) {
        String[] a = { " the", "world\t ", " \nwar " };

        for (String s : a) {

            System.out.printf("%s %d\n", s.trim(), s.trim().length());
        }
    }

}
