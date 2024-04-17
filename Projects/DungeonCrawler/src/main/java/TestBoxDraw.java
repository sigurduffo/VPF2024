public class TestBoxDraw
{
	public static void main(String[] args)
	{
		char ul = '\u250F';
		char ur = '\u2513';
		char ll = '\u2517';
		char lr = '\u251B';
		char h = '\u2501';
		char v = '\u2503';

		String str = "Hello!";
		System.out.print(ul);
		for(int i = 0; i < str.length(); i++)
		{
			System.out.print(h);
		}
		System.out.print(ur);
		System.out.println();
		System.out.print(v);
		System.out.print(str);
		System.out.print(v);
		System.out.println();
		System.out.print(ll);
		for(int i = 0; i < str.length(); i++)
		{
			System.out.print(h);
		}
		System.out.print(lr);
		System.out.println();
	}
}
