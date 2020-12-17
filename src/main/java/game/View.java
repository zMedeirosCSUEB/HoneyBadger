package game;

public class View {



    // Constructor
    public View(){

    }

    // Game Banner
    public void title(){
        System.out.println("HONEY BADGER");
    }

    // User Input Prompt
    public void enterPrompt(){
        System.out.println("Enter 1, 2, 3, 4");
    }

    public void path(String option1, String option2, String option3, String option4){
        System.out.println("Choose a Path");
        System.out.println("1 - " + option1);
        System.out.println("2 - " + option2);
        System.out.println("3 - " + option3);
        System.out.println("4 - " + option4);
    }

    public String TESTOUTPUT(int i){
        String[] outputArray = {"Place A", "Place B", "Place C", "Place D"};
        return outputArray[i];
    }





    public void youLive(){
        System.out.println("You Lived");
    }

    public void youDie(){
        System.out.println("You Died");
    }

    public String outputString(int i){
        String[] outputArray = {"You Live", "You Die"};
        return outputArray[i];
    }

    public void errorMessage(){
        System.out.println("Error");
    }

}
