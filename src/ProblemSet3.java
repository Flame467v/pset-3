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

      final double GPA_A = 4.00;
      final double GPA_B = 3.00;
      final double GPA_C = 2.00;
      final double GPA_D = 1.00;
      final double GPA_F = 0.00;
      final double fracdif = 0.33;

      String op = "";
      double gpa = 0.00;

      System.out.print("\nEnter a letter grade: ");
      String gpaLetter = in.nextLine();
      gpaLetter = gpaLetter.trim();
      gpaLetter = gpaLetter.toUpperCase();
      String letter2 = gpaLetter.substring(0, 1);


      if(gpaLetter.length() == 2) {
        op = gpaLetter.substring(1, 2);
      }
      if(gpaLetter.length() <= 2 && gpaLetter.length() > 0 && (letter2.equals("A") || letter2.equals("B") || letter2.equals("C") || letter2.equals("D") ||
      letter2.equals("F")) && (op.equals("") || op.equals("+") || op.equals("-")) && !gpaLetter.equals("F+") && !gpaLetter.equals("F-")) {


        if(op.equals("+")) {
          gpa += fracdif;
        }
        else if(op.equals("-")) {
          gpa -= fracdif;
        }

        if(letter2.equals("A")) {
          gpa += GPA_A;

          if(gpa > 0) {
            gpa -= fracdif;
          }
        }
        else if(letter2.equals("B")) {
          gpa += GPA_B;
        }
        else if(letter2.equals("C")) {
          gpa += GPA_C;
        }
        else if(letter2.equals("D")) {
          gpa += GPA_D;
        }
        else if(letter2.equals("F")) {
          gpa += GPA_F;

          if(gpa < 0) {
            gpa += fracdif;
          }
        }
        System.out.printf("\nYour GPA is %.2f.\n", gpa);
      }

      else {
        System.out.println("\nThat's not a valid letter grade.");
      }
    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a grade. What's the canvcorresponding letter grade?
     */

    public void grade() {

      final double GRADEA = 100;
      final double ALOW = 90;
      final double GRADEB = 89;
      final double BLOW = 80;
      final double GRADEC = 79;
      final double CLOW = 70;
      final double GRADED = 69;
      final double DLOW = 60;
      final double GRADEF = 59;
      final double FLOW = 0;
      char lettorgrade = 'p';
      String aan = "";

      System.out.print("\nEnter a grade: ");
      double numberGrade = in.nextDouble();

      if(numberGrade >= FLOW && numberGrade <= GRADEA) {

        if(numberGrade >= ALOW && numberGrade <= GRADEA) {
          lettorgrade = 'A';
          aan = "an";
        }
        else if(numberGrade >= BLOW && numberGrade <= GRADEB) {
          lettorgrade = 'B';
          aan = "a";
        }
        else if(numberGrade >= CLOW && numberGrade <= GRADEC) {
          lettorgrade = 'C';
          aan = "a";
        }
        else if(numberGrade >= DLOW && numberGrade <= GRADED) {
          lettorgrade = 'D';
          aan = "a";
        }
        else if(numberGrade >= FLOW && numberGrade <= GRADEF) {
          lettorgrade = 'F';
          aan = "an";
        }
        System.out.printf("\nYou received " + aan + " " + lettorgrade +  ".\n");
      }

      else if(numberGrade < FLOW) {
        System.out.println("\nGrades below 0 are invalid.");
      }
      else if(numberGrade > 100) {
        System.out.println("\nGrades above 100 are invalid.");
      }
    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {

      String finalrank = "";
      String finalsuit = "";

      System.out.print("\nEnter a card: ");
      String useri = in.nextLine();
      String rank = useri.substring(0, 1).toUpperCase();
      String suit = useri.substring(1, 2).toUpperCase();



      if(useri.length() == 2 && (rank.equals("2") || rank.equals("3") || rank.equals("4") || rank.equals("5") || rank.equals("6") || rank.equals("7") ||
       rank.equals("8") || rank.equals("9") || rank.equals("T") || rank.equals("J") || rank.equals("Q") || rank.equals("K") || rank.equals("A")) && (suit.equals("C") ||
       suit.equals("H") || suit.equals("D") || suit.equals("S"))) {

        if (rank.equals("2")) {
          finalrank = "Two";
        }
        else if (rank.equals("3")) {
          finalrank = "Three";
        }
        else if (rank.equals("4")) {
          finalrank = "Four";
        }
        else if (rank.equals("5")) {
          finalrank = "Five";
        }
        else if (rank.equals("6")) {
          finalrank = "Six";
        }
        else if (rank.equals("7")) {
          finalrank = "Seven";
        }
        else if (rank.equals("8")) {
          finalrank = "Eight";
        }
        else if (rank.equals("9")) {
          finalrank = "Nine";
        }
        else if (rank.equals("T")) {
          finalrank = "Ten";
        }
        else if (rank.equals("J")) {
          finalrank = "Jack";
        }
        else if (rank.equals("Q")) {
          finalrank = "Queen";
        }
        else if (rank.equals("K")) {
          finalrank = "King";
        }
        else if (rank.equals("A")) {
          finalrank = "Ace";
        }


        if (suit.equals("C")) {
          finalsuit = "Clubs";
        }
        else if (suit.equals("D")) {
          finalsuit = "Diamonds";
        }
        else if (suit.equals("H")) {
          finalsuit = "Hearts";
        }
        else if (suit.equals("S")) {
          finalsuit = "Spades";
        }


        System.out.println("\n" + finalrank + " of " + finalsuit + ".");
      }

      else if(useri.length() != 2) {
        System.out.println("\nThat's not a valid card.");
      }
      else if(!(rank.equals("2") || rank.equals("3") || rank.equals("4") || rank.equals("5") || rank.equals("6") || rank.equals("7") || rank.equals("8") ||
      rank.equals("9") || rank.equals("T") || rank.equals("J") || rank.equals("Q") || rank.equals("K") || rank.equals("A")) && !(suit.equals("C") || suit.equals("H") ||
      suit.equals("D") || suit.equals("S"))) {
        System.out.println("\nThat's not a valid rank or a valid suit.");
      }
      else if(!(rank.equals("2") || rank.equals("3") || rank.equals("4") || rank.equals("5") || rank.equals("6") || rank.equals("7") || rank.equals("8") || rank.equals("9") ||
      rank.equals("T") || rank.equals("J") || rank.equals("Q") || rank.equals("K") || rank.equals("A"))) {
        System.out.println("\nThat's not a valid rank.");
      }
      else if(!(suit.equals("C") || suit.equals("H") || suit.equals("D") || suit.equals("S"))) {
        System.out.println("\nThat's not a valid suit.");
      }
      }
    

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {

        String yesno = "";

          System.out.print("\nEnter a year: ");
          int leapyear = in.nextInt();

          if (leapyear % 4 == 0 && (leapyear % 100 != 0 | leapyear % 400 == 0)) {
            yesno = " is ";
          }
          else {
            yesno = " is not ";
          }

          System.out.println("\n" + leapyear + yesno + "a leap year.");
    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {

      final double FAHRFREEZE = 32;
      final double FAHRBOIL = 212;
      final double CELSFREEZE = 0;
      final double CELSBOIL = 100;

      System.out.print("\nEnter a temperature: ");
      double temperature = in.nextDouble();

      System.out.print("Enter a scale: ");
      in.nextLine();
      String scale = in.nextLine();
      scale = scale.toUpperCase();
      String state = "";


      if (scale.equals("F") || scale.equals("C")) {

        if (scale.equals("F")) {

          if (temperature <= FAHRFREEZE) {
            state = "Solid.";
          }
          else if (temperature > FAHRFREEZE && temperature < FAHRBOIL) {
            state = "Liquid.";
          }
          else if (temperature >= FAHRBOIL) {
            state = "Gas.";
          }
        }

        else if (scale.equals("C")) {
          if (temperature <= CELSFREEZE) {
            state = "Solid.";
          }
          else if (temperature > CELSFREEZE && temperature < CELSBOIL) {
            state = "Liquid.";
          }
          else if (temperature >= CELSBOIL) {
            state = "Gas.";
          }
        }

        System.out.println("\n" + state);
      }
      else {
        System.out.println("\nThat's not a valid scale.");
      }
    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {

      System.out.print("\nEnter a month: ");
      String month = in.nextLine();
      month = month.toLowerCase();

      if (month.equals("jan") || month.equals("janu") || month.equals("january")) {
        System.out.println("\n31 days.");
      }
      else if (month.equals("feb") || month.equals("febr") || month.equals("february")) {
        System.out.println("\n28 or 29 days.");
      }
      else if (month.equals("mar") || month.equals("marc") || month.equals("march")) {
        System.out.println("\n31 days.");
      }
      else if (month.equals("apr") || month.equals("apri") || month.equals("april")) {
        System.out.println("\n30 days.");
      }
      else if (month.equals("may")) {
        System.out.println("\n31 days.");
      }
      else if (month.equals("jun") || month.equals("june")) {
        System.out.println("\n30 days.");
      }
      else if (month.equals("jul") || month.equals("july")) {
        System.out.println("\n31 days.");
      }
      else if (month.equals("aug") || month.equals("augu") || month.equals("august")) {
        System.out.println("\n31 days.");
      }
      else if (month.equals("sep") || month.equals("sept") || month.equals("september")) {
        System.out.println("\n30 days.");
      }
      else if (month.equals("oct") || month.equals("octo") || month.equals("october")) {
        System.out.println("\n31 days.");
      }
      else if (month.equals("nov") || month.equals("nove") || month.equals("november")) {
        System.out.println("\n30 days.");
      }
      else if (month.equals("dec") || month.equals("dece") || month.equals("december")) {
        System.out.println("\n31 days.");
      }
      else {
        System.out.println("\nThat's not a valid month.");
      }
    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {

          double paymulti = 1.5;

          double ot = 0;

          System.out.print("\nWage: ");
          double wage = in.nextDouble();

          System.out.print("Hours: ");
          double hours = in.nextDouble();

          double otwage = paymulti * wage;

          if (wage >= 0 && hours >= 0) {

            if (hours > 40) {
              double otHours = hours - 40;
              hours = 40;
              ot = otHours * otwage;
            }

            double salary = wage * hours;
            salary += ot;
            System.out.printf("\nYou'll make $%,.2f this week.\n", salary);
          }

          else if (wage < 0 && hours < 0) {
            System.out.println("\nYour wage must be greater than or equal to $0.00/hour and your hours must be greater than or equal to 0.0.");
          }
          else if (wage < 0) {
            System.out.println("\nYour wage must be greater than or equal to $0.00/hour.");
          }
          else if (hours < 0) {
            System.out.println("\nYour hours must be greater than or equal to 0.0.");
          }
    }

}
