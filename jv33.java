public class jv33
{
    public static void main(String[] args)
    {
	int myNum = 11;
	if (args.length >0)
	    {
		String str = args[0];
		myNum = Integer.parseInt (str);// myNum= args[0];
		
	    }
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
