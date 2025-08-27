public class jv49
{
    public static void main(String[] args)
    {
	int ages[] = {21,54,23,76,12,54,34};

	float avg, sum = 0;

	int length = ages.length;

	for(int age : ages) {
	    sum += age;
	}
	avg = sum/length;
	System.out.println("The average age is: "+avg);
    }
}
