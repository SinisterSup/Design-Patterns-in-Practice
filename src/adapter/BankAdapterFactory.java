package adapter;

import adapter.adapters.ICICIBankAdapter;
import adapter.adapters.YESBankAdapter;

public class BankAdapterFactory {
    // This factory class will create instances of the appropriate BankAPI adapter based on the bank type
    public static BankAPI getBankAdapter(BankType bankType) {
        return switch (bankType) {
            case YESBank -> new YESBankAdapter();
            case ICICIBank -> new ICICIBankAdapter();
//            case HDFCBank -> throw new UnsupportedOperationException("HDFC Bank adapter not implemented yet");
            case SBIBank -> throw new UnsupportedOperationException("SBI Bank adapter not implemented yet");
            // Add more cases for other banks as needed
            default -> throw new IllegalArgumentException("Unsupported bank type: " + bankType);
        };
    }
}
