import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo2Test {

	@Test
	void testPalindromeCheck() {
		Demo2 ob=new Demo2();
		boolean res = ob.palindromeCheck("mam");
		System.out.println(res);

	}
	

}
