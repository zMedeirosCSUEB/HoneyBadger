package game;
import java.util.ArrayList;


public class Model {

    public Model(){

    }

/*
    public void turnMenu(){

        switch(pInput){
            case 'a' : case 'A':

                break;
            case 'b' : case 'B':

                break;
            case 'c' : case 'C':

                break;
            default:
                controller.errorMessage();
        }
    }
*/
    public ArrayList pathOptions(){
        Paths paths = new Paths();
        return paths.getPathList();
    }


}
