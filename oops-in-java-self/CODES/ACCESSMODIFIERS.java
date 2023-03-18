class Account {

  public String name;
  protected String email;
  private String password;

  //setter
  public void setPassword(String password) {
    this.password = password;
  }
  //getter
  public String getPassword() {
    return this.password;
  }
}

public class ACCESSMODIFIERS {

  public static void main(String args[]) {
    Account a1 = new Account();
    a1.name = "Apna College";
    a1.setPassword("abcd");
    a1.email = "hello@apnacollege.com";
    System.out.println(a1.getPassword());
  }
}
