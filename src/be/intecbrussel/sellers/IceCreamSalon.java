package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller {

    private PriceList priceList;
    private double totalProfit;


    //Constructors
    public IceCreamSalon() {
    }

    public IceCreamSalon(PriceList priceList, double totalProfit) {
        this.priceList = priceList;
        this.totalProfit = totalProfit;
    }

    //Methods
    public double getProfit() {
        return totalProfit;
    }

    public Cone orderCone(Cone.Flavor[] flavors) {
        totalProfit += priceList.getBallPrice();
        return new Cone(flavors);
    }

    public IceRocket orderIceRocket() {
        totalProfit += priceList.getRocketPrice();
        return new IceRocket();
    }

    public Magnum orderMagnum(Magnum.MagnumType type) {
        totalProfit += priceList.getMagnumPrice(type);
        return new Magnum(type);
    }

    public String toString() {
        return "IceCreamSalon" + "priceList: " + priceList + " totalProfit: " + totalProfit;
    }
}

