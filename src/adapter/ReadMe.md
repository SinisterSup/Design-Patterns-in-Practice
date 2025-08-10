# Adapter Design Pattern

## Overview
This package demonstrates the **Adapter Design Pattern** through a PhonePe payment application integrating with multiple bank APIs. The adapter pattern allows incompatible interfaces to work together by converting one interface into another that clients expect.

## Implementation Components

1. **Target Interface**: `BankAPI.java` - Common interface expected by PhonePe
2. **Third-Party APIs (Adaptees)**:
   - `ICICIBankAPI.java` - ICICI Bank's proprietary API
   - `YESBankAPI.java` - YES Bank's proprietary API
3. **Adapters**:
   - `ICICIBankAdapter.java` - Adapts ICICI Bank API to the common interface
   - `YESBankAdapter.java` - Adapts YES Bank API to the common interface
4. **Factory**: `BankAdapterFactory.java` - Creates appropriate adapters
5. **Client**: `PhonePe.java` - Uses the unified interface

## Key Benefits

- **Decoupling**: PhonePe operates without knowledge of specific bank API implementations
- **Extensibility**: New banks can be added without modifying client code (Open/Closed Principle)
- **Maintainability**: Separation of concerns with each adapter handling one specific bank API
- **Standardization**: Uniform interface for varied underlying systems

## Example Usage

```java
// Using factory to get appropriate adapter
BankAPI bankAPI = BankAdapterFactory.getBankAdapter(BankType.ICICIBank);
bankAPI.checkBalance("accountNumber");
bankAPI.transferMoney("fromAccount", "toAccount", amount);
```

## Design Principles Applied

- **Dependency Inversion**: High-level modules depend on abstractions
- **Single Responsibility**: Each adapter has one job - adapting a specific bank API
- **Liskov Substitution**: Any adapter can be used interchangeably

This implementation serves as a hands-on example of how the Adapter Pattern enables integration with varied external systems while maintaining good software design principles.
