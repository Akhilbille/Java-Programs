import java.util.*;
class EvenOrOdd {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        if (num == 0)
            System.out.println("Neither Even nor Odd");
        else if (num%2 == 0 )
            System.out.println("Even Number ");
        else   
            System.out.println("Odd Number");
    }

}
