package gamebox;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        User user = new User(username);

        System.out.print("How many games do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        for (int i = 1; i <= n; i++) {

            System.out.println("\nGame " + i);
            System.out.print("Enter title: ");
            String title = sc.nextLine();

            System.out.print("Enter genre (Arcade / Strategy): ");
            String genre = sc.nextLine();

            System.out.print("Is it free? (true/false): ");
            boolean isFree = sc.nextBoolean();

            double price = 0;
            if (!isFree) {
                System.out.print("Enter price: ");
                price = sc.nextDouble();
            }

            System.out.print("Enter rating: ");
            double rating = sc.nextDouble();
            sc.nextLine(); // consume newline

            // 🔹 Dynamic polymorphism
            Game game;
            if (genre.equalsIgnoreCase("Arcade")) {
                game = isFree
                        ? new ArcadeGame(title, rating)
                        : new ArcadeGame(title, price, rating);
            } else {
                game = isFree
                        ? new StrategyGame(title, rating)
                        : new StrategyGame(title, price, rating);
            }

            game.playDemo();   // runtime decision
            game.download();

            user.buyGame(game);
        }

        user.showOwnedGames();
        sc.close();
    }
}

