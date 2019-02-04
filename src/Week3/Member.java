package Week3;

import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * Created by u1859269 on 06/12/2018.
 */
public class Member {

    private String name;
    private int contribution;
    private ArrayList <String> members;

    public Member (String name) {
        this.name = name;
        this.contribution = 0;
    }

    public Member (String name, int contribution, ArrayList members) {
        this.name = name;
        this.contribution = contribution;
        members = new ArrayList <String> ();

        members.add("Gary");
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getContribution () {
        return contribution;
    }

    public void setContribution (int contribution) {
        this.contribution = contribution;
    }

    public ArrayList <String> getMembers () {
        return members;
    }

    public void setMembers (ArrayList <String> members) {
        this.members = members;
    }

    public boolean contribute (int amount) {
        if (amount > 0) {
            this.contribution += amount;
            System.out.println(contribution);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean totalContribution (int amount) {
        return true;
    }

    @Override
    public String toString () {
        return "Member: " + this.getName () + ". Contribution: " + this.getContribution () + '.';
    }

    public static void main (String[] args) {

        Member Gary = new Member ("Gary");
        Member Tony = new Member ("Tony");
        Member Rubiya = new Member ("Rubiya");
        Member Steve = new Member ("Steve");


        Gary.contribute (27);
        Tony.contribute (21);
        Rubiya.contribute (20);
        Steve.contribute (28);


        System.out.println (Gary);
        System.out.println (Tony);
        System.out.println("Total Contribution: ");

    }
}
