import java.util.Scanner;

class voterEligibilityException extends RuntimeException {
    public voterEligibilityException(String message) {
        super(message);
    }
}

public class VoterEligibility {
    static void eligibilityCheak(int age) throws voterEligibilityException {
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            throw new voterEligibilityException("You are not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();
        try {
            eligibilityCheak(age);
        } catch (voterEligibilityException e) {
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
