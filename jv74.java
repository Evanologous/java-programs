public class jv74
{
    int modelYe;
    String modelNa;

    public jv74(int year, String name) {
	modelYe = year;
	modelNa = name;
    }

    public static void main(String[] args) {
	jv74 myCar = new jv74(911, "Porsche");
	System.out.println(myCar.modelYe+" "+myCar.modelNa);
    }
}
