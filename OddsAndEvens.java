
import java.util.*;

public class OddsAndEvens {

    public static void main(String[] args) {

        //part 1. setup the program;
        String playerSelection="";
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play a game called \" Odds and Evens\" ");
        System.out.print("What is your name? ");
        String playerName = input.nextLine();
        System.out.println("Hi " + playerName + ", which do you choose? (O)dds or (E)vens? ");
        playerSelection = input.nextLine();
        if (playerSelection.equalsIgnoreCase("O")) {
            System.out.println(playerName + " has picked odds! The computer will be evens.");
        } else {
            System.out.println(playerName + " has picked evens! The computer will be odds.");
        }
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println();

        //part 2. get inputs;
        int fingers = 0;
        int computer = 0;
        System.out.print("How many \"fingers\" do you put out? ");
        fingers = input.nextInt();
        Random rand = new Random();
        computer = rand.nextInt(6);
        System.out.println("The computer plays +" + computer + " \"fingers\"");
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println();

        //part 3. get results;
        boolean oddOrEven;
        int sum = fingers + computer;
        System.out.println(fingers + " + " + computer + " = " + sum);
        oddOrEven = sum % 2 == 0;
        if (oddOrEven) {
            System.out.println(sum + " is ...even!");
            if (playerSelection.equalsIgnoreCase("e")) {
                System.out.println("That means " + playerName + " wins!");
            } else{
                System.out.println("That means computer wins!");
            }
            } else {
            System.out.println(sum + " is ...odd!");
            if (playerSelection.equalsIgnoreCase("o")) {
                System.out.println("That means " + playerName + " wins!");
            } else{
                System.out.println("That means computer wins!");
            }
        }
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    }


