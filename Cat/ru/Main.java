package Cat.ru;

public class Main {
    public static void main(String[] args) {
        doTask5();

    }
    static void doTask5(){
       Cat1[]  cat1s = {
               new Cat1("Barsik"),
               new Cat1("Vaska"),
               new Cat1("Kitty"),
               new Cat1("Soma")
       };

       CatEats plate = new CatEats();
        for (int i = 0; i < cat1s.length; i++) {
            cat1s[i].eat(plate);
            System.out.println(cat1s[i]);

        }

    }


}

