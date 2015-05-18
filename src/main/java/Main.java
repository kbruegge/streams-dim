import dim.DimInfo;

/**
 * Created by kai on 08.05.15.
 */
public class Main {

    public static void main(String[] args){
        System.out.println("Hello");
//        String path = System.getProperty("java.library.path");
        System.setProperty("java.library.path", "/Users/kai/Development/dimstream/");
        String path = System.getProperty("java.library.path");
        System.out.println("Library path: " + path);

        DimInfo pointing = new DimInfo("DRIVE/DRIVE_POINTING_POSITION",5,-1);

        System.out.println("Loading by hand");
//        System.loadLibrary("libjdim");
        System.load("/Users/kai/Development/dimstream/libjdim.dylib");

//        System.out.println("Pointing: " + pointing.getString());
    }
}
