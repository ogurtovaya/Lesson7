package Cat.ru;

public class Cat1 {

    private final String name;
    private boolean isFed;

    public Cat1(String name) {
        this.name = name;
    }

    public void eat(CatEats plate){
        isFed = plate.Food(3);
    }

    @Override
    public String toString() {
        return "Cat1{" +
                "name='" + name + '\'' +
                ", isFed=" + isFed +
                '}';
    }
}
