import java.util.*;

public class Main {
    public static int maxsubarray(int[] arr, int n) {
        int currmax = arr[0];
        int maxi = arr[0];
        for(int i=1;i<n;i++)
        {
            currmax = Math.max(arr[i],currmax+arr[i]);
            maxi = Math.max(maxi,currmax);
        }
        return maxi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(maxsubarray(arr, n));
        sc.close();
    }
}
