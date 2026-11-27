//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 6
//TASK 6.6
//ClassList.java

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

    public String toString() {
        return "Student [Name: " + name + ", ID: " + id + ", Score: " + score + "]";
    }
}

public class ClassList {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Ada", 101, 85);
        students[1] = new Student("Chidi", 102, 72);
        students[2] = new Student("Fatima", 103, 90);
        students[3] = new Student("Emeka", 104, 65);
        students[4] = new Student("Inyama", 105, 78);
        students[5] = new Student("Tunde", 106, 88);
        students[6] = new Student("Aisha", 107, 95);
        students[7] = new Student("Kunle", 108, 60);
        students[8] = new Student("Ngozi", 109, 82);
        students[9] = new Student("Olu", 110, 70);

        Student top = students[0];
        double sum = 0;

        for (int i = 0; i < students.length; i++) {
            sum += students[i].getScore();
            if (students[i].getScore() > top.getScore()) {
                top = students[i];
            }
        }

        double average = sum / students.length;

        System.out.println("Highest score: " + top);
        System.out.println("Class average: " + average);
    }
}