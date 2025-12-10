package OOPS.METHODS_1;

public class PRE2 {
    static void main(String[] args) {

        String name ="Java Full Stack Developer";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(6)); //start from 0 index
        System.out.println(name.contains("python"));//check is data is present or not
        System.out.println(name.equals("java full stack"));
        System.out.println(name.equalsIgnoreCase("java full stack"));//not equal
        System.out.println(name.concat(" Pro batch   "));
        System.out.println(name.trim());//remove the space in the begging and ending only
        System.out.println(name.substring(0,10));//end index is not included
        System.out.println(name.startsWith("   J"));
        System.out.println(name.endsWith("Stack"));
        System.out.println(name.replace("Java","Python"));
        System.out.println(name.repeat(4));
        System.out.println(name.describeConstable());
        System.out.println(name.substring(3,6));

    }
}
