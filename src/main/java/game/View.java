package game;

public class View {



    // Constructor
    public View(){

    }

    public void welcomeMessage(){
        System.out.println("HONEY BADGER");
    }

    public void path(String option1, String option2, String option3, String option4){
        System.out.println("Choose a Path");
        System.out.println("1 - " + option1);
        System.out.println("2 - " + option2);
        System.out.println("3 - " + option3);
        System.out.println("4 - " + option4);
    }

    public void errorMessage(){
        System.out.println("Error");
    }

}
