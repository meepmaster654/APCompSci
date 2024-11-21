public class ImmutableAdressTest {
    public static void main(String[] args) {
        Address aOne = new Address("a", "b", "c", 1);
        Address aTwo = aOne;
        aTwo = aTwo.setStreet("d");
        System.out.println(aTwo);
        System.out.println(aOne);
    }
}
