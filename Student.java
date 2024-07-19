public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void introduce(){
        System.out.println("I'm a Student. My name is "+name+" and I'm "+age+" years old.");
    }
}
