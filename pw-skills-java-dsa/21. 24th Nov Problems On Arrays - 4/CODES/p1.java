import java.util.Arrays;
import java.util.Scanner;

public class p1 {

  //     Given an integer array 'arr', return the prefix sum/running sum of the array
  public static int[] prefixSum(int[] arr) {
    int n = arr.length;
    int[] pref = new int[n];
    pref[0] = arr[0];

    for (int i = 1; i < n; i++) {
      pref[i] = pref[i - 1] + arr[i];
    }
    return pref;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input array size : ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("Input " + n + " array element : ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    
    //     Given an integer array 'arr', return the prefix sum/running sum of the array
    System.out.println("Prefix Sum : "+Arrays.toString(prefixSum(arr)));
    sc.close();
  }
}
