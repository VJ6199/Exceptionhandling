public class StringException {
    public static void main(String[] args) {
       String a = "vijay";
        try {
            System.out.println(a);
            System.out.println(a.charAt (6));
            System.out.println(a.charAt (2));
            System.out.println(a.charAt (1));

        } catch (Exception m) {
            m.printStackTrace();
            System.out.println("String Index out of bounds");
        }
        System.out.println(a.charAt (4));
    }
}

