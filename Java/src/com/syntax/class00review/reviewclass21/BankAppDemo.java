package com.syntax.class00review.reviewclass21;

public class BankAppDemo {

    public static void main(String[] args) throws com.syntax.reviewclass21.LowFundsException {
        Account account=new Account(1000);
        account.withdrawFunds(800);
        account.withdrawFunds(800);
    }

}
