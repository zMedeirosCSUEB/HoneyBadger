package game;

import java.util.ArrayList;

public class Controller {
    View view = new View();
    Model model = new Model();

    public Controller(){
    }

    // View Function Calls
    // Program Introduction
    public void introMsg(){
        view.title();
    }

    // Enter char prompt
    public void userInputPrompt(){
        view.enterPrompt();
    }

    // Model Function Calls
    // Calls a function that returns a char entered by the user
    public char userInputChar(){
        return model.charFromUser();
    }

    public int userInputInt() {
        return model.intFromUser();
    }

    public void switchWith4(char input, String stringOutput1, String stringOutput2, String stringOutput3, String stringOutput4){
        model.switchWith4Cases(input, stringOutput1, stringOutput2, stringOutput3, stringOutput4);
    }

    // Generate random number from model
    public int getRandomInt(int min, int max){
        return model.randomRoll(min, max);
    }


    // Randomized player interaction menu options
    public void uniquePaths4(){
        ArrayList uniqueRandVal = model.randomUniqueNumbers(0, 3, 4);
        String str1 = view.TESTOUTPUT((Integer) uniqueRandVal.get(0));
        String str2 = view.TESTOUTPUT((Integer) uniqueRandVal.get(1));
        String str3 = view.TESTOUTPUT((Integer) uniqueRandVal.get(2));
        String str4 = view.TESTOUTPUT((Integer) uniqueRandVal.get(3));
        view.path(str1, str2, str3, str4);
    }

    public int liveOrDie(int yourNum, int randNum){
        if (yourNum == randNum){
            view.youLive();
            return 1;
        }
        else{
            view.youDie();
            return 0;
        }
    }












}
