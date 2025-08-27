public class jv55
{
    static void checkAge(int age) {
	if(age<18) {
	    System.out.println("Access denied--too young to vote");
	}
	else {
	    System.out.println("Access granted --you're old enough to vote");
	}
    }
    public static void main(String[] args) {
	checkAge(12);	
    }
}
