package org.example.TemplatePattern;

import org.example.TemplatePattern.Generics.AbstractProduct;
import org.example.TemplatePattern.Products.ElectronicProduct;
import org.example.TemplatePattern.Products.HouseHoldProduct;
import org.example.TemplatePattern.Products.PerishableProduct;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<AbstractProduct> productList = new ArrayList<>();
        productList.add(new HouseHoldProduct("Стиральная машина", 10, 12, 10, 15));
        productList.add(new HouseHoldProduct("Зубная счетка", 1, 2, 3, 1));
        productList.add(new PerishableProduct("Мокровь", 100, 100,100, 20));
        productList.add(new ElectronicProduct("Телевизор", 10, 12, 3, 10));

        for (AbstractProduct item : productList){
            System.out.println("==========================");
            System.out.println(item.GetName());
            System.out.println(item.GetProductType());
            System.out.println(item.GetSavingPlace());
            System.out.println(item.GetTypeOfFloor());
            System.out.println("==========================");
        }


    }
}
