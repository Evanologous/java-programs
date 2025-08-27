public class jv48
{
    public static void main(String[] args)
    {
	String[] cars = {"Bolvo","BMW"};
	cars[0] = "Kopal";
	System.out.println(cars[0]);
	System.out.println(cars.length);
	for (int i=0; i < cars.length; i++) {
	    System.out.println(cars[i]);
	}
    }
}
