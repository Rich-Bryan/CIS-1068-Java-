public class FillInTheBlankQuestion extends Question{
    private String correctAnswer;

    public FillInTheBlankQuestion(int points, int difficulty, int answerSpace, String questionText, String correctAnswer) {
        //creating a constructor of Question passing the attributes
        super(points, difficulty, answerSpace, questionText);
        this.correctAnswer = correctAnswer;

    }

    public String toStringStudent(){
        return "________" + getQuestionText();
    }
    public String toStringTeacher(){
        return "__" + correctAnswer + "__ " + getQuestionText();
    }
}
