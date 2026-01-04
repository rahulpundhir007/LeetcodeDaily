//1390. Four Divisors
//time complexity O(n*sqrt(m)) n is length of array m is max element in array
class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum+=count(nums[i]);
        }
        return sum;
    }
    int count(int num){
        int sum  = 0;
        int count = 0;
        for(int i = 1;i*i<=num;i++){
            if(num%i==0){
                sum+=i;
               if(num/i==i){
                count+=1;
            //    sum = sum+num/i;
               }
               else{
               sum = sum+num/i;
                count+=2;
               }
            }
            if(count>4){
                return 0;
            }
        }
        if(count==4){
            return sum;
        }
        return 0;
    }
}
