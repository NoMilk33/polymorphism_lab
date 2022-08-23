package bankingarms;

import java.util.HashMap;

public class BankingArm {

    private String name;

    public static void main(String[] args) {
        HashMap<String, Integer> accountAgeInYears = new HashMap<>();
        accountAgeInYears.put("Account 1", 3);
        accountAgeInYears.put("Account 2", 6);
        accountAgeInYears.put("Account 3", 1);

        System.out.println("Number of accounts is: " + accountAgeInYears.size());



}
