package weekendproj;

import java.util.Arrays;

public class ArrayWeek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dup = {1,2,3,4,5,6,7,8,9,10,2,14,15,16,20};
		Arrays.sort(dup);
		for (int i=0;i<dup.length-1;i++)
		{
			if(dup[i]==dup[i+1]) {
				System.out.println(dup[i]);
			}
		}
	}

}
