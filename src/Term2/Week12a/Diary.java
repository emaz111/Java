package Term2.Week12a;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by u1859269 on 31/01/2019.
 */
public class Diary {

    private ArrayList<Job> jobCollection;

    public Diary () {
        jobCollection = new ArrayList<> ();
    }


    public void addJob (Job j){
        this.jobCollection.add (j);
    }

    public void printDiary () {
        if (this.jobCollection.isEmpty()) {
            System.out.println("There are no jobs available");
        } else {
            printDiary();

            System.out.println();
        }
    }

    public void searchDiary (String search){

    }

    public void purgeDiary (){

    }

    public void sortDiary (){
        Collections.sort(this.jobCollection);
    }
}
