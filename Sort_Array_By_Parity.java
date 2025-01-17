// https://www.codechef.com/practice/course/two-pointers/POINTERF/problems/DSAPROB16?tab=statement

import java.util.*;

public class Sort_Array_By_Parity {
    public static void sortArrayByParity(int[] nums) {
        int arr[] = new int[nums.length];
        int odd = 0, even = nums.length - 1;
        
        for(int num:nums){
            if((num&1) == 1){
                arr[odd++] = num;
            }
            else{
                arr[even--] = num;
            }
        }
        
        for(int i=0;i<odd; i++){
            nums[i] = arr[i];
        }
        
        int j = nums.length-1;
        
        for(int i=even+1; i<arr.length; i++){
            nums[i] = arr[j--];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }

        sortArrayByParity(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}