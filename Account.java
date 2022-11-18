import java.util.*;
import java.lang.String;
class bank
{
     int ac_no;
     String name, type;
     float amount;
     void details (int n, String nm, String t, float a) 
      {
            ac_no=n;
            name=nm;
            type=t;
            amount=a;
      }
      void show() 
       {
          System. out. println("Account no     ="+ac_no+"\nName           ="+name+"\nType           ="+type+"\namount         ="+amount) ;
       }
     void deposit (float a) 
    {
        amount =amount+a;
        System.out.println("Deposit amount     :"+a) ;
    }
   void withdraw (float a) 
    {
         if(amount<a) 
         System.out.println("Balance is insufficient ");
        else
        {
           amount=amount-a;
           System.out.println("Withdraw amount     :"+a) ;
        }
    }
   void checkbalance() 
  {
     System.out.println("TOTAL BALANCE    :"+amount);
  }
}
class Account
{
     public static void main(String args[]) 
      {
         bank b=new bank() ;
         Scanner in=new Scanner(System.in);
         System.out.println("enter account number");
         int n=in.nextInt();
         System.out.println("enter the account holder name");
         String c=in.next();
         System.out.println("enter the account type");
         String a=in.next();
         System.out.println("enter the amount");
         int x=in.nextInt();
         b. details (n,c,a,x) ;
         b. show() ;
         System.out.println("enter the deposite amount");
         int y=in.nextInt();
         b. deposit (y) ;
         b. checkbalance () ;
         System.out.println("enter the withdrawl amount");
         int z=in.nextInt();
         b. withdraw (z) ; 
         b. checkbalance () ;
}
}

