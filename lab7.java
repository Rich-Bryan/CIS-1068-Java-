import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class jaws {
    public static void main(String[] args) throws FileNotFoundException {
        convertToSouthie();

    }

    // basic rule 1 implementation
    // replace "r" with "h" if "r" is followed by (a, e, i, o, i)
    public static String basicRule1(String str){
        String[] vowels = {"a", "e", "i", "o","u"};
        // avoid case-sensitive
        // car -> cah
        String a = str.toLowerCase();

        // checking if a vowel is followed by "r"
        while(a.contains("ar") || a.contains("er")|| a.contains("ir")|| a.contains("or")|| a.contains("ur")){
            for(int i = 0; i < vowels.length; i++){
                if(a.contains(vowels[i] + "r")){
                    a = a.replace("r","h");
                }
            }
        }
        return a;
    }

    // basic rule 2 implementation
    // if a word end with "a" append "r"   === tuna -> tunar
    public static String basicRule2(String str){
        String a = str.toLowerCase();
        String b = "";
        // check the last letter if it "a"
        String last  = a.substring(a.length()-1);
        if(last.equals("a")){
            b = a + "r";
            return b;
        }

        return a;
    }

    // basic rule 3 implementation
    // replace word "very" with "wicked"  , very hard --> wicked hard
    public static String basicRule3(String str){
        if (str.equalsIgnoreCase("very")){
            return "wicked";
        }
        return str;
    }

    //Exception Rules 1
    // if "r" is at the end and is preceded by "ee" or "i", replace "r" with "yah"
    // deer --> "deeyah"
    public static String exceptionRule1(String str){
        String last3 = "";
        String last2 = "";

        // last 3 letter if the string is >= 3
        if(str.length() >= 3) {
            last3 = str.substring(str.length()-3);
        }
        else if (str.length() >= 2){
            last2 = str.substring(str.length()-2);
        } else{
            return str;
        }
        //checking for the last 3 letter if it "eer" or last 2 if is "ir"
        if (last3.equalsIgnoreCase("eer") || last2.equalsIgnoreCase("ir")) {
            return str.substring(0, str.length()-1) + "yah";
        }
        //otherwise, return the original string
        return str;
    }

    //Exception rule 2
    // if "r" is at the end and is preceded by "oo", replace "r" with "wah"
    // door --> doowah
    public static String exceptionRule2(String str){
        String last3 = "";

        //last 3 letter if the string is >= 3
        if(str.length() >= 3){
            last3 = str.substring(str.length()-3);
        }else{
            return str;
        }

        // check if the last 3 letter is equal to "oor"
        if(last3.equalsIgnoreCase("oor")){
            return str.substring(0, str.length()-1) + "wah";
        }
        // otherwise, return the string
        return str;
    }

    //translation of every word
    public static String translate(String word){
        String a = word;
        a = basicRule1(a);
        a = basicRule2(a);
        a = basicRule3(a);
        a = exceptionRule1(a);
        a = exceptionRule2(a);

        return a;
    }
    public static String spacing(String str) throws FileNotFoundException{
        String temp = "";
        String result = "";

        //split the string from space
        String[] words = str.split(" ");
        // loop through each word
        for(String word: words){
            // check if the word is not empty
            if (!word.equals("")) {
                // translate the word and store it to temp
                temp = translate(word);
                // add the temp to result
                result += temp + " ";
            }
            else{
                //other-wise add a space
                result += " ";
            }
        }
       System.out.println(result);
       return result;


 //reading a file and creating a file
    public static void convertToSouthie() throws FileNotFoundException {
        //create a file and read the file
        File file = new File("jaws.txt");
        Scanner scan = new Scanner(file);
        //System.out.println(scan.hasNext());

        //create a new file to write it
        PrintStream writer = new PrintStream("output.txt");

        // print the file translated into a new output file
        while (scan.hasNextLine()){
            writer.println(spacing(scan.nextLine()));
        }
    }
}






















