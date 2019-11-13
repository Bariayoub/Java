package InputOutput;

import java.io.*;

public class FileToConsolData {
    public static void main(String[] args) {
        DataInputStream dis;
        DataOutputStream dos;
        try{
            dos=new DataOutputStream( new BufferedOutputStream(new FileOutputStream(new File("filename.txt"))));
            dos.writeFloat(333.33f);
            dos.writeInt(55);
            dos.writeChar('f');
            dos.close();
            dis = new DataInputStream(new BufferedInputStream(new FileInputStream(new File("filename.txt"))));
            System.out.println(dis.readFloat());
            System.out.println(dis.readInt());
            System.out.println(dis.readChar());
            dis.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
    }
}}
