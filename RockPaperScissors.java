import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playerA;
        String playerB;
        String playAgain;

        do {
            // Get Player A's move
            do {
                System.out.print("Player A - Enter your move (R, P, S): ");
                playerA = input.nextLine();
            } while (!isValidMove(playerA));

            // Get Player B's move
            do {
                System.out.print("Player B - Enter your move (R, P, S): ");
                playerB = input.nextLine();
            } while (!isValidMove(playerB));

            // Show result
            showResult(playerA, playerB);

            // Ask to play again
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = input.nextLine();
        } while (playAgain.equalsIgnoreCase("Y"));

        input.close();
    }

    public static boolean isValidMove(String move) {
        return move.equalsIgnoreCase("R") ||
                move.equalsIgnoreCase("P") ||
                move.equalsIgnoreCase("S");
    }

    public static void showResult(String a, String b) {
        a = a.toUpperCase();
        b = b.toUpperCase();

        if (a.equals(b)) {
            System.out.println(a + " vs " + b + " — It’s a Tie!");
            return;
        }

        switch (a) {
            case "R":
                if (b.equals("S")) {
                    System.out.println("Rock breaks Scissors — Player A wins!");
                } else {
                    System.out.println("Paper covers Rock — Player B wins!");
                }
                break;
            case "P":
                if (b.equals("R")) {
                    System.out.println("Paper covers Rock — Player A wins!");
                } else {
                    System.out.println("Scissors cuts Paper — Player B wins!");
                }
                break;
            case "S":
                if (b.equals("P")) {
                    System.out.println("Scissors cuts Paper — Player A wins!");
                } else {
                    System.out.println("Rock breaks Scissors — Player B wins!");
                }
                break;
        }
    }
}