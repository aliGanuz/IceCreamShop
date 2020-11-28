package be.intecbrussel.eatables;

public class Magnum implements Eatable {

    private MagnumType type;

    public Magnum(MagnumType type) {
        this.type = type;
    }

    //Getter and setter
    public MagnumType getType() {
        return type;
    }

    public void setType(MagnumType type) {
        this.type = type;
    }

    public void eat() {
        System.out.println("Client eats " + getType());
    }

    public enum MagnumType {
        MILKCHOCOLATE,
        WHITECHOCOLATE,
        BLACKCHOCOLATE,
        ALPINENUTS,
        ROMANTICSTRAWBERRIES,

    }
}





