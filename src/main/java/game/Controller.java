package game;

import java.util.ArrayList;

public class Controller {
    View view = new View();
    Model model = new Model();

    public Controller(){
    }

    public void message(){
        view.welcomeMessage();
    }

    public void path(){
        ArrayList pathList = model.pathOptions();
        String option1 = (String) pathList.get(0);
        String option2 = (String) pathList.get(1);
        String option3 = (String) pathList.get(2);
        String option4 = (String) pathList.get(3);
        view.path(option1, option2, option3, option4);
    }

}
