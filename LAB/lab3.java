public class lab3 {
    public static void main(String[] args) {
        //  jet figure with patterns
        haha();
        bottom();
        middle();
        top();
        hehe();


    }
    public static final int MIDDLE_ROW = 7;
    public static final int MIDDLE_COLUMN = 30;
    public static final int ROW = 3;
    public static final int COLUMN = 3;
    public static final int LONG = 5;
    public static final int SIZE = 17;




    public static void middle() {
        for (int i = 1; i <= MIDDLE_ROW; i++) {
            for (int j = 1; j <= MIDDLE_COLUMN; j++) {
                System.out.print("^!^");
            }

            System.out.println("");
        }
    }

    public static void bottom() {

        for (int i = COLUMN ; i <= LONG + 1; i++) {
            for (int j = 1; j <= ROW ; j++) {
                for (int s = 0; s < i; s++) {
                    System.out.print("$  ");
                }
                System.out.println("");
            }

        }

    }

    public static void top() {
        for (int i = LONG; i > COLUMN-2; i--) {
            for (int j = 1; j <= ROW; j++) {
                for (int s = 0; s <= i; s++) {
                    System.out.print("$  ");
                }
                System.out.println("");
            }

        }

    }

    public static void haha() {
        for (int i = 0; i < SIZE ; i++) {
            for (int j = 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int r = 0; r <= i; r++) {
                System.out.print("*");
            }
            System.out.print("");
            //System.out.print(" ");

            for (int r = 0; r <= i; r++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
    public static void hehe(){
        for (int i= SIZE; i>= 1; i--) {
            for (int j = 1; j>i;j--){
                System.out.print(" ");
            }
            for (int k = 1; k<=i; k++){
                System.out.print("*");
            }
            System.out.print("");

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
