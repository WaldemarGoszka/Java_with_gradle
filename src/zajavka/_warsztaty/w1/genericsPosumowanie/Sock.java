package zajavka._warsztaty.w1.genericsPosumowanie;

public class Sock <T extends Swimmable>{
    private T item;

    public boolean put(T item){
        if (this.item == null || !this.item.equals(item) ){
            this.item = item;
            return true;
        }
        return false;
    }

    public T getItem() {
        return item;
    }
}
