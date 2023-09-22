import java.util.ArrayList;
import java.util.Scanner;

public class stairPath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int dest = scn.nextInt();
        ArrayList<String> paths = getStairPath(dest);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPath(int dest) {
        if (dest == 0) {
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        } else if (dest < 0) {
            ArrayList<String> bres = new ArrayList<String>();
            return bres;
        }
        ArrayList<String> path1 = getStairPath(dest - 1);
        ArrayList<String> path2 = getStairPath(dest - 2);
        ArrayList<String> path3 = getStairPath(dest - 3);
        ArrayList<String> paths = new ArrayList<String>();

        for (String path : path1) {
            paths.add(1 + path);
        }

        for (String path : path2) {
            paths.add(2 + path);
        }

        for (String path : path3) {
            paths.add(3 + path);
        }
        return paths;
    }
}
