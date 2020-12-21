package net.skhu.lecture02.exer;


class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Example03 {

    public static void main(String[] args) {

    	Object[] b = new Object[3];

    	Person p1 = new Person("임꺽정", 22);
        Person p2 = p1;
        b[0] = new double[] { 1.1, 2.2, 3.3};
        b[1] = new String[] {"a", "b", "c"};
        b[2] = new Object[] {p1, p2};

        Object a = b;

        System.out.println(b);
        System.out.println(a);
    }

}
