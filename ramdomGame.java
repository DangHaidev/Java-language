import java.util.Scanner;

class ramdomGame {
    static int count = 0;
    int userChoice()
    {
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        return userInput;
    }
    int ramdomNumber(int min, int max)
    {
        int ramdomNumber = (int) (Math.random()*max + min);
        return ramdomNumber;
    }
public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    ramdomGame object = new ramdomGame();
    System.out.println("nhap mot khoang [min, max]");
    int min = in.nextInt();
    int max = in.nextInt();
    int userInput, ramdom;
    ramdom = object.ramdomNumber(min,max);
    while (true) {
        System.out.println("nhap mot so nam trong khoang vua chon!");
        userInput = object.userChoice();
        if(userInput <= max && userInput >= min) 
        {
            break;
        }
    }
    while (true) {
        count++;
        if(userInput == ramdom)
        {
            System.out.println("you win");
            System.out.println("So lan can nhap lai de chien thang : " + count );
            break;
        } else if (userInput > ramdom)
        {
            System.out.println("Nhap mot so be hon.");
        } else 
        System.out.println("nhap mot so lon hon.");
        userInput = object.userChoice();
    }
}
}