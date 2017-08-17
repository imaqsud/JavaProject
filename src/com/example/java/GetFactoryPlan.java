package com.example.java;

/**
 * Created by maiq on 24/07/17.
 */
public class GetFactoryPlan {

    public Plan getPlan(String planType){
        if (planType == null){
            return null;
        }
        else if (planType.equalsIgnoreCase("Domestic")){
            return new Domestic();
        }
        else if (planType.equalsIgnoreCase("Commercial")){
            return new Commercial();
        }
        else if (planType.equalsIgnoreCase("Institutional")){
            return new Institutional();
        }
        return null;
    }
}
