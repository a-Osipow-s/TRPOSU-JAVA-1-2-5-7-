import java.util.Scanner;

public class FifthLab {
    public static void main(String[] args) {
        X x = new X(1, 2);
        Y y = new Y(2, 3, 4);

        y.displayInfo();
        y.set();
        y.displayInfo();
    }
}

class X {
    protected int x1, x2;

    X(){}

    X(int X1, int X2) {
        x1 = X1;
        x2 = X2;
    }

    void displayInfo(){};
    void set(){};
}

class Y extends X {
    private int x3;

    Y(int X1, int X2, int X3) {
        x1 = X1;
        x2 = X2;
        x3 = X3;
    }

    void displayInfo() {
        System.out.printf("Info: x1=%d, x2=%d, x3=%d\n", x1, x2, x3);
    }

    void set() {
        System.out.println("Input data:");
        Scanner in = new Scanner(System.in);
        System.out.print("x1=");
        x1 = in.nextInt();
        System.out.print("x2=");
        x2 = in.nextInt();
        System.out.print("x3=");
        x3 = in.nextInt();
    }
}
