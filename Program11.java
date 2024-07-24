class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(String message)
    {
        super(message);
    }
}

class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message)
    {
        super(message);
    }
}

class Account
{
    private int id, balance;
    Account(int id, int balance)
    {
        this.id = id;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

public class Program11 {
    private static Account find(Account[] acs, int id)
    {
        for(Account ac : acs)
        {
            if(ac.getId() == id) return ac;
        }
        throw new AccountNotFoundException("Account Not Found");
    }

    private static boolean deduct(Account[] acs, int id,int amt) throws InsufficientFundsException, AccountNotFoundException
    {
        Account ac = find(acs, id);
        if(ac.getBalance() < amt) throw new InsufficientFundsException("Insufficient Funds");
        ac.setBalance(ac.getBalance() - amt);
        return true;
    }

    public static void main(String[] args) {
        Account[] acs = {
            new Account(0, 0),
            new Account(1, 100)
        };

        // try
        // {
            // find(acs, 2);
            deduct(acs, 2, 9);
        // }
        // catch(InsufficientFundsException e)
        // {
        //     System.out.println(e.getMessage());
        // }
        // catch(AccountNotFoundException e)
        // {
        //     System.out.println(e.getMessage());
        // }
    }
}
