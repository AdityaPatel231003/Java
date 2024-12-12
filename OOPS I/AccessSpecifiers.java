public class AccessSpecifiers {
    public static void main(String[] args) {
        BankAccount myacc=new BankAccount();
        myacc.username="abc";
        // myacc.Password="xyz";
        myacc.amt=50000;
        System.out.println(myacc.username);
        System.out.println(myacc.amt);
        // System.out.println(myacc.Password);

        
    }
   
    
}
class BankAccount{
    String username;
    private String Password;
    protected int amt;
}