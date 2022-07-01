package primer.example;

public class Test {

    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        long meml, mem2;
        Integer someints[] = new Integer[1000];
        System.out.println("Bceгo памяти: " + r.totalMemory());
        meml = r.freeMemory();
        System.out.println("Cвoбoднoй памяти исходно: " + meml);
        r.gc();
        meml = r.freeMemory();
        System.out.println("Cвoбoднoй памяти после очистки: " + meml);
        for (int i = 0; i < 1000; i++){
            someints[i] = i;  // 11 выделить память для 11 объектов типа Integer
        }

            mem2 = r.freeMemory();
        System.out.println("Cвoбoднoй памяти после выделения: " + mem2);
        System.out.println("Иcпoльзoвaнo памяти для выделения: "
                + (meml - mem2));
        //11 отвергнуть объекты типа Integer
        for (int i = 0; i < 1000; i++) {
        }
        r.gc();
        //11 запустить сборку "мусора"
        mem2 = r.freeMemory();

        System.out.println("Cвoбoднoй памяти после очистки "
                + "отвергнутых объектов типа Integer: " + mem2);
    }
}
