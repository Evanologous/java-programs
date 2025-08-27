public class jv71
{
    public void fullThro() {
	System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {
	System.out.println("Max Speed is: "+maxSpeed);
    }

    public static void main(String[] args) {
	jv71 myCar = new jv71();
	myCar.fullThro();
	myCar.speed(200);
    }
}
