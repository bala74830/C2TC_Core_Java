package lamdaexample;

public class Typeinference {

	public static void main(String[] args) {
		printlength(s -> s.length());
		
	}
	public static void printlength(Stringlength l)
	{
		System.out.println(l.getlength("Hi lodu"));
	}
	interface Stringlength
	{
		int getlength(String s);
	}
}

