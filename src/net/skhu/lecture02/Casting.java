package net.skhu.lecture02;


class Parent {
    String name;

    Parent(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Child extends Parent {
    int age;

    Child(String name, int age) {
        super(name); // 부모 클래스 생성자 호출
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}

public class Casting {

    public static void main(String[] args) {
        Parent p;
        Child c;

        p = new Parent("부모1");
        c = new Child("아들1", 18);
        p = new Child("아들2", 16); // up casting 에러 x

        //c = new Parent();  <- down casting 은 에러 o
        //c = p;

        System.out.println(p);
        System.out.println(c);
    }
}
