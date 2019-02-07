package Term2.Week12a;

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
       this.priority = 0;
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
        this.priority = 0;
    }

    public boolean isFinished(){
        return finished;
    }

    public void setFinished (boolean finished){
        this.finished = finished;
    }

    public void markFinished(){
        if (this.setFinished(false);){
            this.setFinished(true);
            return;
        }
    }

    public int compareTo (Job other){

    }

    public String display (){

    }
}
