import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    //question 1 : has to have a 3.5 gpa, know java , having a 3.5 gpa show the interest in the field
    //question 2: the years of experience of the candidate with a certain coding languages

    public static void main(String[] args) throws FileNotFoundException {
        //create scanner to read the csv file
        Scanner scan = new Scanner(new File("applicant_data.csv"));
        //create an array list to store the values
        ArrayList<Applicant> applicants  = new ArrayList<>();

        while (scan.hasNextLine()) {
            String applicant = scan.nextLine();
            String[] word = applicant.split(",");

            //check for the gpa
            double gpa = 0;
            double cur = 0;
            if (isNumber(word[8])) {
                cur = Double.parseDouble(word[8]);
                if (cur >= 3.5) {
                    gpa = cur;
                    Applicant A = new Applicant(word[0], word[1], word[2], word[3], word[4], word[5], word[6], word[7],
                            gpa, word[9], word[10]);
                    //store the value into the array list
                    applicants.add(A);
                }
            }

        }
        ArrayList<Applicant> result = new ArrayList<>();
        for(Applicant A : applicants){
            String str = A.getLanguage().toLowerCase();
            if(str.contains("java ")){
                result.add(A);
            }
        }
        System.out.println("The list of top 10 applicant for entry level Java programmer: ");

        for(int i = 0; i < 10; i++){
            System.out.println(result.get(i));
        }
    }

    public static boolean isNumber(String str){
        try {
            double Value = Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            //System.out.println("Input String cannot be parsed to Integer.");
        }
        return false;
    }

}
