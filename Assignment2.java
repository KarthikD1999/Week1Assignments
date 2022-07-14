package weekendproj;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] demo = {3,2,11,4,6,7};
		int[] demo2= {1,2,8,4,9,7};
		for (int i = 0; i < demo.length; i++) {
			for (int j = 0; j < demo2.length; j++) {
				if (demo[i]==demo2[j]) {
					System.out.println(demo[i]);
				}
			}
		}
	}

}
