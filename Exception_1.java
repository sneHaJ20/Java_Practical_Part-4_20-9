public class Exception_1 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("1st catch of Arithmatic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2nd catch of Array out of Bound");
        } catch (Exception e) {
            System.out.println("out catch");
        }
        try {
            int a[] = new int[5];
            a[5] = 30;
        } catch (ArithmeticException e) {
            System.out.println("3rd catch");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("4th catch");
        } catch (Exception e) {
            System.out.println("in catch");
        }
    }
}
