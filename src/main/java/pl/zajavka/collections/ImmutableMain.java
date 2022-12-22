package zajavka.collections;

import java.util.ArrayList;
import java.util.List;

public class ImmutableMain {
    private List<String> list = new ArrayList<>(List.of("a", "b"));

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public static void main(String[] args) {

    }
}
