package andrew.nestedClasses;

public class Problem {
    //make variables static
    static String s;
    static class Inner {
        void testMethod() {
            s = "Set from Inner";
        }
    }
}