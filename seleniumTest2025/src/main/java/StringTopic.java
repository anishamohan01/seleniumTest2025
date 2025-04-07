
public class StringTopic {

	public static void main(String[] args) {
		
		try {
			String test = "1234"; 
			
			String num = new String("1234");
			int i = 9/0;
			System.out.println(test.length());
			
			System.out.println(num.charAt(1));
			
			System.out.println(test.indexOf("2"));
			System.out.println(test.isEmpty());
			
		} catch(ArithmeticException e) {
			System.out.println("Exception occured: " + e);
		} finally {
			System.out.println("Finally");
		}
		
		
	}

}
