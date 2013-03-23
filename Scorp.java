
public class Scorp
{
 	 static int x = 555;
 	 //
	 void printX()
	 {
		 System.out.println("print x"); 
		 System.out.printf("x = ", x);
	 }
	 public static void main(String [] args)
	 {
		 System.out.printf("main: x = %d", x);
		 //ERROR: can not make a static reference to the non-static field x 
		 
		 //change to static int x = 555 in line 4, the error is disappeared.
		 //HYPOSIS: class variable will be not stored on the heap?? 
		 //         even though class variable has the same lifetime with static variable???
		 //         only variables that have "static" notation will be stored 
		 //         in the heap area. that is why printf gave me an error?
	 }
}
