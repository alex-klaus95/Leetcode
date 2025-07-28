

class Solution258 {
    public static int addDigits(int num) {
    	
        if (num == 0) return 0;
        System.out.println(num % 9);


        return num % 9 == 0 ? 9 : num % 9;
    }
    
}
