package com.epam.evgenia_pritula.java.Electronics;

public class CursumerElectronics extends Appliances {
    private int height;

    public CursumerElectronics (String name;Boolean included; int power){
        super(name, included, power);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int CalculatePower(){
        return 10* 2 + height;

        @Override
        public String toString(){
            return "Appliances {"+ "name"+ included+ name};
    }

}
}
