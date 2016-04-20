import java.util.Scanner;

public class S2Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("How Many Days In a Month");
Scanner name=new Scanner(System.in);

System.out.println("Enter Name of a Month");

String month=name.next();

switch(month)
{
case "January" :
	System.out.println("31 Days");
	break;
case "February" :
	System.out.println("28 Days");
	break;
case "March" :
	System.out.println("31 Days");
	break;
case "April" :
	System.out.println("30 Days");
	break;
case "May" :
	System.out.println("31 Days");
	break;
case "June" :
	System.out.println("30 Days");
	break;
case "July" :
	System.out.println("31 Days");
	break;
case "August" :
	System.out.println("31 Days");
	break;
case "September" :
	System.out.println("30 Days");
	break;
case "October" :
	System.out.println("31 Days");
	break;
case "November" :
	System.out.println("30 Days");
	break;
case "December" :
	System.out.println("31 Days");
	break;	
default:
	System.out.println("Please enter month Name Correctly");

}	

System.out.print("are present in Month of " + month);
	}

}
