import java.util.Scanner;

public class FirstLab {

    public static void main(String[] args) {
        Array A = new Array(5);
        Array B = new Array(5);

        A.arrayInput();
        B.arrayInput();

        System.out.println("Initial arrays:");
        A.outputCurrentArray();
        B.outputCurrentArray();

        A.multiplicationArrayElementsByMax();
        B.multiplicationArrayElementsByMax();

        System.out.println("Finite arrays:");
        A.outputCurrentArray();
        B.outputCurrentArray();
    }
}

class Array {
    private int arr[];
    private int sizeArray;

    Array(int size) {
        sizeArray = size;
    }

    int searchMaxElementInArray() {
        int max = arr[0];
        for (int i=0;i<arr.length;i++) {
            if(arr[i]>=max)
                max = arr[i];
        }
        return max;
    }

    void arrayInput() {
        arr = new int[sizeArray];
        System.out.println("Input array:");
        for (int i = 0;i<sizeArray;i++) {
            System.out.print("array[" + i + "] = ");
            Scanner in = new Scanner(System.in);
            arr[i] = in.nextInt();
        }
        System.out.println(" ");
    }

    void multiplicationArrayElementsByMax() {
        int max = searchMaxElementInArray();
        for (int i=0;i<sizeArray;i++) {
            arr[i] *= max;
        }
    }

    void outputCurrentArray() {
        for (int x:arr) {
            System.out.print(x + " ");
        }
        System.out.println(" ");
    }
}