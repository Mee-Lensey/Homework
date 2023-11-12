public class Loops {
    public static void main(String[] args) {
        Loops myCount = new Loops();
    }//main method

    public Loops() {
        System.out.println("Mee-Lensey");
        for (int x = 0; x < 6; x = x + 1) {
            System.out.println(x + " ");


        }

        //call counting methods in here
    }//constructor method

    public void countByThrees() {
        System.out.println("by3");
        for (int x = 3; x < 16; x = x + 3) {
            System.out.println(x + " by3 ");
        }

    }

    public void countDown() {
        System.out.println("Countdown");
        for (int x = 10; x < 1; x = x -1) {
            System.out.println(x + "  Countdown ");

        }

    }//define counting methods down here
}


