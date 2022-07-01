package primer.imutabl;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("key", "value");


        // Инициализация нашего "иммутабельного" класса
        MutableClass mutable = new MutableClass("this is not immutable", map);
        // Можно легко добавлять элементы в map == изменение состояния
        mutable.getFieldMap().put("unwanted key", "another value");
        mutable.getFieldMap().keySet().forEach(e ->  System.out.println(e));


    }
}
