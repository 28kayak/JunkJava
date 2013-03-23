
public class StorageDuration
{
	static int staticStorage = 0;
	public static void main(String [] args)
	{
		
		for(int i = 0; i < 10; i++)
		{
			function();
		}
		System.out.println("gonna to call function() out of the for loop");
		function();
	}
	static void function()
	{//why do i have to define with static here?
		int autoStorage = 0;
		
		//why can I not define static variable here?
		System.out.printf("auto-storage = %d\n", autoStorage);
		System.out.printf("static-storage = %d\n", staticStorage);
		autoStorage++;
		staticStorage++;
		//return autoStorage;
	}
	
	 
	//in jap
	//instanceが消えた後でもstaticは存在しなければならない。故にinstance method の中ではstatic variable はdefine できない
	//5本のえんぴつ（集合に対する形容詞　＝＝　クラスに対する形容詞　＝＝static）
	//故にstaticはClass variable でなければならない。
	//赤色の鉛筆(要素に対する形容詞　＝＝　instanceに対する形容詞　＝＝　instance)
	
	//in english 
	//static variable must exist even after disappearing instance method.
	//Thus, we can NOT define static variable in an instance method 
	//5 pens (adjective for a set in math == adjective for a class == static)
	//red pen (adjective for an element of a set == adjective for an instance == instance)
	
	/*the difference between abstract class and interface in java
	 * Assume abs class will be added some methods
	 *Assume interface will not be added some methods(it is not allowed)
	 *(PREHIBIT)
	 *ABST class = 最大公約数（the greatest common divisor||factor）　＝　それ以上はない
	 *Abstract class == the greatest common divisor||factor
	 *== no bigger num than it
	 *== we cannot || need not to add more method
	 *
	 * 120, 60 の最大公約数(the least ) = 60　
	 *interface = 最小公倍数 
	 *interface == the least common divisor. 
	 *== we have bigger common divisor
	 *== we can add more divisors for the list of common divisor 
	 *== we can add more method by depending on its necessity.
	 *120, 100 最小公約数　~~ 600　使うときに減らす 
	 * 
	 */
	 

	
}
