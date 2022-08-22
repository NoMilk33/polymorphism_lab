package bank;

import divisions.Division;

public class Bank {

    private Division retailArm;
    private Division corporateArm;

    public Bank(Division retailArm, Division corporateArm){
        this.retailArm = retailArm;
        this.corporateArm = corporateArm;
    }

    public Division getRetailArm(){
        return this.retailArm;
    }

    public Division getCorporateArm(){
        return this.corporateArm;
    }

    public void setRetailArm(Division retailArm){
        this.retailArm = retailArm;
    }

    public void setCorporateArm(Division corporateArm){
        this.corporateArm = corporateArm;
    }

    public void addAccountToDivision(Division division, Account account){
        division.addAccount(account);
    }
}
