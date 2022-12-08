package emp.org;

public class Smethods {

	public static void main(String[] args) {
		
	String d="   welcome to my world";
	String e="  its mine";
	int length = d.length();
	System.out.println( "length is="+length);
	char charAt = d.charAt(4);
	System.out.println("characterat="+charAt);
	int indexOf = d.indexOf(4);
	System.out.println( "index position is ="+indexOf);
	String upperCase = d.toUpperCase();
	System.out.println("upper case is="+upperCase);
	String lowerCase = d.toLowerCase();
	System.out.println("lower case is= "+lowerCase);
	String concat = d.concat(e);
	System.out.println(concat);
	boolean contains = d.contains("welcome");
	System.out.println(contains);
	boolean empty = d.isEmpty();
	System.out.println("string is empty:"+"\t"+empty);
	boolean equals = d.equals(e);
	System.out.println(equals);
	boolean equalsIgnoreCase = d.equalsIgnoreCase(e);
	System.out.println(equalsIgnoreCase);
	boolean startsWith = d.startsWith("welcome");
	System.out.println(startsWith);
	boolean endsWith = d.endsWith("the");
	System.out.println(endsWith);
	String substring = d.substring(3);
	System.out.println(substring);
	String sd = d.substring(5, 6);
	System.out.println(sd);
	String trim = d.trim();
	System.out.println(trim);
	String replace = d.replace('r', 'g');
	System.out.println(replace);
	String replaceAll = d.replaceAll(d, "bramya");
	System.out.println(replaceAll);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
