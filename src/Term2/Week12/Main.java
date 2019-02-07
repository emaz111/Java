package Term2.Week12; /**
 * Created by u1859269 on 17/01/2019.
 */

public class Main {
        public static void main (String[] args) {

            League rugbyTeam = new League ();

            rugbyTeam.addTeam (new Team("Castleford Tigers", 1, 5,0,0,0,0,0,0));


            rugbyTeam.sortTeam ();
            rugbyTeam.printTeam ();


            System.out.println ();
            System.out.println ("Total Points: " +  rugbyTeam);

        }
    }
