import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class JUnitDemo {
	static private Directory directory = new Directory();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		String s = directory.addOrChangeEntry("Ryan", "000-000-0000");
		s = directory.addOrChangeEntry("AB", "000-000-0001");
		s = directory.addOrChangeEntry("CB", "000-000-0001");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddOrChangeEntry() 
	{
		assertEquals(directory.addOrChangeEntry("DA",  "000-000-0004"), null); // Checking Add
		assertEquals(directory.addOrChangeEntry("Ryan",  "000-000-0004"), "000-000-0000"); // Checking Change
	//	fail("Not yet implemented");
	}
	
	@Test
	void removeEntry()
	{
		assertEquals(directory.removeEntry("Kareem"), null);
		assertEquals(directory.removeEntry("Ryan").getName(), "Ryan");
	}
		

}
