import java.util.Scanner;

public class LineComparison {
	
		public static void main(String[] args) {
			
			
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Welcome to Line Comparision Computation program on Master Branch");
	
	int fx1,fx2,fy1,fy2,sx1,sx2,sy2,sy1,len1,len2;
	
	System.out.println("Enter the x,y co-ordinates of line1");
	fx1=sc.nextInt();
	fy1=sc.nextInt();
	System.out.println("Enter the other x,y co-ordinates of line1");
	fx2=sc.nextInt();
	fy2=sc.nextInt();
	len1=(fx2-fx1)*(fx2-fx1)+(fy2-fy1)*(fy2-fy1);// calculating the length of first line
	double lengthofline =Math.sqrt(len1);
	System.out.println("Lenth of line1 :"+lengthofline);
	
	System.out.println("Enter the x,y co-ordinates of line 2");
	sx1=sc.nextInt();
	sy1=sc.nextInt();
	System.out.println("Enter the other x,y co-ordinates of line 2");
	sx2=sc.nextInt();
	sy2=sc.nextInt();
	len2=(sx2-sx1)*(sx2-sx1)+(sy2-sy1)*(sy2-sy1);// calculating the length of second line
	double lengthofline2 =Math.sqrt(len2);
	System.out.println("Lenth of line2 :"+lengthofline2);
}
}
