import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Question
        System.out.println("Test:\n ");
        ObjectiveQuestion q1 = new ObjectiveQuestion(5, 1, 1,
                "What is cos(0)? ", "1");
        FillInTheBlankQuestion q2 = new FillInTheBlankQuestion(5,5, 4,"was the 16th US President",
                "Abraham Lincoln");
        MultipleChoiceQuestion q3 = new MultipleChoiceQuestion(5,5,4,"Who lives in a pineapple under the sea?",
                new String[]{"Peter Griffin","Scooby Doo","Spongebob Squarepants", "Eric Cartman"}, "Spongebob Squarepants");

        System.out.println("Question 1: ");
        System.out.println(q1.toStringStudent());
        System.out.println("\nQuestion 2: ");
        System.out.println(q2.toStringStudent());
        System.out.println("\nQuestion 3: ");
        System.out.println(q3.toStringStudent());

        //Answer keys
        System.out.println("Answer Keys: \n");
        System.out.println("Question 1: ");
        System.out.println(q1.toStringTeacher());
        System.out.println("\nQuestion 2: ");
        System.out.println(q2.toStringTeacher());
        System.out.println("\nQuestion 3: ");
        System.out.println(q3.toStringTeacher());

        //extra credit

        //create and list of object and storing;
        ObjectiveQuestion[] questions = new ObjectiveQuestion[2];
        ObjectiveQuestion question1 = new ObjectiveQuestion(5, 1, 1,
                "What is cos(0)? ", "1");
        ObjectiveQuestion question2 = new ObjectiveQuestion(5, 1, 1,
                "What is 1 + 1 ", "2");
        questions[0] = question1;
        questions[1] = question2;

        Test quiz = new Test(questions, 10);
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose your file name with .txt extension, for example: \n");
        String FileName = scan.next();
        PrintStream p = new PrintStream(new File(FileName));
        p.println(quiz.toString());
    }
}
