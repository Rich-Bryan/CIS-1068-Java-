public class Fraction {
    int numerator;
    int denominator;

    public Fraction (int n, int d){
        this.numerator = n;
        this.denominator = d;

    }

    public int getNum(){
        return numerator;
    }
    public int getDenom(){
        return denominator;
    }

    public void setNum(int n){
        this.numerator = n;
    }
    public void setDenom(int d){
        this.denominator = d;
        if(denominator==0){
            throw new ArithmeticException("denominator cannot be zero");
        }
        System.out.println(denominator);

    }
    public Fraction add(Fraction a){
        // add numerator
        int n = (a.numerator * denominator) + (a.denominator * numerator);

        // add denominator
        int d = (a.denominator*denominator);

        // Euclidean algorithm
        int num = n; int denom = d;
        int r = 0;
        while(num % denom > 0){
            r = num % denom;
            num = denom;
            denom = r;

        }
        //got the gcd
        int gcd = denom;
        // reduce the fraction
        n = n/gcd;
        d = d/gcd;
        //set new numbers
        a.numerator = n;
        a.denominator = d;

        return a;

    }
    public boolean equals(Fraction a){

        if((a.numerator == numerator) && (a.denominator == denominator)){
            return true;
        }
        return false;

    }
    public String toString(){
        return numerator + "/" + denominator;
    }

}
