package adapter.adapters;

import adapter.BankAPI;
import adapter.thirdparty.icicibank.ICICIBankAPI;

public class ICICIBankAdapter implements BankAPI {
    // This class adapts the ICICIBankAPI to the BankAPI interface
    // It will use the ICICIBankAPI methods to implement and provide
    // the required functionalities/services defined in the BankAPI interface

//    private final ICICIBankAPI iciciBankAPI;
//    public ICICIBankAdapter(ICICIBankAPI iciciBankAPI) {
//        this.iciciBankAPI = iciciBankAPI;
//    }
    ICICIBankAPI iciciBankAPI = new ICICIBankAPI();

    @Override
    public String getAccountBalanceDetails(String accountNumber) {
        return iciciBankAPI.knowAccountBalance(accountNumber);
    }

    @Override
    public String transferFunds(String fromAccount, String toAccount, double amount) {
        return iciciBankAPI.transferFunds(fromAccount, toAccount, amount);
    }

    @Override
    public String getTransactionHistory(String accountNumber) {
        return iciciBankAPI.getTransactionHistory(accountNumber);
    }
}
