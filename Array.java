public class Array {
    public static void main(String[] args){
        int a =10;
        int b[] = {19,25,36,47,51};
        System.out.println(a);
        System.out.println(b[0]);
        try {
            System.out.println(b[5]);
        }
        catch (Exception m){
            m.printStackTrace();
            System.out.println("Array Index out of bounds");
        }
            System.out.println(b[2]);
        b[2] = 11;
        System.out.println(b[2]);
    }
}
