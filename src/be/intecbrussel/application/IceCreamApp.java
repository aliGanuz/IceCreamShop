package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;

public class IceCreamApp {

    public static void main(String[] args) {
        System.out.println("ICE CREAM SALON\n");

        //PriceList
        PriceList priceList = new PriceList(2.5, 3, 4);

        //IceCream Salon
        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList, 0);

        //Order
        Eatable[] myOrder = new Eatable[]{
                iceCreamSalon.orderCone(new Cone.Flavor[]{Cone.Flavor.LEMON, Cone.Flavor.STRAWBERRY, Cone.Flavor.MOKKA}),
                iceCreamSalon.orderMagnum(Magnum.MagnumType.WHITECHOCOLATE),
        };

        //Eating
        for (int i = 0; i < myOrder.length; i++) {
            myOrder[i].eat();
        }

        //Profit
        System.out.println("\nProfit: " + iceCreamSalon.getProfit() + "€");


    }
}

