//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            long Arr[] = new long[N];
            String[] S = read.readLine().split(" ");
            for (int i = 0; i < N; i++) Arr[i] = Long.parseLong(S[i]);
            Solution ob = new Solution();
            System.out.println(ob.pairAndSum(N, Arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution 
{
    static long pairAndSum(int n, long arr[]) 
    {
        long sum=0; int k=1;
        for(int i=0; i<32; i++)
        {
            long c=0;        
            for(int j=0; j<n; j++)
            {
                if((arr[j]&1)!=0)
                {
                    c++;
                }
                arr[j]>>=1;
            }
            long num = (c*(c-1))/2; 
            sum+= num*k;    
            k<<=1;
        }
        return sum;
    }
}