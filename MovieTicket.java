import java.util.Scanner;

public class MovieTicket
{
    int amount;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number of person here which age less then 3 years \n per person ticket amount = free");
        int person1 = sc.nextInt();
        amount = person1*0;

        System.out.println("enter your number of person here which age between 3 to 12 years\n  per person ticket amount =100 ");
        int person2 = sc.nextInt();
        amount = amount +(person2*100);

        System.out.println("enter your number of person here witch age greater then 12 year\n per person ticket amount = 150 ");
        int person3 = sc.nextInt();
        amount =amount +(person3*150);

        int d =person1+person2+person3;
        System.out.println("total number of persons = " +d+ " \n total amount of tickets = "+amount);

    }
}
class main
{
    public static void main(String[] args) {
        MovieTicket m = new MovieTicket();
        m.input();
    }
}
