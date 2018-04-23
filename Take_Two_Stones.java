
import java.util.Scanner;

public class Take_Two_Stones{

    public static void main(String [] args)

    {

    Scanner scan = new Scanner (System.in);
    
//Takes in users number
    int num = scan.nextInt();

//modules user number by 2 to check, if even
    if(num%2==0)

    {

        System.out.println("Bob");

    }else{

        System.out.println("Alice");

    }

    }

}
