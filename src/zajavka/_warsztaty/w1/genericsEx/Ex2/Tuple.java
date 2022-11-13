package zajavka._warsztaty.w1.genericsEx.Ex2;

//public class Tuple<E1, E2> {
//    private E1 key;
//    private E2 value;
//    public Tuple(E1 key, E2 value) {
//        this.key = key;
//        this.value = value;
//    }
//    public E1 getKey() {
//        return key;
//    }
//    public E2 getValue() {
//        return value;
//    }
//    public void setKey(E1 key) {
//        this.key = key;
//    }
//    public void setValue(E2 value) {
//        this.value = value;
//    }
//}
public class Tuple {
    private Object key;
    private Object value;
    public Tuple(Object key, Object value) {
        this.key = key;
        this.value = value;
    }
    public Object getKey() {
        return key;
    }
    public Object getValue() {
        return value;
    }
    public void setKey(Object key) {
        this.key = key;
    }
    public void setValue(Object value) {
        this.value = value;
    }
}



