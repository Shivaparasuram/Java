package OOPS.INNER_CLASS_8;

public class PRO5_Anonymous {
    void add(int a, int b) {
        System.out.println("Base add: " + (a + b));
    }

    public static void main(String[] args) {
        PRO5_Anonymous obj = new PRO5_Anonymous() {
            @Override
            void add(int a, int b) {
                System.out.println("Anonymous add: " + (a + b));
            }
        };

        obj.add(5, 3); // Output: Anonymous add: 8
    }
}