
public class Solution2652 {
    public static int sumOfMultiples(int n) {
       
    	int sum = 0;

		if(n % 7 == 0 || n % 5 == 0|| n% 3 == 0) {
			sum += n;
		}
		
		if(n > 0) {
    	return sum + sumOfMultiples(n-1);
		}else {
		return sum;
	}
	
    	
    }
    
    
    class Solution {
        public int sumOfMultiples(int n) {
                
        	int sum = 0;
        		for(int i = 0; i <= n; i++) {
        			if(i % 7 == 0 || i % 5 == 0|| i% 3 == 0) {
        			    sum += i;
        			}
        		}
        	
        	return sum;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
    	int n = 7;
    	System.out.println(sumOfMultiples(n));
    }
    
}
