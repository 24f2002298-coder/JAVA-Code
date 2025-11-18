class Account {
    void viewBalance() {
        System.out.println("Viewing balance");
    }
}

class SavingsAccount extends Account {
    void calculateInterest() {
        System.out.println("Calculating interest for Savings Account");
    }
}

class PremiumSavingsAccount extends SavingsAccount {
    void offerPremiumBenefits() {
        System.out.println("Offering premium benefits");
    }
}

public class BankApp {
    public static void main(String[] args) {
        // Upcasting: parent reference, child object
        SavingsAccount acc = new PremiumSavingsAccount();

        acc.viewBalance(); // from Account
        acc.calculateInterest(); // from SavingsAccount

        // Downcasting to access child-specific method
        ((PremiumSavingsAccount) acc).offerPremiumBenefits();
    }
}

