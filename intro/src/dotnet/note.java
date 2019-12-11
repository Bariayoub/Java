package dotnet;

import java.io.Serializable;

public class note implements Serializable {
    public int num,num2;
    public note(int num, int num2) {
        this.num = num;
        this.num2 = num2;
    }

    public int somm() {
        return num+num2;
    }

    public int getA() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getB() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
