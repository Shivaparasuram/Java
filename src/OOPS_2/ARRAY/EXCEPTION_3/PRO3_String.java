package OOPS_2.ARRAY.EXCEPTION_3;

public class PRO3_String {
    static void main(String[] args) {
        String str = null;

        // NullPointerException
        try {
            System.out.println(str.length());
        }
        catch (NullPointerException e) {
            System.out.println("Caught: " + e);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("\tMandatory Execution !");
        }
    }
}
