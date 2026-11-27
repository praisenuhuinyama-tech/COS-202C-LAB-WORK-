//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 3
//TASK 3.7
//RobustFiletotals.java

public class RobustFileTotals {
    public static void main(String[] args) {
        int[] scores = {78, 55, 92, 65, 88, 95, 75, 81, 90, 69};

        boolean fileExists = true;

        if (!fileExists) {
            System.out.println("Sorry, scores.txt was not found.");
            System.out.println("Please create the file and try again.");
            return;
        }

        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int count = scores.length;

        for (int score : scores) {
            sum += score;
            if (score > largest) {
                largest = score;
            }
        }

        double average = (double) sum / count;

        System.out.println("File found! Calculating...");
        System.out.println("Sum: " + sum);
        System.out.println("Largest: " + largest);
        System.out.println("Average: " + String.format("%.2f", average));
    }
}