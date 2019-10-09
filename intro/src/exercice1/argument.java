package exercice1;

import java.util.Scanner;

public class argument {

    public static void maine(int i){
        System.out.println(i);
    }
    public static void maine(int i,int j){
        System.out.println(i+"  "+j);
    }
    public static void maine(int i,int j,int jj){
        System.out.println(i+ "  "+j+" "+jj);
    }

    public static void main(String[] args) {

        System.out.println(" put case ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("put a :");
        int a = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        switch (b){
            case 1:
                maine(a);break;
            case  2 :
                maine(a,b);
                break;
            case 3:
                maine(a,b,c);
                break;
        }
    }
}

