package observablepractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.reactivex.Flowable;

public class DemoObsIntgr {
	
	public static Integer[] getGreaterThanTen(Integer[] arrNumbers) {
	    
	    List<Integer> resultList = new ArrayList<>();

	    Flowable
	        .fromArray(arrNumbers)
	        .filter(x -> x > 10)
	        .toList()
	        .subscribe(x -> {
	          resultList.addAll(x);
	        });
	    //Integer[] numArray = new Integer[resultList.size()];
	    	    
	    return resultList.stream().toArray(Integer[]::new);
	}

	public static Integer[] getDuplicate(Integer[] arrNumbers) {

	    
	    List<Integer> resultList = new ArrayList<>();
	    
	    Flowable
	            .fromArray(arrNumbers)
	            .map(x -> x*2)
	            .toList()
	            .subscribe(x -> {
	              resultList.addAll(x);
	            });
	    return resultList.stream().toArray(Integer[]::new);
		
	}

}
