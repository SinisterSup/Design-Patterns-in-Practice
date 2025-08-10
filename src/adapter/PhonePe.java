package adapter;

import adapter.adapters.ICICIBankAdapter;
import adapter.thirdparty.icicibank.ICICIBankAPI;
import adapter.thirdparty.yesbank.YESBankAPI;

public class PhonePe {  // Core class of the PhonePe application/platform
    /*
     * PhonePe is a digital payment platform that allows users to make payments,
     * transfer money, and manage their finances through a mobile application.
     * It integrates with various banks and financial institutions to provide
     * seamless transactions.
     */
    /*
    //  Tight coupling of PhonePe with 3rd party Bank APIs
    private static YESBankAPI yesApi = new YESBankAPI();
    private static ICICIBankAPI iciciApi = new ICICIBankAPI();
    */

    //  Loose coupling of PhonePe with 3rd party Bank APIs
    //  This allows PhonePe to interact with different bank APIs without being tightly coupled to their implementations.
    //  This is achieved through the use of interfaces or adapters that abstract the bank-specific implementations.
    //  This way, if a new 3rd party(bank) API is introduced or an existing one changes,
    //  PhonePe can adapt without major changes to its codebase.

     static BankAPI bankApi = new ICICIBankAdapter();
    // static BankAPI bankApi = new YESBankAdapter(); // Uncomment this line to use YESBankAdapter instead

    //  Alternatively, we can use a factory pattern to get the appropriate bank adapter based on the bank type
    //  This allows for easy switching between different bank APIs without changing the core PhonePe code.
    static BankAPI bankAPI = BankAdapterFactory.getBankAdapter(BankType.ICICIBank);

    public static void main(String[] args) {
//        YESBankAPI yesApi = new YESBankAPI();
//        ICICIBankAPI iciciApi = new ICICIBankAPI();
//
//        String yesBalance = yesApi.checkBalance("YES12345");
//        String yesTransaction = yesApi.sendMoney(")YES12345", "YES67890", 100.0);
//        String yesHistory = yesApi.getTxnHistory("YES12345");
//        System.out.println(yesBalance);
//        System.out.println(yesTransaction);
//        System.out.println(yesHistory);
//        String iciciBalance = iciciApi.knowAccountBalance("ICICI67890");
//        String iciciTransaction = iciciApi.transferFunds("ICICI67890", "ICICI12345", 200.0);
//        String iciciHistory = iciciApi.getTransactionHistory("ICICI67890");
//        System.out.println(iciciBalance);
//        System.out.println(iciciTransaction);
//        System.out.println(iciciHistory);

        System.out.println(bankApi.getAccountBalanceDetails("67890"));
        System.out.println(bankApi.transferFunds("67890", "12345", 200.0));
        System.out.println(bankApi.getTransactionHistory("67890"));

        // If you want to switch to YES Bank, just change the bankApi instance
        // bankApi = new YESBankAdapter();
        // System.out.println(bankApi.getAccountBalanceDetails("12345"));
        // System.out.println(bankApi.transferFunds("12345", "67890", 100.0));
        // System.out.println(bankApi.getTransactionHistory("12345"));
    }

}

/* for Loose coupling of PhonePe with 3rd party Bank APIs, we can use the Adapter Design Pattern.
 *
 * The Adapter Design Pattern allows us to create a bridge between two incompatible interfaces.
 * In this case, we can create an adapter for each bank API that implements a common interface
 * that PhonePe can use. This way, PhonePe does not need to know the details of each bank's API,
 * and it can work with any bank that provides an adapter.
 *
 * This approach promotes flexibility and scalability, as new banks can be added without modifying
 * the core PhonePe codebase.
 *
 * 1. Create a common interface as per the requirements of the Client(PhonePe) to interact with the Bank APIs.
 * 2. Create adapters for each bank API that implements the common interface.
 * i.e., for every 3rd party dependency, create an adapter that implements the common interface required by the Client
 * to interact with the 3rd party API services.
 * 3. PhonePe can then use these adapters to interact with the bank APIs without being tightly coupled to their implementations.
 * 4. This allows PhonePe to remain flexible and adaptable to changes in the bank APIs
 *    or to add new banks in the future without significant changes to its codebase.
 */
