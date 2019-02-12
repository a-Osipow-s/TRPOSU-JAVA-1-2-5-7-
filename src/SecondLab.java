import static java.lang.Math.*;
import java.util.Scanner;


public class SecondLab {
    public static void main(String[] args) {
        MathExpression fun1 = new MathExpression();
        fun1.set();
        fun1.run();
        fun1.print();
    }
}

class MathExpression {
    private double x, y, z, h;

    void set() {
        Scanner in = new Scanner(System.in);
        System.out.print("x=");//2.444
        x = in.nextDouble();
        System.out.print("y=");//0.00869
        y = in.nextDouble();
        System.out.print("z=");//-130
        z = in.nextDouble();
    }

    void run() {
        double firstTerm = (pow(x,y+1)+pow(E,y-1))*(1+abs(y-x))/(1+x*abs(y-tan(z)));
        double secondTerm = (pow(abs(y-x),2)/2)-(pow(abs(y-x),3)/3);
        h = firstTerm + secondTerm;
    }

    void print() {
        System.out.print("Function=(pow(x,y+1)+pow(E,y-1))*(1+abs(y-x))/(1+x*abs(y-tan(z)))+(pow(abs(y-x),2)/2)-(pow(abs(y-x),3)/3)\n");
        System.out.printf("Arguments: x=%f, y=%f, z=%f \n", x, y, z);
        System.out.printf("Result=%f \n", h);
    }
}
