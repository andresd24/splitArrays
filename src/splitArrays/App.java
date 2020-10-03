package splitArrays;
import java.util.*;

public class App {
	
	private static int[] a = new int[] {2, 4, 1, 6, 5, 9, 7};	
	private static int[] b = new int[] {4, 3, 2, 6, 1};
	private static int[] c = new int[] {2, 1, 4, 6, 3, 7};
	private static int[] d = new int[] {1, 4, 3, 5, 9, 7, 12, 11, 10, 15, 13, 2 };	
	private static int[] e = new int[] {4, 4, 4, 4};
	
	public static int  calculateSegments(int[] testCase)
	{
		List<Integer> segmentHeads = new LinkedList<Integer>();
		Integer segments = 0;
		int segmentHigh = 0;
		
		// go until you find all the heads besides the last one
		for (int i = 1; (i < testCase.length); i++ )
		{	
			if ((testCase[i] > testCase[i-1])) { 
					
				segmentHigh = testCase[i];
				segmentHeads.add(testCase[i]);	
				segments++;
			}
		}
		
		if (segmentHeads.size() == 0) {
			return 0;
		}
		// check for head in last element of array
		if (segmentHeads.get(segmentHeads.size() -1) < segmentHigh) {
			segments++;
		}
		
		return segments;
	}
	
    public static void main( String[] args )
    {
    
    	System.out.println("segments a = " + calculateSegments(a));
    	System.out.println("segments b = " + calculateSegments(b));
    	System.out.println("segments c = " + calculateSegments(c));
    	System.out.println("segments d = " + calculateSegments(d));
    	System.out.println("segments e = " + calculateSegments(e));
    }

}
