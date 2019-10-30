package InputOutput;

import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        File myObj = null;

        /*
        try {
            myObj = new File("C:\\");
            int n = 0;
            if (myObj.exists()){
                for (File e : myObj.listFiles()){
                    if (e.isDirectory()){
                        System.out.printf("%d- /%-25s \t",n+1,e.getName());
                    }else {
                        System.out.printf("%d- %-25s \t",n+1,e.getName());
                    }
                        n++;
                        if (n%4==0) System.out.println();
                    }
                }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        */

        try {
            myObj = new File("filename.txt");
            //Byte[] Buf = new Byte[8];
            FileInputStream fileInputStream = new FileInputStream(myObj);
            int n = fileInputStream.read();
            FileWriter fileWriter = new FileWriter(myObj);
            fileWriter.write(n);

            Scanner fileReader = new Scanner(myObj);
            if (fileReader.hasNextLine()){
                String nn = fileReader.nextLine();
                System.out.println(nn);
            }


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
