package innerdemo;

public class Outer {
    private static int outerStatic;
    private int outerInstance;

    public static class Inner {
        public void innerMethod(){
            System.out.println(outerStatic);
        }
    }
}
