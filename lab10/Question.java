public class Question {
    private int points;
    private int difficulty;
    private final int MIN_DIFFICULTY = 1;
    private final int MAX_DIFFICULTY = 10;
    private int answerSpace;
    private String questionText;

    public Question(int points, int difficulty, int answerSpace, String questionText){
        //creating a constructor of Question
        this.points = points;
        this.difficulty = difficulty;
        this.answerSpace = answerSpace;
        this.questionText = questionText;
        // checking for the range of Max and Min difficulty
        if(difficulty < MIN_DIFFICULTY || difficulty > MAX_DIFFICULTY){
            System.out.println("out of range");
        }

    }
    public int getSpace(){
        return answerSpace;
    }

    public int getPoints(){
        return points;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String toString(){
        return "points: " + points +
                "\ndifficulty: " + difficulty+
                "\nanswerSpace: " + answerSpace+
                "\nquestionText: " + questionText;

    }

}
