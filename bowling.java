/* 
You are creating a bowling game!
    The given code declares a Bowling class with its constructor and addPlayer() method.
    Each player of the game has a name and points, and are stored in the players HashMap.
    The code in main takes 3 players data as input and adds them to the game.
    You need to add a getWinner() method to the class, 
    which calculates and outputs the name of the player with the maximum points.

    Sample Input:
        Dave 42
        Amy 103
        Rob 64

    Sample Output:
        Amy 
*/

import java.util.*; 

class bowling {
    HashMap<String, Integer> players;
    bowling() {
        players = new HashMap<>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    //your code goes here
    public void getWinner() {

        String bestPlayer = "";
        Iterator<Map.Entry<String, Integer>> it = players.entrySet().iterator();
        int max = 0;

        while (it.hasNext()) {

            String playerName = it.next().getKey();
            int checkValue = players.get(playerName);

            if (checkValue >= max) {
                max = checkValue;
                bestPlayer = playerName;
            }
        }
        System.out.println(bestPlayer);
    }
}

class Program {
    public static void main(String[] args) {
        bowling game = new bowling();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
        sc.close();
    }
}