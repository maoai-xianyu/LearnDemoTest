package algorithm.my;

import java.util.HashSet;

/**
 * @author zhangkun
 * @time 2020/6/16 5:42 下午
 */
public class MainSet {
    public static void main(String[] args) {
        HashSet<Person1> set = new HashSet<Person1>();
        Person1 p1 = new Person1("AA", 1001);
        Person1 p2 = new Person1("BB", 1002);

        set.add(p1);
        set.add(p2);
        System.out.println(set);

        p1.name = "CC";//第一处 [Person [name=CC, id=1001], Person [name=BB, id=1002]]
        set.remove(p1);// 第二处
        System.out.println(set);

        set.add(new Person1("CC", 1001));// 第三处
        System.out.println(set);
        set.add(new Person1("AA", 1001));// 第四处
        System.out.println(set);
    }
}

/**
 * [Person [name=AA, id=1001], Person [name=BB, id=1002]]
 * [Person [name=CC, id=1001], Person [name=BB, id=1002]]
 * [Person [name=CC, id=1001], Person [name=CC, id=1001], Person [name=BB, id=1002]]
 * [Person [name=CC, id=1001], Person [name=CC, id=1001], Person [name=AA, id=1001], Person [name=BB, id=1002]]
 */

/**
 * Person类
 * @author minghai
 *
 */
 class Person1 {
    String name;
    int id;
    public Person1(String name, int id) {
        super();
        this.name = name;
        this.id = id;
    }
    public Person1() {
        super();
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", id=" + id + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person1)) {
            return false;
        }
        Person1 p = (Person1) obj;
        return this.id == p.id && this.name.equals(p.name);
    }
    @Override
    public int hashCode() {
        int result = 17;
        result = result * 37 + id;
        result = result * 37 + name.hashCode();
        return result;
    }
}

