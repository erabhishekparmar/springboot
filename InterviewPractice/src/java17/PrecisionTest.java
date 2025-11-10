package java17;

public class PrecisionTest {
    public static void main(String[] args) {

    	// Example 1:The pattern variable (s here) is only in scope inside the if block where the pattern was matched as true.
    	String obj1 = "Hello";
    	if (obj1 instanceof String s) {
    	    System.out.println(s); // ✅ in scope
    	}
    	//System.out.println(s); // ❌ compile-time error because it is out of if block
    	
    	
    	// Example 2:The compiler determines scope based on control flow, not just syntax.
    	String obj = "Hello";
    		
    	if (!(obj instanceof String s)) {
    	    // ❌ s not in scope here because if the condition is false, then it will not be assigned to s
    	} else {
    	    System.out.println(s); // ✅ here it is in scope
    	}
    	
    	

    	// Example 3:No re-declaration in the same scope
    	String obj3 = "Me";
    	if (obj3 instanceof String s) {
    	    //String s = "Hi"; // ❌ Cannot redeclare s
    	}

    	
    	// Example 4 : null always fails the pattern
    	Object o = null;
    	if (o instanceof String s) {  // ❌ false
    	
    	}
    	
    	// Example 5 : A more general pattern cannot appear before a more specific one.
    	/*
    	switch (obj) {
        case Object o -> "object";   // ❌ dominates everything
        case String s -> "string";   // unreachable
    	}
    	*/

    }
}
