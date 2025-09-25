package Sample.structures.generic;

/**
 * A generic container that can store an object of any type. Compare this class
 * to the ObjectBox class in the linear.object package to see how the same
 * functionality is accomplished using Object references, and the issues that
 * can result.
 * 
 * @author William Goble
 * @author Dickinson College
 * @version Feb 12, 2024
 */

/*
 * The <T> is a "Type Parameter". It will take on a specified type when an
 * object is created. For example, the line:
 * 
 * GenericBox<String> gp = new GenericBox<String>();
 * 
 * results in T taking on the type String.
 */

public class GenericBox<T> {
    private T value;

    public GenericBox(T initValue) {
        value = initValue;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        // Create a GenericBox to hold a String object
        GenericBox<String> stringBox = new GenericBox<String>("Hello world");
        // Create a GenericBox to hold a Double object
        GenericBox<Double> doubleBox = new GenericBox<Double>(3.14159);

        /*
         * Since the compiler knows what type the generic object operates on
         * type casting are not required when retrieving values
        */

        String str = stringBox.getValue();
        System.out.println(String.format("Here is my string: %s", str));

        Double dbl = doubleBox.getValue();
        System.out.println(String.format("Here is my double: %f", dbl));

        /*
         * Similarly, the compiler is able to detect and flag many type errors
         * making them easier to diagnose and fix.
         * 
         * uncomment to see error
         */
        //stringBox.setValue(new Double("3.17"));
        //doubleBox.setValue("999.99");

        //Double dbl2 = (Double) stringBox.getValue();
        //String str2 = (String) doubleBox.getValue();
    }
}
