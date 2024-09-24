public class Lambda{

  public static void main(String args[])
  {
    (int a, int b) -> { return a + b; }
    () -> System.out.println("Hello world");
    (String s) -> { System.out.println(s); }
    () -> 42
    () -> { return 3.1415 };
    a -> a > 10
  }
}
