import dim.DimInfo;

/**
 * Created by kai on 08.05.15.
 */
public class Main {

    public static void main(String[] args){
        System.out.println("Hello");
        DimInfo pointing = new DimInfo("DRIVE/DRIVE_POINTING_POSITION",5,-1);
        System.out.println("Pointing: " + pointing.getString());
    }
}
