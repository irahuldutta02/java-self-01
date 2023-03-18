import java.util.Scanner;

class NumDivisibilityException extends RuntimeException{
    public NumDivisibilityException(String message){
        super(message);
    }
}
public class DivisibilityCheak {
    static void numDivisibility(int n){
        if ((n%5==0) && (n%11==0)){
            System.out.println(n+" is divisible by both 5 and 11");
        }else{
            throw new NumDivisibilityException(n+" is not divisible by both 5 and 11");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        try{
            numDivisibility(num);
        }catch(NumDivisibilityException e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
