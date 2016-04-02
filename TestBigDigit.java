import java.util.*;
//U10416038 Ma Chia-Liang


public class TestBigDigit{
	public static void main(String[] args){
	//Create scanner
	Scanner scanner = new Scanner(System.in);
	//ask user enter two BigDigit
	System.out.println("Enter Firstnum= ?");
	String firstnumber = scanner.nextLine();
	System.out.println("Enter Secondnum= ?");
	String secondnumber = scanner.nextLine();
	//Create object bd class BigDigit.
	BigDigit bd = new BigDigit(firstnumber,secondnumber);
	}
}