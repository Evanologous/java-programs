//import java.util.Scanner;
public class jv15
{
    public static void main(String[] args)
    {
	int items = 50;
	float usp = 9.99f;
	float mrp = items * usp;
	char currency = '$';

	System.out.println("Number of items: "+items);
	System.out.println("Cost per item: "+usp+currency);
	System.out.println("Total cost = "+mrp+currency);
    }
}
