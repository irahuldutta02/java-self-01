import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try{
                int a, b;
                System.out.println("Enter a value : ");
                a = sc.nextInt();
                System.out.println("Enter b value : ");
                b = sc.nextInt();
                System.out.println("Result : " + (a / b));
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Rest of the code : ");
            int arr[] = new int[5];
            arr[5]=90;
            System.out.println("Added value : "+arr[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occerd index out of bound.");
        }finally{
            System.out.println("Finally block alwas gets exicuted.");
        }
    }
}
