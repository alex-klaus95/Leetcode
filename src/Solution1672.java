public class Solution1672 {
    public static int maximumWealth(int[][] accounts) {
    	
    	int maxWealth = 0;
    	
    	for(int i = 0; i < accounts.length; i++){   
        	int sum = 0;

			for(int j = 0; j < accounts[i].length; j++) {
	    		sum += accounts[i][j];    		
			}
            maxWealth = Math.max(maxWealth, sum);
    	}
    	return maxWealth;
            
    }
    
    
    
    public static void main(String[] args) {
    	
    	int[][] accounts  = new int[][]{{76,6,55,11,30,65,33,74,14,16,57,79,17,87,36,61,6},{10,18,5,55,94,28,8,36,73,62,23,62,20,70,91,7,10}};
        int result = maximumWealth(accounts);
        System.out.println(result);
    }  
    
}
