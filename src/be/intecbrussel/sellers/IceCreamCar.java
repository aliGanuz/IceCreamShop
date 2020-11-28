package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

import java.util.ArrayList;
import java.util.List;

public class IceCreamCar implements IceCreamSeller {

    private PriceList priceList;
    private double profit;

    public IceCreamCar(PriceList priceList, Stock stock) {
    }

    //Methods
    public Cone orderCone(Cone.Flavor[] flavors) {
        return new Cone(flavors);
    }

    private Cone prepareCone(Cone.Flavor[] flavors) {
        return new Cone(flavors);
    }

    public IceRocket orderIceRocket() {
        return new IceRocket();
    }

    private IceRocket prepareIceRocket() {
        return new IceRocket();
    }

    public Magnum orderMagnum(Magnum.MagnumType type) {
        return new Magnum(type);
    }

    private Magnum prepareMagnum(Magnum.MagnumType type) {
        return new Magnum(type);
    }

    public double getProfit() {
        return profit;
    }
}

