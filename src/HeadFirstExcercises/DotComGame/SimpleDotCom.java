package HeadFirstExcercises.DotComGame;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits;

    public void setLocationCells(int[] locs) {
        //New method that uses the int array as an argument and uses a new variable name locs as an argument to store the location cells
        locationCells = locs;
        //Assigns the locs argument to the locationCells variable
    }

    public String checkYourself(String stringGuess) {
        //This method checkYourself uses a parameter stringGuess
        int guess = Integer.parseInt(stringGuess);
        //Converts the guess passed as a string through an argument to an integer
        String result = "miss";
        //Sets a local result string variable with a default value of miss

        for (int cell : locationCells) {
            //For each locations of cells...
            if (guess == cell) {
                //If the guess equals the location of the dotcom within that cell
                result = "hit";
                //Then result will be hit
                numOfHits++;
                //Increment the variable
                break;
                //End loop
            }
        }
        if (numOfHits == locationCells.length) {
            //If the variable equals the length of the number of dotcom locations set in the int array
            result = "kill";
            //Then result is kill
        }
        System.out.println(result);
        //Prints out the result
        return result;
    }
}
