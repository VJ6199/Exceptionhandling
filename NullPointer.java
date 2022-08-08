public class NullPointer {
    public static void main(String[] args) {
       Parent v = new Parent();
      Son g = null;
      try {
          System.out.println(v.Father);
            System.out.println(g.Son1);
        }
        catch(Exception d){
          d.printStackTrace();
        }
    }
}
class Parent{
    String Father = "Ramesh";
}
class Son{
    String Son1 = "Suresh";
}