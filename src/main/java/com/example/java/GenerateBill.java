package com.example.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by maiq on 24/07/17.
 */
class GenerateBill {

    public static void main(String[] args) throws IOException {


        GetFactoryPlan getFactoryPlan = new GetFactoryPlan();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the type of plan: ");
        String planType = null;
        try {
            planType = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int units = Integer.parseInt(bufferedReader.readLine());

        Plan plan = getFactoryPlan.getPlan(planType);

        System.out.println("Bill amount for " + planType + " of  " + units + " units is: ");

        plan.getRate();

        plan.getBill(units);
    }

}
