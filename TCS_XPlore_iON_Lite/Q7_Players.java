package TCS_XPlore_iON_Lite;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Q7_Players {

    public static void main(String[] args) {
        //code to read values
        Scanner sc = new Scanner(System.in);
        int count = 4;
        Player[] players = new Player[count];
        for (int i = 0; i < count; i++) {
            int playerId = sc.nextInt();
            String playerName = sc.next();
            int iccRank = sc.nextInt();
            int noOfMatchesPlayed = sc.nextInt();
            int totalRunsScored = sc.nextInt();
            players[i] = new Player(playerId, playerName, iccRank, noOfMatchesPlayed, totalRunsScored);


        }
        int target = sc.nextInt();

        //code to call required method
        double[] arr = findAverageScoreOfPlayers(players, target);

        //code to calculate Grade and display the results
        for (double x : arr) {
            if (x >= 80)
                System.out.println("Grade A Player");
            else if (x >= 50 && x <= 79)
                System.out.println("Grade B Player");
            else
                System.out.println("Grade C Player");
        }

    }

    public static double[] findAverageScoreOfPlayers(Player[] player, int totalMatches) {
        //method logic
        List<Double> list = new LinkedList<>();
        for (Player p : player) {
            if (p.noOfMatchesPlayed >= totalMatches) {
                double runrate = ((double) p.totalRunsScored) / p.noOfMatchesPlayed;
                list.add(runrate);
            }

        }

        double[] avgs = new double[list.size()];
        for (int i = 0; i < avgs.length; i++)
            avgs[i] = list.get(i);

        return avgs;

    }
}

class Player {
    //code to build player class
    int playerId;
    String playerName;
    int iccRank;
    int noOfMatchesPlayed;
    int totalRunsScored;

    public Player(int playerId,
                  String playerName,
                  int iccRank,
                  int noOfMatchesPlayed,
                  int totalRunsScored) {

        this.playerId = playerId;
        this.playerName = playerName;
        this.iccRank = iccRank;
        this.noOfMatchesPlayed = noOfMatchesPlayed;
        this.totalRunsScored = totalRunsScored;
    }
}

