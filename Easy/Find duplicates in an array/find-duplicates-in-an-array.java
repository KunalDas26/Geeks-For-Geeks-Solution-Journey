//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution 
{
    public static ArrayList<Integer> duplicates(int arr[], int n) 
    {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<n; i++)
        {
            frequency.put(arr[i], frequency.getOrDefault(arr[i], 0)+1);   
        }
        
        for(Map.Entry<Integer, Integer> ele: frequency.entrySet())
        {
            if(ele.getValue() > 1) ans.add(ele.getKey());
        }
        
        if(ans.isEmpty()) ans.add(-1);
        
        Collections.sort(ans);
        
        return ans;
    }
}
