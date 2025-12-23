import java.util.Scanner;

public class RockPaperScissors{

    // Method to generate computer choice
    public static String getComputerChoice() {
        int random = (int) (Math.random() * 3);
        //0 for rock, 1 for paper, 2 for scissors
        if (random == 0) return "rock";
        else if (random == 1) return "paper";
        else return "scissors";
    }

    // Method to find winner of a single game
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        }
        //rock will win (rock crushes scissors); rock-paper: paper wins (paper covers rock); scissors-paper: scissors win (scissors cuts paper)
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        }
        return "Computer";
    }

    // Method to calculate stats
    public static String[][] calculatePercent(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];
        //User's details
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", (userWins * 100.0) / totalGames);
        //Computer's details
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", (computerWins * 100.0) / totalGames);
        return stats;
    }

    // Method to display results
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\t\tComputer\tWinner");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" + gameResults[i][0] + "\t\t" + gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }

        System.out.println("\nWin Statistics:");
        System.out.println("Player\tWins\tWin %");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(
                stats[i][0] + "\t" +
                stats[i][1] + "\t" +
                stats[i][2]
            );
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        String[][] results = new String[games][3];

        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < games; i++) {
            //Ask user choice[54321` 
            System.out.print("\nEnter your choice (rock/paper/scissors): ");
            String userChoice = sc.next().toLowerCase();
            //Choose random computer choice
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);
            //Select Winner
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            //Store result
            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;
        }

        String[][] stats = calculatePercent(userWins, computerWins, games);
        displayResults(results, stats);

        sc.close();
    }
}
