import java.util.Scanner;
public class jv07
{
    public static void main(String[] args)
    {
	int length;
	int width;
	int area;

	System.out.print("Enter length: ");
	Scanner rec1 = new Scanner(System.in);
	//	System.out.println(rec1.nextLine());
	String rec1Str = rec1.nextLine();
	int number1 = Integer.parseInt(rec1Str);

	
	System.out.print("Enter Breadth: ");
	Scanner rec2 = new Scanner(System.in);
	//	System.out.println(rec2.nextLine());
	String rec2Str = rec2.nextLine();
	int number2 = Integer.parseInt(rec2Str);
	

	area = number1 * number2;
	System.out.println("The Area is: "+area);	
    }
}
