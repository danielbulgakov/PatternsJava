package org.example.TemplatePattern.Products;

import org.example.TemplatePattern.Generics.AbstractProduct;

public class PerishableProduct extends AbstractProduct {


    public PerishableProduct(String name, int sizex, int sizey, int sizez, int weight) {
        super(name, sizex, sizey, sizez, weight);
    }

    @Override
    public String GetProductType(){
        return "Продукт питания.";
    }

    @Override
    public String GetTypeOfFloor(){
        return "Для хранения на полках";
    }

    @Override
    public String GetSavingPlace(){
        return "Для хранения в морозильной камере.";
    }

}
