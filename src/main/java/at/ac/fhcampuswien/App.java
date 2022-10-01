package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1: ");
        int x = sc.nextInt();

        if (x <= 0) {
            System.out.println("No number entered.");
            return;
        }

        System.out.print("Number 2: ");
        int x2 = sc.nextInt();
        int y = Math.max(x, x2); // max out of 1st and 2nd

        if (x2 <= 0)
        {
            System.out.println("No number entered.");
            return;
        }

        System.out.print("Number 3: ");
        x2 = sc.nextInt();
        double z = Math.max(x2, y); // max out of 2nd and 3rd

        if (z >= 0)
        {
            System.out.printf("The largest number is " + "%.2f" + "%n", z);
        } else
        {
            System.out.println("No number entered.");
            return;
        }

    }

    //todo Task 2
    public void stairs(){
        // input your solution here
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}