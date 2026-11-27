//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 6
//TASK 6.2
//Student.java

public class Student {
    private String name;
    private int id;
    private double score;

    public Student(String name, int id, double score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String toString() {
        return "Student [Name: " + name + ", ID: " + id + ", Score: " + score + "]";
    }
}
public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Ada", 101, 85);
        Student s2 = new Student("Chidi", 102, 72);
        Student s3 = new Student("Fatima", 103, 90);
        Student s4 = new Student("Emeka", 104, 65);
        Student s5 = new Student("Inyama", 105, 78);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}