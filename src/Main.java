
public class Main {

    public static void main(String[] args)
    {
        for ( int i = 1; i<=100; i+=10)
        {
            System.out.println(i);
        }
        int j = 0;
        while (j < 10)
        {
            j++;
            if (j % 2== 0)
            continue;
            System.out.println(j);
        }
        int x = 15;
        do {
            x--;
            System.out.println(x);
        } while (x>10);
    }
}
