package org.example.TemplatePattern.Products;

import org.example.TemplatePattern.Generics.AbstractProduct;

public class ElectronicProduct extends AbstractProduct {

    public ElectronicProduct(String name, int sizex, int sizey, int sizez, int weight) {
        super(name, sizex, sizey, sizez, weight);
    }

    @Override
    public String GetProductType(){
        return "Электронные товары.";
    }

    @Override
    public String GetTypeOfFloor(){
        return "Для хранения на паллетах";
    }

    @Override
    public String GetSavingPlace(){
        return "Для хранения в складе общего доступа.";
    }

}
