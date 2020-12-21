package net.skhu.lecture02;

public class Unboxing {

	public static void main(String[] args) {

        int i = 3;
        Integer obj1 = i; // Integer obj1 = new Integer(1);
        int j = obj1; // int j = obj1.intValue();
        // Integer class의 intValue 메소드는 int 값 return
        // 객체가 기본자료형을 리턴하는 기능 -> auto unboxing

        // autoboxing: 자동으로 객체 만들어주는 기능
        // unboxing: 자동으로 기본자료형으로 만들어줌

        double d = 3.14;
        Double obj2 = d;
        double f = d;

        System.out.printf("%d %d %d\n", i, obj1, j);
        System.out.printf("%f %f %f\n", d, obj2, f);
    }

}
