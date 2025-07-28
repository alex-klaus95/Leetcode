import java.util.Arrays;

public class Solution2974 {
    public static int[] numberGame(int[] nums) {
        
    	int[] arr = new int[nums.length];
		Arrays.sort(nums);

    	for(int i = 0; i < nums.length; i+=2) {
    		arr[i+1] = nums[i];
    		arr[i] = nums[i+1];   		


    	}
    	
    	
    	return arr;
    }
    
    
    
    
    public static void main(String[] args) {
    	
    	int[] nums = new int[]{2,5};
        int[] result = numberGame(nums);
        System.out.println(Arrays.toString(result));
    }  
    
    
}

