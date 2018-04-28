package observablepractice;

import static org.junit.Assert.assertArrayEquals;


import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class DemoObservablesTest {
	
	int[] arrNumbers= {1,5,10,20};
	int[] testList= {};
	
	@Test
	@DisplayName("shouldGreaterThanTen")
	public void shouldGreaterThanTen() {
		
		int[] listExpected={20};
		
		int[] result=DemoObservables.getGreaterThanTen(arrNumbers);
		
		assertArrayEquals(listExpected,result);
		
	}
	
	@Test
	@DisplayName("shouldDuplicate")
	public void shouldDuplicate() {
		
		int[] listExpected= {2,10,20,40};
		
		int[] result=DemoObservables.getDuplicate(arrNumbers);
		
		assertArrayEquals(listExpected, result);
	}
	
	@Test
	@DisplayName("shouldHGreaterThanTenEmpty")
	public void shouldValidateEmptyArrayDuplicate() {
		
		int[] listExpected= {};
		
		int[] result=DemoObservables.getDuplicate(testList);
		
		assertArrayEquals(listExpected, result);
	}
	
	
	@Test
	@DisplayName("shouldValidateDuplicateEmpty")
	public void shouldValidateEmptyArrayGreaterThanTen() {
		
		int[] listExpected= {};
		
		int[] result=DemoObservables.getGreaterThanTen(testList);
		
		assertArrayEquals(listExpected, result);
	}

}
