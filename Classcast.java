public class Classcast {
    public static void main(String[] args) {
        Parent1 v = new Parent1();
        v.Father();
        try {
            Son1 s1 = (Son1) v;
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Parent1 cant be cast to Son1");
        }
       Son2 vh2 = new Son2();
        System.out.println(vh2.younger);
    }
}
class Parent1 {
    void Father() {
        String name = "Ramesh";
        System.out.println(name);
    }
}

    class Son1 extends Parent1 {
        String elder = "Satish";

    }

    class Son2 extends Parent1 {
        String younger = "Suresh";
    }