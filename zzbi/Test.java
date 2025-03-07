package zzbi;

import ANY.Functions.Array.Includes;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {try {

        System.out.println("Choose a function.\n\n   0: Check Status of a class\n   1: List all testing-wanted classes\n   2: List all working classes\n   3: List all not-working/partially-working classes\n   4: List all classes with statuses\n\n   5: Test class");
        Scanner scanner = new Scanner(System.in);
        int function = scanner.nextInt();


            final String[] data = new TXT.Functions.Convert().toStringArray("GeneralToolsJAVA/zzbi/Data/Status.txt");


        if(function == 0) {


            System.out.println("Enter location of class. (e.g., \"GeneralToolsJAVA/CHAR/Array/Convert.java\")");

            String classLocation = scanner.next();

            System.out.println(new zzbi.tJson.Read().getProperty(data,classLocation));




        } else if(function == 1) {

            String[] allProperties = zzbi.tJson.Read.getAllProperties;
            for(int i = 0; i < allProperties.length; i++) {
                StringBuilder value = new StringBuilder();
                boolean startReading = false;
                for(int f = 0; f < allProperties[i].length; f++) {
                    if(startReading) {
                        value.append(allProperties[i].split("")[f]);
                    } else if((allProperties[i].split("")[f]+allProperties[i].split("")[f+1]).equals(": ")) {
                        startReading = true;
                    }
                }
                for(int g = 0; g < value.length(); g++) {
                    if(new STRING.Functions.Includes().includes(value,"untested")) {
                        System.out.println(allProperties[i]);
                    }
                }
            }

        }

    } catch(Exception e) {
        System.out.println("Test.java_0000: " +  e);
    }

    }


}