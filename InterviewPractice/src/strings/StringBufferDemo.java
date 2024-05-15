package strings;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		StringBuffer stringBuffer = new StringBuffer("Abhishek");
		
		System.out.println(stringBuffer);
		
		System.out.println("Length : "+stringBuffer.length());
		
		System.out.println("Capacity : "+stringBuffer.capacity());
		
		stringBuffer.append(" Parmar");
		
		System.out.println(stringBuffer);
		
		System.out.println("Capacity : "+stringBuffer.capacity());
		
		System.out.println("Length : "+stringBuffer.length());
		
		
	}
}
