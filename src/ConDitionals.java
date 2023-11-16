public class ConDitionals {
    public static void main(String[] args) {
        ConDitionals MagicEightBall = new ConDitionals();
    }// declaration=random;
    double randNum;




        public ConDitionals() {
            String question = " Am I a Good Person ";
            randNum = Math.random();
            int randomInt;


            if (randNum<0.165) {//condition1
                randomInt=1;

            } else if (randNum < .33) {System.out.println("Yessir");
                randomInt=2;
            } else if (randNum<.495) { System.out.println("Yes Indeed");
                randomInt=3;
            } else if (randNum<.66) { System.out.println("No,buddy");
                randomInt=4;
            } else if (randNum<.895) {System.out.println("Nah");
                randomInt=5;
            } else {System.out.println("I don't know man, you do u");

                randomInt=6;


            }


        }


}
