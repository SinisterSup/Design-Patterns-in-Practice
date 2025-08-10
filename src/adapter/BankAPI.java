package adapter;

public interface BankAPI {
    // the Client (PhonePe) will list down all the functionalities/services it needs from the BankAPI
    String getAccountBalanceDetails(String accountNumber);
    String transferFunds(String fromAccount, String toAccount, double amount);
    String getTransactionHistory(String accountNumber);
    // Additional methods can be added as needed
}
