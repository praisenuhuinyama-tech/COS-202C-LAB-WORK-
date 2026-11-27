//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 2
//TASK 2.4
//TimeConverter.java

public class TimeConverter {
    public static void main(String[] args) {
        int totalSeconds = 10000;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println(totalSeconds + " seconds = " + hours + "h " + minutes + "m " + seconds + "s");
    }
}