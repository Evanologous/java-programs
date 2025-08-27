public class jv50
{
    public static void main(String[] args)
    {
	int ages[] = {23,54,21,76,12,54,11};

	//	float avg, sum = 0;

	int length = ages.length;

	int lowestAge = ages[0];

	for(int age : ages) {
	    if(lowestAge > age) {
		lowestAge = age;
	    }
	    System.out.println("The lowest age is: "+lowestAge);
	}
    }
}
