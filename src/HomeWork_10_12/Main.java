package HomeWork_10_12;

import static HomeWork_10_12.ToString.toStr;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ExampleClass exampleClass = new ExampleClass("Examel", 5, true,12.3333333333);
        System.out.println(toStr(exampleClass));
    }
}
