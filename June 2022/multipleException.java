public class multipleException {
    public static void main (String [] args) {
        try {
            int result=divideNumber(69,0);
            System.out.println("Result: "+result);
        } catch (ArithmeticException e) {
            System.out.println("ERR: Can't divide by 0");
        } catch (NullPointerException e) {
            System.out.println("ERR: NUll pointer exception");
        } catch (Exception e) {
            System.out.println("ERR: An unexpected error occured");
        }
    }
    public static int divideNumber (int dividend, int divisor) {
        return dividend/divisor;
    }
}