package Cat.ru;

public class CatEats {

    private static final int FULL_SIZE = 10;

    private int size = FULL_SIZE;

    public boolean Food(int request){
        if (request <= size){
            size -= request;
            return true;
        }
        return false;
    }

    public void PlusEats(int request){
        int sum = request + size;

       size = Math.max(sum, FULL_SIZE);

    }
    public void PlusEats(){
        size = FULL_SIZE;
    }

}
