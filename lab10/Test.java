import javax.print.attribute.standard.JobKOctets;

public class Test {
    private ObjectiveQuestion[] questions;
    private int totalPoints;

    public Test(ObjectiveQuestion[] questions, int totalPoints){
        this.questions = questions;
        this.totalPoints = totalPoints;
        // one question one point

    }

    public String toString(){

        String q = "";
        for(ObjectiveQuestion question : questions){
            q +=  question.toStringTeacher() + "\n";

        }
        return q;
    }
    public int getTotalPoints(){
        return this.totalPoints;

    }
}
