import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo1Test {

	@Test
	void testConcatination() {
		Demo1 ob=new Demo1();
		String res = ob.concatination("Sakshi","Dhote");
		assertEquals("SakshiDhote", res);
	}

}
