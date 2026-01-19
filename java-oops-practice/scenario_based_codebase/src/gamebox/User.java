package gamebox;

import java.util.ArrayList;
import java.util.List;

class User {
    private String username;
    private List<Game> ownedGames = new ArrayList<>();

    public User(String username) {
        this.username = username;
    }

    public void buyGame(Game game) {
        ownedGames.add(game);
        System.out.println(username + " purchased " + game.title);
    }

    public void showOwnedGames() {
        System.out.println("\nGames owned by " + username + ":");
        for (Game g : ownedGames) {
            g.showDetails();
        }
    }
}

