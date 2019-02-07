package Term2.Week12; /**
 * Created by u1859269 on 17/01/2019.
 */
import java.text.NumberFormat;
import java.util.Locale;

public class Team implements Comparable <Team> {
    private String teamName;
    private int matchesPlayed;
    private int matchesWon;
    private int matchesDrawn;
    private int matchesLost;
    private int matchesFor;
    private int matchesAgainst;
    private int matchPointsDifference;
    private int matchPoints;

    public Team(String teamName, int matchesPlayed, int matchesWon, int matchesDrawn, int matchesLost, int matchesFor, int matchesAgainst, int matchPointsDifference, int matchPoints) {
        this.teamName = teamName;
        this.matchesPlayed = 0;
        this.matchesWon = 0;
        this.matchesDrawn = 0;
        this.matchesLost = 0;
        this.matchesFor = 0;
        this.matchesAgainst = 0;
        this.matchPointsDifference = 0;
        this.matchPoints = 0;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getMatchesWon() {
        return matchesWon;
    }

    public void setMatchesWon(int matchesWon) {
        this.matchesWon = matchesWon;
    }

    public int getMatchesDrawn() {
        return matchesDrawn;
    }

    public void setMatchesDrawn(int matchesDrawn) {
        this.matchesDrawn = matchesDrawn;
    }

    public int getMatchesLost() {
        return matchesLost;
    }

    public void setMatchesLost(int matchesLost) {
        this.matchesLost = matchesLost;
    }

    public int getMatchesFor() {
        return matchesFor;
    }

    public void setMatchesFor(int matchesFor) {
        this.matchesFor = matchesFor;
    }

    public int getMatchesAgainst() {
        return matchesAgainst;
    }

    public void setMatchesAgainst(int matchesAgainst) {
        this.matchesAgainst = matchesAgainst;
    }

    public int getMatchPointsDifference() {
        return matchPointsDifference;
    }

    public void setMatchPointsDifference(int matchPointsDifference) {
        this.matchPointsDifference = matchPointsDifference;
    }

    public int getMatchPoints() {
        return matchPoints;
    }

    public void setMatchPoints(int matchPoints) {
        this.matchPoints = matchPoints;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Team{");
        sb.append("teamName='").append(teamName).append('\'');
        sb.append(", matchesPlayed='").append(matchesPlayed).append('\'');
        sb.append(", matchesWon=").append(matchesWon);
        sb.append(", matchesDrawn=").append(matchesDrawn);
        sb.append(", matchesLost=").append(matchesLost);
        sb.append(", matchesFor=").append(matchesFor);
        sb.append(", matchesAgainst=").append(matchesAgainst);
        sb.append(", matchPointsDifference=").append(matchPointsDifference);
        sb.append(", matchPoints=").append(matchPoints);
        sb.append('}');
        return "Team";
    }


        public void printFormatted () {
            NumberFormat gb = NumberFormat.getCurrencyInstance(Locale.UK);
            final String formatString = "%-4s %-12s %8s";

            System.out.println(String.format(formatString, this.teamName, this.matchesPlayed, this.matchesWon, this.matchesDrawn, this.matchesLost, this.matchesFor, this.matchesAgainst, this.matchPointsDifference, this.matchPoints));
        }

    @Override
    public int compareTo(Team fr) {
        if (fr.matchPoints > this.matchPoints) {
            return 1;
        } else if (fr.matchPoints < this.matchPoints) {
            return -1;
        } else {
            return 0;
        }
    }
}
