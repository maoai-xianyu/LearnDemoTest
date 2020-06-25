package algorithm.my.copy;

import java.util.HashSet;
import java.util.Objects;

public class Parent implements Cloneable {

    String name = "";
    int age = 0;

    Parent(String n, int age) {
        this.name = n;
        this.age = age;
    }

    public void setName(String na) {
        name = na;
    }

    @Override
    protected Parent clone() {
        Parent clone = null;
        try {
            clone = (Parent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e); // won't happen
        }

        return clone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parent parent = (Parent) o;
        return age == parent.age &&
                Objects.equals(name, parent.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String toString() {
        return "Parent[" + name + "===" + age + "];";
    }


    public static void main(String[] args) {
        Parent item1 = new Parent("john", 10);
        Parent item2 = item1.clone();

        System.out.println("parent1 = " + item1.toString());
        System.out.println("parent2 = " + item2.toString());

        System.out.println(item1 == item2); //地址不一样
        System.out.println(item1.equals(item2)); // 复写 equals 和 hashCode


        HashSet<Parent> parents = new HashSet<>();
        Parent p1 = new Parent("zk",1);
        Parent p2 = new Parent("zk2",1);
        System.out.println(p1 == p2);
        parents.add(p1);
        parents.add(p2);
        System.out.println(parents);
        System.out.println("--------");
        p1.name = "dd";
        System.out.println(parents);
        System.out.println("---- remove p1----");
        parents.remove(p1);
        System.out.println(parents);
        System.out.println("--------");
        Parent p3 = new Parent("zk",1);
        parents.add(p3);
        System.out.println(parents);

    }
}  