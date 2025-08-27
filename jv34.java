import java.util.Scanner;
public class jv34
{
    private static Scanner sc;
    public static void main(String[] args)
    {
	sc = new Scanner(System.in);
	
	System.out.println("Enter an integer: ");
	int myNum = sc.nextInt();
	//	if (args.length >0)
	//  {
	//	String str = args[0];
	//	myNum = Integer.parseInt (str);// myNum= args[0];
	//  }
	if (myNum > 0)
	    {
		System.out.println("The Number is positive");
	    }
	else if (myNum < 0)
	    {
		System.out.println("The Number is negative");
	    }
	else
	    {
		System.out.println("The Number is 0");
	    }
    }
}
