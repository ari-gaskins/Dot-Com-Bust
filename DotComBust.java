import java.util.ArrayList;

public class DotComBust {
    public static void main (String[] args) {
        private GameHelper helper = new GameHelper();
        private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
        private int numOfGuesses = 0;

        public void setUpGame() {
            //first make some dot coms and give them locations
            DotCom one = new DotCom();
            one.setName("Pets.com");

            DotCom two = new DotCom();
            two.setName("eToys.com");

            DotCom three = new DotCom();
            three.setName("Go2.com");

            dotComsList.add(one);
            dotComsList.add(two);
            dotComsList.add(three);

            System.out.println("Your goal is to sink three dot coms.");
            System.out.println("Pets.com, eToys.com, Go2.com");
            System.out.println("Try to sink them all in the fewest number of guesses.");

            for (DotCom dotComToSet : dotComsList) {
                ArrayList<String> newLocation = helper.placeDotCom(3);
                dotComToSet.setLocationCells(newLocation);
            }
        }

        private void startPlaying() {
            while (!dotComsList.isEmpty()) {
                String userGuess = helper.getUserInput("Enter a guess");
                checkUserGuess(userGuess);
            }
            finishGame();
        }

        public void checkUserGuess() {
            //while ()
        }

        public void finishGame() {
            //String result = dotcom.checkYourself(guess);
        }
    }
}
