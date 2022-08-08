public class Arithmetic {
    public static void main(String[] args){
        try {
            int a = 10;
            System.out.println("ppp");
            int b = 0;
            System.out.println("ppp");
            int c = a / b;
            System.out.println("ppp");
        }
        catch(Exception v){
            v.printStackTrace();
        }
        finally {
            System.out.println("Error due to dividing by zero");
        }
        System.out.println("dssds");

    }
}
