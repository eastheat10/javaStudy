package net.skhu.lecture01.exer01;

// 공백 또는 null 처리
// true true true true true true false 출력해야 함.

public class Example08 {

	public static boolean isNullEmptyBlank(String s) {
		if(s == null || s.isBlank())
			return true;
		else
			return false;
    }

    public static void main(String[] args) {
        String[] a = { null, "", " ", "  ", " \t ", " \t\n", " . "};

        for (String s : a)
            System.out.println(isNullEmptyBlank(s));
    }

}
