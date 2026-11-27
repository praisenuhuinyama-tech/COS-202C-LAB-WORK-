//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 6
//TASK 6.5
//Student.java

class Student {
    private String name;
    private int id;
    private double score;
    private static int count = 0;

    public Student(String name, int id, double score) {
        this.name = name;
        this.id = id;
        this.score = score;
        count++;
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

    public static int getCount() {
        return count;
    }

    public String toString() {
        return "Student [Name: " + name + ", ID: " + id + ", Score: " + score + "]";
    }
}

public class TestCount {
    public static void main(String[] args) {
        Student s1 = new Student("Ada", 101, 85);
        Student s2 = new Student("Chidi", 102, 72);
        Student s3 = new Student("Fatima", 103, 90);

        System.out.println("Total students created: " + s1.getCount());
    }
}