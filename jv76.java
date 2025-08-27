public class jv76
{
    int modelYe;
    String modelNa;

    public jv76(String modelNa) {
	this(2020, modelNa);
    }

    public jv76(int modelYe, String modelNa) {
	this.modelYe = modelYe;
	this.modelNa = modelNa;
    }

    public void printInfo() {
	System.out.println(modelYe+" "+modelNa);
    }

    public static void main(String[] args) {
	jv76 car1 = new jv76("Bolvo");
	jv76 car2 = new jv76(564, "BMW");

	car1.printInfo();
	car2.printInfo();
    }
}
	
