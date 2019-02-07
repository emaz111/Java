package Term2.Week12; /**
 * Created by u1859269 on 17/01/2019.
 */
import java.util.ArrayList;
import java.util.Collections;

public class League {


    private static final String TEAM_NAME = "Poppleton Dogs Home";

    private ArrayList <Team> fundRaisers;

    public League () {
        fundRaisers = new ArrayList<> ();
    }

    public void addTeam (Team fr) {
        this.fundRaisers.add (fr);
    }

    public void sortTeam () {
        Collections.sort (this.fundRaisers);
    }

    public double getTotalPoints () {

        double totalPoints = 0.0;

        for (Team fr : fundRaisers) {
            totalPoints += fr.getMatchPoints ();
        }

        return totalPoints;
    }

    private void printTeamHeader () {
        System.out.println (TEAM_NAME);
        for (int i = 0; i < TEAM_NAME.length (); i ++) {
            System.out.print ("=");
        }

        System.out.println ();
    }

    public void printTeam () {

        if (this.fundRaisers.isEmpty ()) {
            System.out.println ("No fund raisers in this team.");
        }
        else {
            printTeamHeader ();

            System.out.println ();

            for (Team fr : fundRaisers) {
                fr.printFormatted ();
            }
        }
    }
}