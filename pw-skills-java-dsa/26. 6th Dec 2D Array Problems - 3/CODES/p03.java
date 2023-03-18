import java.util.Scanner;

// Given a matrix 'a' of dimension n x m and 2 coordinates (11, rl) and (12, r2).
// Return the sum of the rectangle from (ll,rl) to (12, r2). // precalculating (most optimized)

public class p03 {

  //print 2d array
  static void print2dArrays(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print("[ ");
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.print("]");
      System.out.println();
    }
  }

  // taking 2d array input
  static int[][] create2dArray() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input Number rows : ");
    int n = sc.nextInt();
    System.out.println("Input Number columns : ");
    int m = sc.nextInt();
    int[][] arr = new int[n][m];

    System.out.println("Input " + m * n + " array elements : ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    return arr;
  }

  //prefix sum for 2d array in place row wise
  static void findPrefixSum(int[][] arr) {
    int r = arr.length;
    int c = arr[0].length;

    for (int i = 0; i < r; i++) {
      for (int j = 1; j < c; j++) {
        arr[i][j] += arr[i][j - 1];
      }
    }
  }

  //prefix sum for 2d array in place column wise
  static void findPrefixSum2(int[][] arr) {
    int r = arr.length;
    int c = arr[0].length;

    for (int i = 1; i < r; i++) {
      for (int j = 0; j < c; j++) {
        arr[i][j] += arr[i - 1][j];
      }
    }
  }

  static int findSum2(int[][] arr, int l1, int r1, int l2, int r2) {
    int ans = 0, sum = 0, up = 0, left = 0, leftUp = 0;
    findPrefixSum(arr);
    findPrefixSum2(arr);
    sum = arr[l2][r2];
    if(r1>0){
        left = arr[l2][r1-1];
    }
    if(l1>0){
        up = arr[l1-1][r2];
    }
    if(l1>0 && r2>0){
        leftUp = arr[l1-1][r1-1];
    }
    ans = sum - up - left + leftUp;
    return ans;
  }

  public static void main(String[] args) {
    int[][] arr = create2dArray();
    System.out.println("Original array : ");
    print2dArrays(arr);

    Scanner sc = new Scanner(System.in);
    System.out.println("Rectangle boundaries  l1 r1 l2 r2 : ");
    int l1 = sc.nextInt();
    int r1 = sc.nextInt();
    int l2 = sc.nextInt();
    int r2 = sc.nextInt();

    System.out.println("Rectangle Sum : " + findSum2(arr, l1, r1, l2, r2));
  }
}
