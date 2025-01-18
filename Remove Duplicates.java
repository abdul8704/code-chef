// https://www.codechef.com/practice/course/two-pointers/POINTERF/problems/PREP69?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static int removeDuplicate(int[] nums){
        if (nums.length == 0) return 0;
        
        int ptr = 0;
        
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[ptr]){
                nums[++ptr] = nums[i];
            }
        }
        return ptr+1;
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int t=0; t < test; t++){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    
		    for(int i=0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    int res = removeDuplicate(arr);

		    System.out.println(res);
		    for(int i=0; i<res; i++){
		        System.out.print(arr[i] + " ");
		    }
		    System.out.println();
		}

	}
}
