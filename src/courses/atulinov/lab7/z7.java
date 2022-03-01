package courses.atulinov.lab7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


import java.io.File;

public class z7 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("C:\\ok\\7.txt"));
        ArrayList<String> arrStr = new ArrayList<>();

        while (scan.hasNext()) {
            arrStr.add(scan.nextLine());
        }
        scan.close();
        Collections.sort(arrStr);

        for (String anArrStr : arrStr) {
            System.out.println(anArrStr);
        }
    }
}