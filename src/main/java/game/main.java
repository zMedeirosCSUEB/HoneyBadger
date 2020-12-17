package game;

public class main {
    public static void main(String[] args) {

        Controller controller = new Controller();


        // Intro - display title
        controller.introMsg();
         int continueOn = 1;

         while (continueOn == 1){
             controller.userInputPrompt();


             controller.uniquePaths4();


             int playerInputInt = controller.userInputInt();

             int winningNumber = controller.getRandomInt(1, 4);

             continueOn = controller.liveOrDie(playerInputInt, winningNumber);

             System.out.println("randNum: " + winningNumber);
         }
        // User Input - Enter char prompt







        // User Input - Store char entered by the player into playerInputChar
        //char playerInputChar = controller.userInputChar();

        // Switch Statement - Pass char
        //controller.switchWith4(playerInputChar);


    }
}
