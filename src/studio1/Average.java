package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("Type in a number:");
        int n2 = ap.nextInt("Type in another number:");
        double average = ((double)n1 + (double)n2) / 2;
        System.out.println("Average of " + n1 + " and " + n2 + " is: " + average + ".");
    }

}
