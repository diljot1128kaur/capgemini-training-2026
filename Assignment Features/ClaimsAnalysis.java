import java.util.*;
import java.util.stream.Collectors;

class Claim {
    String policyNumber;
    double claimAmount;
    String status;

    Claim(String policyNumber, double claimAmount, String status) {
        this.policyNumber = policyNumber;
        this.claimAmount = claimAmount;
        this.status = status;
    }
}

public class ClaimsAnalysis {
    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
            new Claim("P101", 6000, "Approved"),
            new Claim("P101", 8000, "Approved"),
            new Claim("P102", 12000, "Approved"),
            new Claim("P103", 3000, "Rejected")
        );

        Map<String, Double> totalByPolicy =
            claims.stream()
                .filter(c -> c.status.equals("Approved"))
                .filter(c -> c.claimAmount > 5000)
                .collect(Collectors.groupingBy(
                    c -> c.policyNumber,
                    Collectors.summingDouble(c -> c.claimAmount)
                ));

        totalByPolicy.entrySet().stream()
            .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
            .limit(3)
            .forEach(System.out::println);
    }
}
