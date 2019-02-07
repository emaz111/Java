package Term2.Week12a;

import jdk.nashorn.internal.scripts.JO;

/**
 * Created by u1859269 on 31/01/2019.
 */
public class Job {
    private String description;
    private int priority;
    private boolean finished;

    public Job(){

    }

    public Job (String description, int priority, boolean finished){
       this.description = description;
       this.priority = priority;
       this.finished = finished;
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
        return finished;
    }

    public void setFinished (boolean finished){
        this.finished = finished;
    }

    public void markFinished() {
        finished = true;
    }


    public int compareTo (Job other){
return getPriority();
    }

    public String display (){
return display();
    }

    public static void main (String[] args){
        Job one = new Job();

        one.setPriority(1);
        one.setDescription("hellos");


    }
}