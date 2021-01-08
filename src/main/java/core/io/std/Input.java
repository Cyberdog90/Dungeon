package core.io.std;

import core.utils.ConfigTOML;

import java.util.Scanner;

public class Input {
    private static final Scanner scan = new Scanner(System.in);
    public static String readLine(){
        Output.write(ConfigTOML.getConfig().getString("config.Input"));
        return scan.next();
    }
}
