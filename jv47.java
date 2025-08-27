public class jv47
{
    public static void main(String[] args)
    {
	int i = 0;
	while (i < 40) {
	    if (i == 4) {
		i++;
		continue;
	    }
	    System.out.println(i);
	    i++;
	}
    }
}
