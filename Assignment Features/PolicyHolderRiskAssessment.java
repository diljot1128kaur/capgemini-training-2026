import java.util.*;
import java.util.stream.Collectors;

class PolicyHolder {
    int id;
    String name;
    int age;
    String policyType;
    double premium;

    PolicyHolder(int id, String name, int age, String policyType, double premium) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.policyType = policyType;
        this.premium = premium;
    }
}

class RiskAssessment {
    int id;
    String name;
    double riskScore;

    RiskAssessment(int id, String name, double riskScore) {
        this.id = id;
        this.name = name;
        this.riskScore = riskScore;
    }

    public double getRiskScore() {
        return riskScore;
    }

    public String toString() {
        return name + " -> " + riskScore;
    }
}

public class PolicyHolderRiskAssessment {
    public static void main(String[] args) {

        List<PolicyHolder> holders = Arrays.asList(
            new PolicyHolder(1, "Amit", 65, "Life", 40000),
            new PolicyHolder(2, "Riya", 70, "Life", 20000)
        );

        Map<String, List<RiskAssessment>> result =
            holders.stream()
                .filter(p -> p.policyType.equals("Life"))
                .filter(p -> p.age > 60)
                .map(p -> new RiskAssessment(
                        p.id,
                        p.name,
                        p.premium / p.age
                ))
                .sorted(Comparator.comparing(RiskAssessment::getRiskScore).reversed())
                .collect(Collectors.groupingBy(
                    r -> r.getRiskScore() > 0.5 ? "High Risk" : "Low Risk"
                ));

        System.out.println(result);
    }
}
