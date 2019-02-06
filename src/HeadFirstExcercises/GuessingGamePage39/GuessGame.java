package HeadFirstExcercises.GuessingGamePage39;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    //GuessGame has three instance variables for the three player objects

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        //Three Player objects are created and assigned to the three instance variables

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        //Three variables are created to hold the three guesses the player makes

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        //Three variables to hold a true or false based on the players answer

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");
        //Create a target number by picking a random number that the players have to guess

        while (true) {
            System.out.println("Number to guess is " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);
            //Get each player's guess by running the guess() method

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            //Check to see if each player's guess matches the target number, if right set the variable to true

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over.");
                break; //Game is over so break out of the loop

            }
            else{
                System.out.println("Players will have to try again.");
            }//end if/else
        }//end Loop
    }//end Method
}//end Class
