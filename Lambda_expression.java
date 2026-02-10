package Lambda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student {
    int R_no;
    String Name;
    int age;
    float fees;

    public Student(int r_no, String name, int age, float fees) {
        R_no = r_no;
        Name = name;
        this.age = age;
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Student [R_no=" + R_no + ", Name=" + Name + ", age=" + age + ", fees=" + fees + "]";
    }
}
class LambdaExample {
    public static void main(String[] args) {

        List<Student> s = new ArrayList<>();

        s.add(new Student(1, "adc", 21, 200000.00f));
        s.add(new Student(2, "opa", 22, 200000.00f));
        s.add(new Student(3, "yui", 23, 300000.00f));
        s.add(new Student(4, "tyu", 24, 400000.00f));
        s.add(new Student(5, "ert", 25, 500000.00f));

        System.out.println("Sorting on the basis of name");
        Collections.sort(s, (s1, s2) -> s1.Name.compareTo(s2.Name));
        s.forEach(System.out::println);

        System.out.println("\nSorting on the basis of age");
        Collections.sort(s, (s1, s2) -> s1.age - s2.age);
        s.forEach(System.out::println);

        System.out.println("\nSorting on the basis of fees");
        Collections.sort(s, (s1, s2) -> Float.compare(s1.fees, s2.fees));
        s.forEach(System.out::println);
    }
}
