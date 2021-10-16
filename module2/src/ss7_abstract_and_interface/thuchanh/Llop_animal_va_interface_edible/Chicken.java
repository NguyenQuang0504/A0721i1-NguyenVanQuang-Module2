package ss7_abstract_and_interface.thuchanh.Llop_animal_va_interface_edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return " Chicken: Oooooo!!!";
    }

    @Override
    public String howToEat() {
        return "Chicken: An lua!!!";
    }
}
