package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;

public class IceCreamAppV2 {

    public static void main(String[] args) {
        PriceList priceList = new PriceList(2.5, 3, 4);
        Stock stock = new Stock(2, 4, 6, 4);

        //IceCreamCar
        System.out.println("ICE CREAM CAR\n");
        IceCreamCar iceCreamCar = new IceCreamCar(priceList, stock);

        //Order
        Eatable[] mySecondOrder = new Eatable[]{
                iceCreamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.MOKKA}),
                iceCreamCar.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE),
        };

        //Eat
        for (int i = 0; i < mySecondOrder.length; i++) {
            mySecondOrder[i].eat();
        }

        //IceCream Car profit
        System.out.println("There are " + stock + " left in our stock");
        System.out.println("\nProfit : " + iceCreamCar.getProfit() + "€");

    }
}
