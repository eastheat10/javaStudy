package net.skhu.lecture01.exer01;

// lastIndexOf, substring, split 메소드 이용해서 경로에서 파일명 찾기

public class Example03 {

	static String getFileName1(String path) {
		int slash = path.lastIndexOf("/");
		String s = path.substring(slash + 1, path.length());
		return s;
	}

	static String getFileName2(String path) {

		String[] pathArray = path.split("/");
		return pathArray[pathArray.length - 1];

	}

	public static void main(String[] args) {
		String[] a = { "c:/data/student/lecture.docx",
					   "c:/www/mainpage.html",
					   "c:/program files/java/javac.exe" };
		for (String s : a) {
			String fileName1 = getFileName1(s);
			String fileName2 = getFileName2(s);
			System.out.printf("%s, %s\n", fileName1, fileName2);
		}
	}
}
