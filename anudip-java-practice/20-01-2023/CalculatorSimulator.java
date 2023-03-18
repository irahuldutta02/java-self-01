import java.util.Scanner;

class CountryNotValidException extends RuntimeException {

  public CountryNotValidException(String message) {
    super(message);
  }
}

class EmployeeNameInvalidException extends RuntimeException {

  public EmployeeNameInvalidException(String message) {
    super(message);
  }
}

class TaxNotEligibleException extends RuntimeException {

  public TaxNotEligibleException(String message) {
    super(message);
  }
}

class TaxCalculator {

  static void calculateTax(String empName, boolean isIndian, double empSal)
    throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
    double taxAmount = 0;
    if (isIndian == true) {
      if (empName != "") {
        if (empSal > 100000) {
          taxAmount = empSal * 8 / 100;
          System.out.println("Tax amount is : " + taxAmount);
        } else if ((empSal <= 100000) && (empSal > 50000)) {
          taxAmount = empSal * 6 / 100;
          System.out.println("Tax amount is : " + taxAmount);
        } else if ((empSal <= 50000) && (empSal > 30000)) {
          taxAmount = empSal * 5 / 100;
          System.out.println("Tax amount is : " + taxAmount);
        } else if ((empSal <= 30000) && (empSal > 10000)) {
          taxAmount = empSal * 4 / 100;
          System.out.println("Tax amount is : " + taxAmount);
        } else if (empSal < 10000) {
          throw new TaxNotEligibleException(
            "The employee does not need to pay tax"
          );
        }
      } else {
        throw new EmployeeNameInvalidException(
          "The employee name cannot be empty."
        );
      }
    } else {
      throw new CountryNotValidException(
        "The employee should be an Indian citizen for calculating tax"
      );
    }
  }
}

public class CalculatorSimulator {

  public static void main(String[] args) {
    boolean isIndian;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your name : ");
    String empName = sc.nextLine();
    System.out.println("Are you indian ? true (1) / false(0) : ");
    int c1 = sc.nextInt();
    if (c1 == 1) {
      isIndian = true;
    } else {
      isIndian = false;
    }
    System.out.println("Your salary : ");
    double empSal = sc.nextDouble();
    TaxCalculator.calculateTax(empName, isIndian, empSal);
    sc.close();
  }
}
