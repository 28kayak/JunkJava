
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
	//instance����������ł�static�͑��݂��Ȃ���΂Ȃ�Ȃ��B�̂�instance method �̒��ł�static variable ��define �ł��Ȃ�
	//5�{�̂���҂i�W���ɑ΂���`�e���@�����@�N���X�ɑ΂���`�e���@����static�j
	//�̂�static��Class variable �łȂ���΂Ȃ�Ȃ��B
	//�ԐF�̉��M(�v�f�ɑ΂���`�e���@�����@instance�ɑ΂���`�e���@�����@instance)
	
	//in english 
	//static variable must exist even after disappearing instance method.
	//Thus, we can NOT define static variable in an instance method 
	//5 pens (adjective for a set in math == adjective for a class == static)
	//red pen (adjective for an element of a set == adjective for an instance == instance)
	
	/*the difference between abstract class and interface in java
	 * Assume abs class will be added some methods
	 *Assume interface will not be added some methods(it is not allowed)
	 *(PREHIBIT)
	 *ABST class = �ő���񐔁ithe greatest common divisor||factor�j�@���@����ȏ�͂Ȃ�
	 *Abstract class == the greatest common divisor||factor
	 *== no bigger num than it
	 *== we cannot || need not to add more method
	 *
	 * 120, 60 �̍ő����(the least ) = 60�@
	 *interface = �ŏ����{�� 
	 *interface == the least common divisor. 
	 *== we have bigger common divisor
	 *== we can add more divisors for the list of common divisor 
	 *== we can add more method by depending on its necessity.
	 *120, 100 �ŏ����񐔁@~~ 600�@�g���Ƃ��Ɍ��炷 
	 * 
	 */
	 

	
}
