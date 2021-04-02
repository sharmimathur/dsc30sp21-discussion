public class Discussion {

    // State / Instance Variables
    // IMPORTANT: must declare instance variables out here to be used in whole class

    int x = 0;
    // x = 0;

    static int y = 0;
    String disc;

    // Here is the constructor
    public Discussion(String discussion) {

            x = 0;
            disc = discussion;

    }

    // Here is the main method
    public static void main(String[] args) {
        System.out.println("hi");

        // System.out.println(Discussion.sample(1, 1));
        Discussion.test();
        Discussion.test();


        //Discussion d = new Discussion("discussion1");
    }

    // Here is a sample method
    /** Showing off some fun java stuff */
    public static void test() {


        System.out.println("Hi there!");

        /*
         * This is a multi-line comment
         */

        // This is an inline comment

        int[] lst = {1,2,3,4,5};



        for (int num: lst) {
            // whatever code here
        }


        for (int i = 0; i < 3; i++) {
            System.out.println("For Loop Iteration #" + i); // notice no need to cast "i" to a string!
        }

        int i = 0;
        while (i < 3) {
            System.out.println("While Loop Iteration #" + i);
            i++;
        }

        // This is a local variable
        double num = 2.0;



        // non static variable cant be referenced in a static function
        // x += 1;

        // static variable, no problems
        y += 1;
        System.out.println(y);





        // Let's try casting
        int z = 0;
        double a = (double)z;
        System.out.println("Casted var: " + a);


        String s = "test";
        // int b = s + 1;

    }

    public static int sample(int a, int b) {

        return a + b;
    }

}
