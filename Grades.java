import java.util.*;


// write a grading calculator program
public class Grades {
    public static void main(String[] args){
        double avgHwGrade;
        int labsAttended, numOfLateDays;

        //create a scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("This program accepts your homework and two exam scores as input and computes your grade in the course");

        // asking the user for the grade weights
        System.out.print("Homework weight? ");
        int hwWeight = scan.nextInt();
        System.out.print("Exam 1 weight? ");
        int examOneWeight = scan.nextInt();
        int examTwoWeight = 100 - (examOneWeight+hwWeight);
        System.out.println("Using weights of " + hwWeight + " " + examOneWeight + " "+ examTwoWeight);

        //asking the user for homework

        System.out.println("Homework: ");
        System.out.print("Number of assignments? ");
        int numOfAssignment = scan.nextInt();

        double weightedHwGrade;
        if (numOfAssignment <= 0){
            // <=0 --> full hw grade --> 100% ---> 100%*weight
            avgHwGrade = hwWeight;
            // number of assignment is unknown

            //calculate the total points and weighted score
            System.out.println("Total point = 100%");
            System.out.println("Weight score = " + avgHwGrade);

            weightedHwGrade = avgHwGrade;
        } else {
            // user enter a negative number for avgHwGrade then, avgHwGrade --> 0

            System.out.print("Average Homework grade? ");
            avgHwGrade = scan.nextDouble();

            if(avgHwGrade < 0) {
                avgHwGrade = 0;
            }
            // if user enter a avgHwGrade > max points then, avgHwGrade --> 10
            else if(avgHwGrade > 10){
                avgHwGrade = 10;
            }

            System.out.print("Number of late days used? ");
            numOfLateDays = scan.nextInt();
            System.out.print("Labs attended? ");
            labsAttended = scan.nextInt();

            //calculate the total points and weighted score
            System.out.println("Total points = " + (avgHwGrade * numOfAssignment + labsAttended * 4)
                    + " / " + (10 * numOfAssignment + 4 * numOfAssignment));
            System.out.println("Weighted score = "
                    + homeworkGrade(hwWeight,avgHwGrade,numOfAssignment,numOfLateDays,labsAttended));

            weightedHwGrade = homeworkGrade(hwWeight,avgHwGrade,numOfAssignment,numOfLateDays,labsAttended);
        }



        //checking the examScore and curve > 100
        //Exam 1 score

        System.out.println("Exam 1: ");
        System.out.print("Score? ");
        int examOneScore = scan.nextInt();
        // check if user enter a examOneGrade < 0 --> examOneGrade = 0
        if (examOneScore < 0){
            examOneScore = 0;
        }else if (examOneScore > 100){
            examOneScore = 100;
        }

        System.out.print("Curve? ");
        int curve1 = scan.nextInt();
        System.out.println("Total points = " + ((examOneScore + curve1) > 100 ? 100 : examOneScore + curve1) + " / 100");
        System.out.println("Weighted score = " + examGrade(examOneScore,examOneWeight,curve1));

        //Exam 2 score
        System.out.println("Exam 2: ");
        System.out.print("Score? ");
        int examTwoScore = scan.nextInt();
        // check if user enter a examTwoGrade < 0 --> examTwoGrade = 0
        if (examTwoScore < 0){
            examTwoScore = 0;
        }else if (examTwoScore > 100){
            examTwoScore = 100;
        }
        System.out.print("Curve? ");
        int curve2 = scan.nextInt();
        System.out.println("Total points = " + ((examTwoScore + curve2) > 100 ? 100 : examTwoScore + curve2) + " / 100");
        System.out.println("Weighted score = " + examGrade(examTwoScore,examTwoWeight,curve2));

        // calculate the course grade
        double grade = weightedHwGrade + examGrade(examOneScore,examOneWeight,curve1)
               + examGrade(examTwoScore,examTwoWeight,curve2);

        System.out.println("Course grade = " + (Math.round(grade*100)/100.0));


    }


    public static double homeworkGrade(int hwWeight, double avgHwGrade, int numOfAssignment, int lateDaysUsed, int labAttended ){
        //determine the homework score
        // number of hw and lab are the same
        double weightHwScore = hwWeight * (avgHwGrade * numOfAssignment + labAttended * 4) / (10 * numOfAssignment + 4 * numOfAssignment);

        if (lateDaysUsed > numOfAssignment/2){
            weightHwScore = (hwWeight * ((avgHwGrade) * 0.9) * numOfAssignment + labAttended * 4) / (10 * numOfAssignment + 4 * numOfAssignment) ;
            // reduced the assignment by 10% if late on the avgHwGrade
        }
        else if (lateDaysUsed == 0){
            // checking if there is not any late days used
            if (avgHwGrade + 5 <= 10){
                weightHwScore = hwWeight * ((avgHwGrade + 5) * numOfAssignment + labAttended * 4) / (10 * numOfAssignment + 4 * numOfAssignment);
            }
            else if (avgHwGrade + 5 > 10){
                weightHwScore = hwWeight * (10.0 * numOfAssignment + labAttended * 4) / (10 * numOfAssignment + 4 * numOfAssignment);

            }
        }

        return (Math.round(weightHwScore*100)/100.0);



    }
    public static double examGrade(int examScore, double examWeight, int curve){
        double weightExamScore = (examWeight * examScore)/ 100;

        if (examScore + curve > 100){
            weightExamScore = (examWeight * 100)/ 100;
        }
        else{
            weightExamScore = (examWeight * (examScore + curve))/ 100;

        }
        return (Math.round(weightExamScore*100)/100.0);


    }




}
