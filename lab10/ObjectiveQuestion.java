public class ObjectiveQuestion extends Question {
    private String correctAnswer;

    public ObjectiveQuestion(int points, int difficulty, int answerSpace, String questionText, String correctAnswer) {
        //creating a constructor of Question passing the attributes
        super(points, difficulty, answerSpace, questionText);
        this.correctAnswer = correctAnswer;

    }

    public String toStringStudent(){
        return getQuestionText();
    }
    public String toStringTeacher(){
        return "quesiont: " + getQuestionText() +
                "\ncorrect answer: " + correctAnswer;
    }
}
