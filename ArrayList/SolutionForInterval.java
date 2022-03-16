package ArrayList;

import java.util.ArrayList;


 public class SolutionForInterval extends Interval{
	
	 public static ArrayList<Interval> insert(ArrayList<Interval> interval, Interval newInterval){
		 
		 if(interval == null) {
			 interval = new ArrayList<Interval>();
			 interval.add(newInterval);
			 return  interval;
		 }else if(interval.size() == 0) {
			 interval.add(newInterval);
			 return  interval;
		 }
		 
		 Interval toInsert = newInterval;
		 
		 int i = 0;
		 while(i<interval.size()) {
			 Interval current  = interval.get(i);
			 if(current.end < toInsert.start) {
				 i++;
				 continue;
			 }else if(toInsert.end < current.start){
				 interval.add(i, toInsert);
				 break;
			 }else {
				 toInsert.start = Math.min(toInsert.start, current.start);
				 toInsert.end = Math.max(toInsert.end, current.end);
				 interval.remove(i);
			 }
		 }
		
		 if(i == interval.size()) {
			 interval.add(toInsert);
		 }
		 
		 return interval;
	 }
	 
	
}