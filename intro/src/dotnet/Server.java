package dotnet;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    static final int port = 9910;

    public static void main(String[] args) throws Exception {
        ServerSocket s = new ServerSocket(port);
        Socket soc;
        int  count=0;
        while (true){

            //********* Receive Data
            System.out.println("=========> Server Up");
            soc = s.accept();
            count++;
            System.out.println("=====> New CLient ");
            System.out.println("===> Start Operation ");
            ObjectInputStream objectInputStream = new ObjectInputStream(soc.getInputStream());
            note nn = (note) objectInputStream.readObject();
            int num = nn.somm();
            System.out.println("The Sum is : "+num);


            //***************Send Data
            System.out.println("--//Give Data To Client");
            soc = new Socket(InetAddress.getLocalHost(),9911);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(soc.getOutputStream());
            bufferedOutputStream.write(num);
            bufferedOutputStream.flush();

            soc.close();
            System.out.println("--//Data In Socket");
            System.out.println("=====>Client Out\n");

            System.out.println("=====>Client number :"+count+"\n");
        }
    }
}
