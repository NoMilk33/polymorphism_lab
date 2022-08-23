package bankingarms;

import accounts.Account;

import java.util.ArrayList;
import java.util.HashMap;

public class BankingArm {

    private String name;
    private HashMap<String, Integer> accounts;

    public BankingArm(String name){
        this.name = name;
        this.accounts = new HashMap<>();
    }

//    getters

    public String getName() {
        return name;
    }

    public HashMap<String, Integer> getAccounts(){
        return accounts;
    }

//    setters

    public void setName(String name){
        this.name = name;
    }

    public void setAnimals(HashMap<String, Integer> accounts) {
        this.accounts = accounts;
    }

//    methods

    public void addAccount(Account account) {
        this.accounts.put(Account);
    }

    public int countAccounts(){
        return this.accounts.size();

//    public static void main(String[] args) {
//        HashMap<String, Integer> accountAgeInYears = new HashMap<>();
//        accountAgeInYears.put("Account 1", 3);
//        accountAgeInYears.put("Account 2", 6);
//        accountAgeInYears.put("Account 3", 1);
//
//        System.out.println("Number of accounts is: " + accountAgeInYears.size());
}





}
