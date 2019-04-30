package com.epam.evgenia_pritula.java.Electronics;

public abstract class Appliances {
    private String name;
    private Boolean included;
    private int power;

    public Appliances(String name;Boolean included;int power){
        this.name = name;
        this.included = included;
        this.power = power;


    public abstract power();

    public String getName(){
        return name;
        }

    public getIncluded(){
        return included;
        }
     public getPower(){
        return power;
        }


        @Override
         public String toString(){
        return "Appliances {"+ "name"+ included+ name};
        }

    }
}
