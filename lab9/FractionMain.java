public class FractionMain {
    public static void main(String[] args){
        //1st fraction
        Fraction f1 = new Fraction(3,4);
        //second fraction
        Fraction f2 = new Fraction(1555,4);

        System.out.println("fraction 1: " + f1);
        System.out.println("fraction 2: " + f2);
        //adding fraction
        System.out.println("are the fraction equal: " + f1.equals(f2));
        System.out.println("adding fraction: "+ f1.add(f2));


    }
}
