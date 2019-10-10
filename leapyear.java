package fellowship;
import java.util.Scanner;
public class leapyear {
public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int year=obj.nextInt();
		
if(year%400==0&&year%4==0||year%100!=0)
{System.out.println("LEAP");

}
else

{System.out.println("not LEAP");
	
}

}
}
