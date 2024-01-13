//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


class GfG {
    public static int palinArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int num = a[i];
            int rev = 0, temp;
            
            int copy = num;
            while (num > 0) {
                temp = num % 10;
                rev = rev * 10 + temp;
                num = num / 10;
            }

            if (copy != rev) {
                return 0; 
            }
        }
        return 1; 
    }
}
