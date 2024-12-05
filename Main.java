
public class Main
{
	public static void main(String[] args) {
		System.out.println("Exception handling ........!");
		int a = 100;
		int b = 0;
		
		try {
		    int c = a/b;
		    System.out.println(c);
		    
		} catch(Exception e) {
		    System.out.println("failed to divide with b ......!");
		}
	}
}
