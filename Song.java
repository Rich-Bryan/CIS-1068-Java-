public class Song {
    public static void main(String[] args){
        cat();
        System.out.println();
        hen();
        System.out.println();
        duck();
        System.out.println();
        goose();
        System.out.println();
        sheep();
        System.out.println();
        pig();

    }
    public static void cat(){
        System.out.println("Bought me a cat and the cat pleased me,");
        System.out.println("I fed my cat under yonder tree.");
        catLine();
    }
    public static void catLine(){
        System.out.println("Cat goes fiddle-i-fee.");
    }
    public static void hen(){
        System.out.println("Bought me a hen and the hen pleased me,");
        System.out.println("I fed my hen under yonder tree.");
        henLine();
        catLine();
    }
    public static void henLine(){
        System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");

    }
    public static void duck(){
        System.out.println("Bought me a duck and the duck pleased me,");
        System.out.println("I fed my duck under yonder tree.");
        duckLine();
        henLine();
        catLine();
    }
    public static void duckLine(){
        System.out.println("Duck goes quack, quack,");
    }
    public static void goose(){
        System.out.println("Bought me a goose and the goose pleased me,");
        System.out.println("I fed my goose under yonder tree.");
        gooseLine();
        duckLine();
        henLine();
        catLine();

    }
    public static void gooseLine(){
        System.out.println("Goose goes hissy, hissy,");

    }
    public static void sheep(){
        System.out.println("Bought me a sheep and the sheep pleased me,");
        System.out.println("I fed my sheep under yonder tree.");
        sheepLine();
        gooseLine();
        duckLine();
        henLine();
        catLine();
    }
    public static void sheepLine(){
        System.out.println("Sheep goes baa, baa,");

    }
    public static void pig(){
        System.out.println("Bought me a pig and the pig pleased me,");
        System.out.println("I fed my pig under yonder tree.");
        sheepLine();
        gooseLine();
        duckLine();
        henLine();
        catLine();
        pigLine();
    }
    public static void pigLine(){
        System.out.println("Pig goes oink, oink,");
    }
}

