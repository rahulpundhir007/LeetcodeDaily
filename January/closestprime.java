//Leetcode 2523 Closest Prime Numbers in a Range
class Solution {
    public int[] closestPrimes(int left, int right) {
        int prevPrime = -1;
        int minDiff = Integer.MAX_VALUE;
        int[] result = new int[]{-1, -1};

        for (int i = left; i <= right; i++) {
            if (check(i)) {
                if (prevPrime != -1) {
                    int diff = i - prevPrime;
                    if (diff < minDiff) {
                        minDiff = diff;
                        result[0] = prevPrime;
                        result[1] = i;
                    }
                    if(diff<=2){
                        return result;
                    }
                }
                prevPrime = i;
            }
        }

        return result;

    }
    private boolean check(int num){
        if(num<2){
            return false;
        }
        for(int i = 2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
