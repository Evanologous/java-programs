import java.util.Scanner;
public class jv06
{
    public static void main(String[] args)
    {
	String studentName = "Kuppusamy";
	int studentID = 45;
	int studentAge = 17;
	float studentFee = 23.34f;
	char studentGrade = 'A';

	System.out.println("Student Name: "+studentName);
	System.out.println("Student ID: "+studentID);
	System.out.println("Student Age: "+studentAge);
	System.out.println("Student Free: "+studentFee);
	System.out.println("Student Grade: "+studentGrade);

	System.out.print("Give an input: ");
	Scanner devan=new Scanner(System.in);
	System.out.println(devan.nextLine());
    }
}
