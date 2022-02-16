package fr.cesi;

import java.util.Scanner;

public class Main {
    private static final int max = 6;
    private static final int min = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int gameCount = 0;

            System.out.print("Enter name for player 1 : ");
            Player player1 = new Player(scanner.nextLine());
            System.out.print("Enter name for player 2 : ");
            Player player2 = new Player(scanner.nextLine());

            Player[] playerList = new Player[2];
            playerList[0] = player1;
            playerList[1] = player2;

            StringBuilder resultString = new StringBuilder("\nNew game \n");

            do {
                for (Player player : playerList) {
                    int newNumber = player.generateNumber(min, max);
                    gameCount += newNumber;
                    player.setCount(gameCount);

                    resultString.append(String.format("%10s", player.getName()))
                            .append(" throw the dice and get ")
                            .append(String.format("%2d", newNumber))
                            .append(". Total score is ")
                            .append(String.format("%3d \n", gameCount));

                    if (gameCount > 21) {
                        resultString.append("\n")
                                .append(player.getName())
                                .append(" won with ")
                                .append(player.getCount())
                                .append(".\n");
                        break;
                    }
                }
            } while (gameCount < 21);

            System.out.print(resultString);

            System.out.print("Do you want to start a new game ? (y/n) : ");
            switch (scanner.nextLine()) {
                case "y":
                    break;
                case "n":
                    return;
                default:
            }
        }
    }
}
