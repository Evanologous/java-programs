public class jv70
{
    static void myStaticMethod() {
	System.out.println("Static methods can be called wihout creating objects");
    }
    public void myPublicMethod() {
	System.out.println("Static methods must be called by creating objects");
    }

    public static void main(String[] args) {
	myStaticMethod();
	//	myPublicMethod();

	jv70 myObj = new jv70();
	myObj.myPublicMethod();
    }
}
