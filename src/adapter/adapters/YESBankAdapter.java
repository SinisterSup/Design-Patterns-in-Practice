package adapter.adapters;

import adapter.BankAPI;
import adapter.thirdparty.yesbank.YESBankAPI;

public class YESBankAdapter implements BankAPI {
    // This class adapts the YESBankAPI to the BankAPI interface
    // It will use the YesBankAPI methods to implement and provide
    // the required functionalities/services defined in the BankAPI interface

//    private final YESBankAPI yesBankAPI; // Composition: YESBankAdapter has a YESBankAPI instance
//    public YESBankAdapter(YESBankAPI yesBankAPI) {
//        this.yesBankAPI = yesBankAPI;
//    }
    YESBankAPI yesBankAPI = new YESBankAPI();

    @Override
    public String getAccountBalanceDetails(String accountNumber) {
        return yesBankAPI.checkBalance(accountNumber);
    }

    @Override
    public String transferFunds(String fromAccount, String toAccount, double amount) {
        return yesBankAPI.sendMoney(fromAccount, toAccount, amount);
    }

    @Override
    public String getTransactionHistory(String accountNumber) {
        return yesBankAPI.getTxnHistory(accountNumber);
    }
}
