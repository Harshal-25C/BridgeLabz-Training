//Import java util package to access Scanner Class
import java.util.*;

public class RockPaperScissors{
    //Method to generate computer choice using Math.random()
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);

        if(choice==0)
            return "rock";
        else if(choice==1)
            return "paper";
        else
            return "scissors";
    }

    //Method to find winner between user and computer
    public static String findWinner(String user, String computer){
        if(user.equals(computer)){
            return "Draw";
        }
        if((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        }else{
            return "Computer";
        }
    }

    //Method to calculate wins and percentages
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames){
        String[][] stats = new String[2][3];

        double userPercent=((double) userWins/totalGames)*100;
        double computerPercent=((double) computerWins/totalGames)*100;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerPercent);

        return stats;
    }

    //Method to display game results and statistics
    public static void displayResults(String[][] games, String[][] stats){

        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\tComputer\tWinner");
        System.out.println("----------------------------------------");

        for(int i=0; i<games.length; i++){
            System.out.println((i + 1) + "\t" + games[i][0] + "\t" +
                               games[i][1] + "\t\t" + games[i][2]);
        }

        System.out.println("\nWin Statistics:");
        System.out.println("Player\tWins\tWinning %");
        System.out.println("-----------------------------");

        for(int i=0; i<stats.length; i++){
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int gamesCount = sc.nextInt();

        String[][] games = new String[gamesCount][3];

        int userWins = 0;
        int computerWins = 0;

        for(int i=0; i<gamesCount; i++){
            System.out.print("Game " + (i + 1) + " - Enter rock/paper/scissors: ");
            String userChoice = sc.nextLine().toLowerCase();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            games[i][0] = userChoice;
            games[i][1] = computerChoice;
            games[i][2] = winner;

            if(winner.equals("User")){
                userWins++;
            }else if(winner.equals("Computer")){
                computerWins++;
            }
        }
        String[][] stats = calculateStats(userWins, computerWins, gamesCount);
        displayResults(games, stats);
    }
}
