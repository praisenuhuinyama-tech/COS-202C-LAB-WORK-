//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 6
//TASK 6.3
//Studentvalidation.java

public class TestValidation {
    public static void main(String[] args) {
        Student s1 = new Student("Ada", 101, 85);
        System.out.println(s1);

        s1.setScore(-10);
        s1.setId(-5);

        System.out.println(s1);

        s1.setScore(95);
        System.out.println(s1);
    }
}

class Student {
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
        if (id < 0) {
            System.out.println("Error: ID cannot be negative!");
        } else {
            this.id = id;
        }
    }

    public void setScore(double score) {
        if (score < 0) {
            System.out.println("Error: Score cannot be negative!");
        } else {
            this.score = score;
        }
    }

    public String toString() {
        return "Student [Name: " + name + ", ID: " + id + ", Score: " + score + "]";
    }
}