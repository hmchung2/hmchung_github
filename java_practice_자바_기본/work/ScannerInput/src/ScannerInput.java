import java.util.Scanner;
import java.math.*;
public class ScannerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sno;
String sname;
double sweight;
Scanner scan = new Scanner(System.in);
System.out.print("상품번호: " );
sno = scan.nextInt();
System.out.print("상픔명 : ");
sname = scan.next();
System.out.print("무게: ");
sweight = scan.nextDouble();
System.out.println(" 상품명: " + sname + ", 상품번호: " + sno + ", 무게 :" +sweight + "kg");
double d = 2.2- 2.2;
System.out.print(Math.abs(2.2-2.2) < 0.00001);	
	}

}
