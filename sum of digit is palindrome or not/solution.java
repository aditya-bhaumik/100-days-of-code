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
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    int isDigitSumPalindrome(int n) {
        int rev=0,sum=0;
        while(n!=0){
           rev=n%10;
           sum=rev+sum;
           n=n/10;
        }
        String s =Integer.toString(sum);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==s.charAt(s.length()-1-i)){
                return 1;
            }
        }
        return 0;
    }
}
