package game;
import java.util.ArrayList;
public class Paths {

    private ArrayList<String>pathList;

    public Paths(){
        pathList = new ArrayList<String>();
        pathList.add("Inside");
        pathList.add("Outside");
        pathList.add("Ladder");
        pathList.add("Stay");
    }

    public ArrayList getPathList(){
        return pathList;
    }

}
