package InputOutput;

import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /*File myObj = null;

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
        
        File f = new File("filename.txt");
        File f2 = new File("filename2.txt");
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(f2);
            fileInputStream =new FileInputStream(f);
            byte[] buf=  new  byte[10];
            int n = 0;
            while ((n=fileInputStream.read(buf))>=0){
                for (int i=0;i<n;i++) {
                    System.out.print((char) buf[i]);
                    fileOutputStream.write((char) buf[i]);
                }
            }
            fileOutputStream.close();
            fileInputStream.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }






    }
}
