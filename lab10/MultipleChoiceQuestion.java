public class MultipleChoiceQuestion extends Question{
    private String[] possibleAnswer;
    private String correctAnswer;

    public MultipleChoiceQuestion(int points, int difficulty, int answerSpace, String questionText,String[] possibleAnswer, String correctAnswer){
        super(points, difficulty, answerSpace, questionText);
        this.possibleAnswer = possibleAnswer;
        this.correctAnswer = correctAnswer;
    }

    public String toStringStudent(){
        String question = getQuestionText() +
                "\n";
        for(int i = 0; i < possibleAnswer.length; i++){
            question +=  i+1 + ") " + possibleAnswer[i] + "\n";
        }
        return question;
    }

    public String toStringTeacher(){
        String question = getQuestionText() + "\n";
        for(int i = 0; i < possibleAnswer.length; i++){
            if(possibleAnswer[i].equals(correctAnswer)){
                question += i+1 +") *** " + correctAnswer +" ***\n";
            }else {
                question += i + 1 + ") " + possibleAnswer[i] + "\n";
            }
        }
        return question;
    }
}
