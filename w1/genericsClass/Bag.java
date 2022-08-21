package w1.genericsClass;

public class Bag <T>{
    private  T element;
    public void pack(T element){
        this.element = element;
    }



    public T getElement(){
        return element;
    }
}
