import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        for ( int i = 1; i<=100; i+=10)
//        {
//            System.out.println(i);
//        }
//        int j = 0;
//        while (j < 10)
//        {
//            j++;
//            if (j % 2== 0)
//            continue;
//            System.out.println(j);
//        }
//        int x = 15;
//        do {
//            x--;
//            System.out.println(x);
//        } while (x>10);
//
//        int[] name = new int[]{12, 1, 3};
//        System.out.print(name);

        Scanner in = new Scanner(System.in);
        System.out.flush();
        System.out.println("enter numbers of array: ");
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter a [" + i + "2] = ");
            a[i] = in.nextInt();
        }

//        char[][] array = new char[3][3];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = new char[3];
//        }
//        array[0][0] = 'c';
//        System.out.println(array[0][0]);
//
//        int temp = func(2, 4);
//        System.out.println(temp);
    }

    public static int func(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++)
            result *= a;
        return result;
    }
}

