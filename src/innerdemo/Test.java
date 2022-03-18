package innerdemo;

public class Test {
    public static void main(String[] args) {
        class LocalClass{
            int num = 0;
            public void localMethod(){
                System.out.println(num);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.localMethod();
    }
}
