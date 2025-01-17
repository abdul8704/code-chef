import java.util.*;

class Codechef
{
    private static int commonElements(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> hash = new HashMap<>();
        int count = 0;
        
        for(int num: arr1){
            hash.put(num, hash.getOrDefault(num, 0)+1);
        }
        
        for(int num:arr2){
            int temp = hash.getOrDefault(num, 0);
            
            if(temp != 0){
                count++;
                hash.put(num, temp-1);
            }
        }
        return count;
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int c=0; c<t; c++){
		    int n = sc.nextInt();

		
            int arr1[] = new int[n];
            int arr2[] = new int[n];
            
            for(int i=0; i<n; i++){
                arr1[i] = sc.nextInt();
            }
            
            for(int i=0; i<n; i++){
                arr2[i] = sc.nextInt();
            }
            
            int res = commonElements(arr1, arr2);
            System.out.println(res);
		}
        sc.close();
	}
}
