package observablepractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.reactivex.Flowable;


public class DemoObservables {

	public static int[] getGreaterThanTen(int[] arrNumbers) {
	    Integer[] arrIntNumbers = Arrays.stream(arrNumbers).boxed().toArray(Integer[]::new);
	    
	    List<Integer> resultList = new ArrayList<>();

	    Flowable
	        .fromArray(arrIntNumbers)
	        .filter(x -> x > 10)
	        .toList()
	        .subscribe(x -> {
	          resultList.addAll(x);
	        });
	    return resultList.stream().mapToInt(x -> x).toArray();
	}

	public static int[] getDuplicate(int[] arrNumbers) {

	    Integer[] arrIntNumbers = Arrays.stream(arrNumbers).boxed().toArray(Integer[]::new);
	    
	    List<Integer> resultList = new ArrayList<>();
	    
	    Flowable
	            .fromArray(arrIntNumbers)
	            .map(x -> x*2)
	            .toList()
	            .subscribe(x -> {
	              resultList.addAll(x);
	            });
	    return resultList.stream().mapToInt(x -> x).toArray();
		
	}

}
