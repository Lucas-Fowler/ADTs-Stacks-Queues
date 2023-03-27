
public class Driver {
	
	public static void main(String[] args) {
		int[] vals = {1, 3, 5, 7, 2, 8, 3, 5};
		System.out.println(average(vals)); //this method works fine
		
		
		
		try {
			System.out.println(vals.length/0);  //Arithmetic exception
		} catch(ArithmeticException e) {
			System.out.println("Don't divide by zero");
		}
		
		try {
			System.out.println(vals[20]); //ArrayIndexOutOfBoundsException
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("vals length is less than 20");
			e.printStackTrace();
		}
		
	}
	
	public static double average(int[] nums) {
		//return the avg of the elements in vals
		int sum = 0;
		double count = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			count++;
		}
		return sum/count;
	}
	
	
}
