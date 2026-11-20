package Model;

import java.util.List;

public class PrintUtil implements KeyValueDetailable {
    
     public static <T extends KeyValueDetailable> void getKeyValueDetails(List<T> list) {
        for (T item : list) {
            System.out.println(item.getKeyValueDetails());
        }
    }
}
