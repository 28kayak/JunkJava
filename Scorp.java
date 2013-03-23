
public class Scorp
{
	 int x = 555;
	 void printX()
	 {
		 System.out.println("print x"); 
		 System.out.printf("x = ", x);
	 }
	 public static void main(String [] args)
	 {
		 System.out.printf("main: x = %d", x);
		 //ERROR: can not make a static reference to the non-static field x 
	 }
}
