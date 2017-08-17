package com.example.java;

import java.util.*;

/**
 * Created by maiq on 29/07/17.
 */

class CustomClassInMapAndSetThree{

    private int id;
    private String name;

    public CustomClassInMapAndSetThree(int id, String name){

        this.id = id;
        this.name = name;
    }

    //@Override
    //public String toString(){
      //  return "{id: "+id+", name: "+name+"}";
    //}


    @Override
    public String toString() {
        return "CustomClassInMapAndSetThree{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomClassInMapAndSetThree that = (CustomClassInMapAndSetThree) o;

        if (id != that.id) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}

/*class CustomClassInMapAndSetTwo{
}*/

public class CustomClassInMapAndSet {

    public static void main(String[] args) {

        CustomClassInMapAndSetThree customClassInMapAndSetThree1 = new CustomClassInMapAndSetThree(101, "Mohan");
        CustomClassInMapAndSetThree customClassInMapAndSetThree2 = new CustomClassInMapAndSetThree(112, "Madan");
        CustomClassInMapAndSetThree customClassInMapAndSetThree3 = new CustomClassInMapAndSetThree(1897, "Steve");
        CustomClassInMapAndSetThree customClassInMapAndSetThree4 = new CustomClassInMapAndSetThree(101, "Mohan");


        Map<CustomClassInMapAndSetThree, Integer> hashMap = new HashMap<CustomClassInMapAndSetThree, Integer>();

        //Set<CustomClassInMapAndSetThree> set = new HashSet<CustomClassInMapAndSetThree>();

        hashMap.put(customClassInMapAndSetThree1, 1);
        hashMap.put(customClassInMapAndSetThree2, 2);
        hashMap.put(customClassInMapAndSetThree3, 3);
        hashMap.put(customClassInMapAndSetThree4, 4);


        System.out.println("Map");
        for (CustomClassInMapAndSetThree key:hashMap.keySet()){

            System.out.println(key+": "+hashMap.get(key));
        }
        System.out.println();

        Set<CustomClassInMapAndSetThree> set1 = new HashSet<CustomClassInMapAndSetThree>();

        set1.add(customClassInMapAndSetThree1);
        set1.add(customClassInMapAndSetThree2);
        set1.add(customClassInMapAndSetThree3);
        set1.add(customClassInMapAndSetThree4);


        System.out.println("Set");
        for (CustomClassInMapAndSetThree element:set1){

            System.out.println(element);
        }


        System.out.println("Set");
        System.out.println(set1);

    }
}
