/**
 * Problem Set 3.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */
import java.lang.Math;
import java.util.Scanner;

public class ProblemSet3 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();

        // comment out or uncomment as needed

    ps.sign();          // executes Exercise 1
       ps.parity();        // executes Exercise 2
        ps.ordered();       // executes Exercise 3
     ps.gpa();           // executes Exercise 4
        ps.grade();         // executes Exercise 5
       ps.cards();         // executes Exercise 6
        ps.leapYear();      // executes Exercise 7
        ps.state();         // executes Exercise 8
       ps.months();        // executes Exercise 9
        ps.salary();        // executes Exercise 10

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */

    public void sign() {

      System.out.print("\nEnter an integer: ");
              int posneg = in.nextInt();
              if (posneg < 0) {
                System.out.print("\nNegative.\n");
              } else if (posneg==0){
                System.out.print("\nZero.\n");

              }
              else {
                System.out.print("\nPositive.\n");
              }
    }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter an integer. Is it even or odd?
     */

    public void parity() {
      System.out.print("\nEnter an integer: ");
              int eveodd = in.nextInt();

              if (eveodd%2==0) {
                  System.out.print("\nEven.\n");
              }
              else {
                  System.out.print("\nOdd.\n");
              }
    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter three integers. How are the integers ordered?
     */

    public void ordered() {
      System.out.print("\nEnter three integers.\n");
        System.out.print("\nEnter integer: ");
          int number1 = in.nextInt();
          System.out.print("\nEnter integer: ");
          int number2 = in.nextInt();
          System.out.print("\nEnter integer: ");
          int number3 = in.nextInt();



          if ((number1 > number2) && (number2 > number3)) {
        System.out.print("\nStrictly decreasing.\n");
          }
          else if ((number1 < number2) && (number2 < number3)) {
          System.out.print("\nStrictly increasing.\n");
          }
          else if ((number1 == number2) && (number2 == number3)) {
        System.out.print("\nUnordered.\n");
          }
          else if ((number1 >= number2) && (number2 >= number3)) {
          System.out.print("\nDecreasing.\n");
          }
          else if ((number1 <= number2) && (number2 <= number3)) {
            System.out.print("\nIncreasing.\n");
          }
          else{
          System.out.print("\nUnordered.\n");
          }


    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */

    public void gpa() {

final double A = 4.00;
final double B = 3.00;
final double C = 2.00;
final double D = 1.00;
final double F = 0.00;


System.out.print("\nEnter a letter grade: ");
boolean tf;
    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a grade. What's the canvcorresponding letter grade?
     */

    public void grade() {

    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {

    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {

    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {

    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {

    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {

    }
}
