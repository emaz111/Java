package Term2.Week12a;

import jdk.nashorn.internal.scripts.JO;

/**
 * Created by u1859269 on 31/01/2019.
 */
public class Job {
    private String description;
    private int priority;
    private boolean jobFinished;

    public Job(){

    }

    public Job (String description, int priority, boolean jobFinished){
       this.description = description;
       this.priority = priority;
       this.jobFinished = jobFinished;
    }

    public String getDescription (){
        return description;
    }

    public void setDescription (String description){
        this.description = description;
    }

    public int getPriority (){
        return priority;
    }

    public void setPriority (int priority){
        this.priority = priority;
    }

    public boolean isFinished(){
        return jobFinished;
    }

    public void setFinished (boolean jobFinished){
        this.jobFinished = jobFinished;
    }

    public void markFinished() {
        jobFinished = true;
    }


    @Override
    public int compareTo(Job other) {
        if (other.jobFinished = false) {
            return 1;
        } else if (other.jobFinished = true) {
            return -1;
        } else {
            return 0;
        }
    }
}

    public String display (){
return display();
    }

    public static void main (String[] args){
        Diary one = new Diary();

        one.addJob(new Job());



    }
}