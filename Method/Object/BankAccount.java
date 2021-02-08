package Method.Object;

public class BankAccount { 
        int account_no;  
        String name;  
        double amount; 
}
class ProgramBA{
    static void set(BankAccount bankAccount, int account_no,String name, Double amount){  
        bankAccount.account_no = account_no;  
        bankAccount.name = name;  
        bankAccount.amount = amount; 
    }
    static void print(BankAccount bankAccount){
        System.out.println(bankAccount.account_no);
        System.out.println(bankAccount.name);
        System.out.println(bankAccount.amount);
    }

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        set(bankAccount1, 1234567, "Amin", 10000.00);
        print(bankAccount1);

        BankAccount bankAccount2 = new BankAccount();
        set(bankAccount2, 7654321, "Jamal", 10000.00);
        print(bankAccount2);
    }


}