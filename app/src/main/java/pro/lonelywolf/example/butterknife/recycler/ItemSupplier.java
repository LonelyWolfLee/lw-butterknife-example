package pro.lonelywolf.example.butterknife.recycler;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemSupplier {
    private static final List<String> items = Arrays.asList(
            "First Item",
            "Second Item",
            "Third Item",
            "Fourth Item",
            "Fifth Item");

    public static List<String> get() {
        return new ArrayList<>(items);
    }
}
