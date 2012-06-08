package TEST;
class Annotated {
    @Test(info = "AWESOME")
    public void foo(String myParam) {
        System.out.println("TThis is " + myParam);
    }
}