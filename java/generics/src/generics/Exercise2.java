package generics;


public class Exercise2 {

	static Integer[] nums = {1, 2, 3, 4};

	public static void main( String[] args ) throws Exception {
		
		System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
		swap(nums,1,2);
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
	}
	
	public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
