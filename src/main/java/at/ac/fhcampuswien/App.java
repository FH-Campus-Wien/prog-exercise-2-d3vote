package at.ac.fhcampuswien;

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

import java.util.Scanner;

public class App {


    //todo Task 1

    public void largestNumber(){
        Scanner sc = new Scanner(System.in);
        double x;
        double y;
        int n = 1;

        System.out.print("Number " + n + ": ");
        n += 1;

        x = sc.nextDouble();
        y = 1;
        if (x < 0 && n == 2)
        {
            System.out.println("No number entered.");
        }

        while (x > 0 && y > 0){
            System.out.print("Number " + n + ": ");
            n += 1;
            y = sc.nextDouble();
            double temp = Math.max(x, y); // TEMP

            if (x > y){
                x = y;
            }
            else
            {
                x = temp;
            }

            if (y <= 0 || x <= 0)
            {
                System.out.printf("The largest number is " + "%.2f" + "%n", temp);
            }
        }
    }

    //todo Task 2
    public void stairs(){
     Scanner sc = new Scanner(System.in);
     System.out.print("n: ");
     int max_row = sc.nextInt();
     int row = 1;
     int d_num = 1; // printed number
     int r_num = 0; // number in a row
     if (max_row > 0) // activation
     {
        while (row <= max_row) {
            System.out.print(d_num + " ");
            d_num += 1;
            r_num += 1;
            if (row == r_num) {
                System.out.print(System.lineSeparator());
                row += 1;
                r_num = 0;
            }
        }
     }
     else // deactivate
     {
        System.out.println("Invalid number!");
     }
    }

    //todo Task 3
    public void printPyramid(){
        for (int r = 6, rn = 0; rn != r; rn += 1){          //int r = 6 Total rows                        //int rn = 0 Row number printed
            for (int sn=0, s = r-rn-1; sn<s; sn+=1)  {      //int sn = 0 Printed space                    //int s = r-rn-1 Total spaces needed in a row
                System.out.print(" ");
            }
            for (int i = 1 + 2*rn, in = 0; in<i; in+=1) {   //int i = 1 + 2*rn Total stars in a row       //int in = 0 Printed Stars in a row
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    //todo Task 4
    public void printRhombus(){
        Scanner scan = new Scanner(System.in);
        System.out.print("h: ");
        int h = scan.nextInt();
        System.out.print("c: ");
        char c = scan.next().charAt(0);
    }

    //todo Task 5
    public void marks(){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int n = 0;
        double avg = 0;
        for(int i = 1; ; i++){
            System.out.print("Mark " + i + ": ");
            int x = scan.nextInt();
            if (x >= 1 && x <= 5) {
                sum += x;
                if (x == 5) {
                    n++;
                }
            } else if (x == 0) {
                i--;
                if (i > 0){
                    avg = (double) sum / (double) i;
                } else {
                    avg = 0;
                }
                System.out.printf("Average: " + "%.2f" + "%n", avg);
                System.out.println("Negative marks: " + n);
                break;
            } else {
                System.out.println("Invalid mark!");
                i--;
            }
        }
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

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