package observablepractice;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class DemoObsIntgrTest {
	
	Integer[] arrNumbers= {1,5,10,20};
	Integer[] testList= {};
	
	@Test
	@DisplayName("shouldGreaterThanTen")
	public void shouldGreaterThanTen() {
		
		Integer[] listExpected={20};
		
		Integer[] result=DemoObsIntgr.getGreaterThanTen(arrNumbers);
		
		assertArrayEquals(listExpected,result);
		
	}
	
	@Test
	@DisplayName("shouldDuplicate")
	public void shouldDuplicate() {
		
		Integer[] listExpected= {2,10,20,40};
		
		Integer[] result=DemoObsIntgr.getDuplicate(arrNumbers);
		
		assertArrayEquals(listExpected, result);
	}
	
	@Test
	@DisplayName("shouldHGreaterThanTenEmpty")
	public void shouldValidateEmptyArrayDuplicate() {
		
		Integer[] listExpected= {};
		
		Integer[] result=DemoObsIntgr.getDuplicate(testList);
		
		assertArrayEquals(listExpected, result);
	}
	
	
	@Test
	@DisplayName("shouldValidateDuplicateEmpty")
	public void shouldValidateEmptyArrayGreaterThanTen() {
		
		Integer[] listExpected= {};
		
		Integer[] result=DemoObsIntgr.getGreaterThanTen(testList);
		
		assertArrayEquals(listExpected, result);
	}

}
