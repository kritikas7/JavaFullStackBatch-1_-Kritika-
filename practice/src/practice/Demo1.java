package practice;
import java.util.Scanner;
public class Demo1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter l and b of rectangle");
	    int l=sc.nextInt();
	    int b=sc.nextInt();
	    if(l>0 &&b>0) {
	    int area=l*b;
	    System.out.println("area:"+area);
	    }
	    else
	    	System.out.println("l and b should be greater than 0");
}
}

/*package practice;

public class WhileDemo extends Demo {
	public static void main(String[] args) {
		
		}
			
	}

}*/
 