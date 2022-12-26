import java.util.Scanner;

public class Test {
    int num,i,size,dg,multi,add;
    int temp = 1;
    int Ans = 0;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Any number");
        num = sc.nextInt();
    }
    void count() {
        for (i = 1; i <= num; i++) {
            dg = i;
            String digit = Integer.toString(dg);
            size = digit.length();

            if (size % 2 == 1) {
                multi = size * 2;
            } else if (size % 2 == 0 && size % 4 != 0) {
                multi = size * 3;
            } else {
                multi = size * 4;
            }
            add = add + multi;


        }
        System.out.println(add);
    }

        void answer()
        {
            while (temp != 0) {
                temp = add % 10;
                Ans = Ans + temp;
                temp = add / 10;
                add = temp;
            }
            System.out.println("Ans =" + Ans);
        }

}
class main
{
    public static void main(String[] args) {
        Test T= new Test();
        T.input();
        T.count();
        T.answer();

    }
}

