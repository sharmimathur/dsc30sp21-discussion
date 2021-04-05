public class Discussion2 {

    int var1;
    int var2;


    public Discussion2(int var1, int var2){

        // this.var1 = var1;
        this.var1 += var1;
        this.var2 += var2;

    }

    public static void main(String[] args) {
        Discussion2 d = new Discussion2(1, 2);
        System.out.println(d.var1);
        System.out.println(d.var2);


        Discussion2 d2 = new Discussion2(4, 5);
        System.out.println(d2.var1);
        System.out.println(d2.var2);

    }

    public int multiply(int x, int y) {

        return x * y;
    }

}