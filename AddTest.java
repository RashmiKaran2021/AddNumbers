package ProgrammingKnowledge;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		MyJunitClass Junit = new MyJunitClass();
		int result = Junit.add(100,200);
		assertEquals(300,result);
	}

}
