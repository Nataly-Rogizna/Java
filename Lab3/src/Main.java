public class Main {

    public static void main(String[] args) {
        var10Class c1 = new var10Class();
        double A1[] = {1, 2, 3, 4, 5};
        double A2[] = {1, 2, 2, 3, 4};
        System.out.println(c1.logika(13, 23, 42));  //3
        System.out.println(c1.poka(1.1));           //2
        System.out.println(c1.poka(1.11));          //1
        System.out.println(c1.massivy(A1));         //true
        System.out.println(c1.massivy(A2));         //false
    }
}
