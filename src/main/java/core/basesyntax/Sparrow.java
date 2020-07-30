package core.basesyntax;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("The sparrow has flown away");
    }

    @Override
    public void feed() {
        System.out.println("The sparrow is eating...");
    }
}
