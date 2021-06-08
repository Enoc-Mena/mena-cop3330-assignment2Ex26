/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex26;

import java.util.Scanner;
import java.lang.*;

public class PaymentCalculator {

    public void calculateMonthsUntilPaidOff(double i, double b, double p) {

        double monthsToPayOff, monthsToPayOffRound;

        monthsToPayOff = -(1/30.0) * Math.log(1 + b/p * (1 - (Math.pow(1 + i, 30)))) / (Math.log(1 + i));
        monthsToPayOffRound = Math.ceil(monthsToPayOff);

        System.out.print("It will take you " + monthsToPayOffRound + " months to pay off this card.");

    }

    public static void main(String[] args) {

        double balance, APR, monthlyPayment;

        //Balance Input
        Scanner bal = new Scanner(System.in);
        System.out.print("What is your balance: ");
        balance = bal.nextDouble();

        Scanner apr = new Scanner(System.in);
        System.out.print("What is the APR on the card (as a percent): ");
        APR = apr.nextDouble();

        double aprDivide = APR / 100;
        double aprMath = aprDivide / 365;

        Scanner monthly = new Scanner(System.in);
        System.out.print("What is the monthly payment you can make: ");
        monthlyPayment = monthly.nextDouble();

        PaymentCalculator myObj = new PaymentCalculator();
        myObj.calculateMonthsUntilPaidOff(aprMath, balance, monthlyPayment);

    }

}
