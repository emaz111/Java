package HeadFirstExcercises.DotComGame;

public class SimpleDotComTestDrive {

    public static void main(String[] args){
        SimpleDotCom dot = new SimpleDotCom();
        //Creates a dot object using the SimpleDotCom class
        int [] locations = {2,3,4};
        //Creates a locations array and stores the numbers
        dot.setLocationCells(locations);
        //Sets the locations of the cells by calling the setlLocationCells method and passing the array values as arguments to the parameter
        String userGuess = "2";
        //The user makes a guess of 2 and stores it into the userGuess variable
        String result = dot.checkYourself(userGuess);
        //the object calls the checkYourself method and passes the user's guess as an argument to the parameter in the method
        //All of this is stored in the result variable
    }

}
