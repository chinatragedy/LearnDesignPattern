package Example0302.Pizza;


import Example0302.Factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();

        System.out.println(dough.toString());
        System.out.println(sauce.toString());
        System.out.println(cheese.toString());
    }

    public CheesePizza() {
        name = "NYCheesePizza";
    }
}