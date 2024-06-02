package imp;

public class reverse {

	public static String getreverseofstring(String s)
	{
		String rev = "";

		//siva 
		//david
		for(int i = s.length()-1;i>=0;i--)
		{
			char ch =s.charAt(i);
			System.out.println(ch);
			rev = rev+ch;
		}
		System.out.println("rev="+rev);
		return rev;

	}

	public static void main(String[] args) {
	
		getreverseofstring("siva");
	}

}
