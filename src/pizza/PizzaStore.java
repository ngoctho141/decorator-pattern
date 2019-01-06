package pizza;
import java.lang.Throwable;
abstract class Pizza {
    private String description = "Unknown pizza";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract int getCost();
}

class Margherita extends Pizza {

    Margherita() {
        setDescription("Margherita");

        /**
         * TODO
         *  FIXME
         *
         */






    }

    @Override
    public int getCost() {
        return 100;
    }
}


class FarmHouse extends Pizza {

    public FarmHouse() {
        setDescription("FarmHouse");
    }

    @Override
    public int getCost() {
        return 200;
    }
}


class PeppyPaneer extends Pizza {

    public PeppyPaneer() {
        setDescription("PeppyPaneer");
    }

    @Override
    public int getCost() {
        return 100;
    }
}

class ChickenFiesta extends Pizza {
    public ChickenFiesta() {
        setDescription("ChickenFiesta");
    }

    public int getCost() {
        return 200;
    }
}

abstract class Topping extends Pizza {
    public abstract String getDescription();
}

class FreshTomato extends Topping {
    Pizza pizza;

    public FreshTomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 40;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", FreshTomato ";
    }
}

class Barbeque extends Topping {
    Pizza pizza;

    public Barbeque(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 90;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Barbeque ";
    }
}

class Paneer extends Topping {
    Pizza pizza;

    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 70;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Paneer ";
    }
}

class Jalapeno extends Topping {
    Pizza pizza;

    public Jalapeno(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Jalapeno ";
    }
}

public class PizzaStore{
    public static void main(String[] args) {
        Pizza pizza;
        pizza = new Margherita();
        System.out.println(pizza.getDescription() +
                " Cost :" + pizza.getCost());

        pizza = new FreshTomato(pizza);
        System.out.println(pizza.getDescription() +
                " Cost :" + pizza.getCost());

        pizza = new Paneer(pizza);
        System.out.println(pizza.getDescription() +
                " Cost :" + pizza.getCost());
    }
}


