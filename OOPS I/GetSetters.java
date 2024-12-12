public class GetSetters {
    
    public static void main(String[] args) {
        BankAccount myacc=new BankAccount();
        myacc.username="abc";
        myacc.amt=50000;
        System.out.println(myacc.username);
        System.out.println(myacc.amt);
       
        // myacc.Password="xyz";
        // to set pasword
        myacc.SetPassword("xyz");
        

        // to get password
         // System.out.println(myacc.Password);
         System.out.println(myacc.GetPassword());     
    }
   
    
}
class BankAccount{
    String username;
    private String Password;
    protected int amt;

    String GetPassword(){
        return this.Password;
    }
  public void  SetPassword(String Password){
       this.Password= Password;
    }
   
}
