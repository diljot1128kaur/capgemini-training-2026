import java.util.*;
import java.util.stream.Collectors;

class Transaction {
    String policyNumber;
    double amount;
    boolean isFraud;

    Transaction(String policyNumber, double amount, boolean isFraud) {
        this.policyNumber = policyNumber;
        this.amount = amount;
        this.isFraud = isFraud;
    }
}

public class FraudDetection {
    public static void main(String[] args) {

        List<Transaction> transactions = Arrays.asList(
            new Transaction("P101", 15000, true),
            new Transaction("P101", 20000, true),
            new Transaction("P102", 60000, true)
        );

        Map<String, List<Transaction>> fraudMap =
            transactions.stream()
                .filter(t -> t.isFraud)
                .filter(t -> t.amount > 10000)
                .collect(Collectors.groupingBy(t -> t.policyNumber));

        fraudMap.forEach((policy, list) -> {
            double totalAmount = list.stream().mapToDouble(t -> t.amount).sum();
            int count = list.size();

            if (count > 5 || totalAmount > 50000) {
                System.out.println("Fraud detected for policy " + policy);
            }
        });
    }
}
