package Demo6;

public class Test1 {
    public static void main(String[] args) {
        Student stu1 = new Student(1, "a", 18);
        Student stu2 = new Student(1, "a", 18);
        Student stu3 = new Student(1, "b", 18);
        System.out.println(stu1.equals(stu2));
        System.out.println(stu1.equals(stu3));
    }

}




