import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testFindName() {
		Employee e = new Employee();
		ArrayList<String> list = new ArrayList<>();
		
			list.add("Sakshi");
			list.add("Sahil");
			list.add("Manthan");			
			assertEquals("FOUND", e.findName(list, "Sakshi"));
			
		

	}

}
