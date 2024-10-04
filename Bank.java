
package core;
import java.util.*;
class bank1 {
String username;
static int  id=0;
String mobile;
int user_id;
int intial_amount=1000;

bank1(){
  user_id=id;
  id++;
  int intial_amount;
}
public bank1(String a , int b , String c, int d) {
  this.username=a;
this.id=b;
this.mobile=c;
this.intial_amount=d;
}


public String getUsername() {
  return username;
}

public void setUsername(String username) {
  this.username = username;
}

public String getMobile() {
  return mobile;
}
public void setMobile(String mobile) {
  this.mobile = mobile;
}

public int getUser_id() {
  return user_id;
}

public void setUser_id(int user_id) {
  this.user_id = user_id;
}

public int getIntial_amount() {
  return intial_amount;
}

public void setIntial_amount(int intial_amount) {
  this.intial_amount = intial_amount;
}
public String toString() {
  return "Bank[username="+ username+",mobile="+mobile+",user_id="+user_id+",initial_amt="+intial_amount+"]";
}
public void deposit(int amount) {
  this.intial_amount+=amount;
}
public  void debit(int amount) {
  this.intial_amount-=amount;
}
}
public class Bank {
    public static void main(String[] args) {
      
      
        System.out.println("Welcome to the bank");
        Scanner sc = new Scanner(System.in);
        System.out.println("User count");
        int usercount=sc.nextInt();
        bank1[] bankDetails = new bank1[1];
        boolean ans = true;
      
        while (ans) {
            System.out.println("1-add 2-display 3-deposit 4-debit  5-exit");
            int num  = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("_");
                    boolean add = Add(bankDetails);
                    if (add) {
                        System.out.println("Added Successfully");
                        System.out.println("_");
                   } 
                    break;

                case 2:
                    System.out.println("_");
                    for (int i = 0; i < bankDetails.length; i++) {
                        if (bankDetails[i] != null) {
                            System.out.println("_");
                            System.out.println(bankDetails[i]);
                        }
                    }
                    break;

                case 3:
                     System.out.println("Enter userid:");
                         int userId = sc.nextInt();
                         System.out.println("Enter amount to deposit:");
                         int depositAmount = sc.nextInt();
                         if (userId >= 0 && userId < bankDetails.length) {
                           bankDetails[userId].deposit(depositAmount);
                             System.out.println("New balance: " +bankDetails[userId].getIntial_amount());
                         } else {
                             System.out.println("Invalid user ID");
                         }
                         break;
                   
                case 4:
                System.out.println("Enter userid:");
                    int u_Id = sc.nextInt();
                    System.out.println("Enter amount to debit:");
                    int debitAmount = sc.nextInt();
                    bankDetails[u_Id].debit(debitAmount);
                    if (u_Id >= 0 && u_Id < bankDetails.length) {
                       System.out.println(" balance: " +bankDetails[u_Id].getIntial_amount());
                    } else {
                        System.out.println("Invalid user ID");
                    }
                    break;

                case 5:
                    System.out.println("_");
                    System.out.println("Thank you for visit");
                    System.out.println("_");
                    ans = false;
                    break;


default:
                    System.out.println(" Please try again.");
                    break;
          
        }}
    
    }
    public static boolean Add(bank1[] bankDetails) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < bankDetails.length; i++) {
            if (bankDetails[i] == null) {
              bankDetails[i]=new bank1();
                System.out.println("Enter the Name");
                String name = sc.nextLine();
                System.out.println("Enter the Mobile");
                String mobile = sc.nextLine();
                bankDetails[i].setUsername(name);
                bankDetails[i].setMobile(mobile);
            
            
        }
        }
        return false;
    }
}