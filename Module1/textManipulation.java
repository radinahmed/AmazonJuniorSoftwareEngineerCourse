public class Main {
    public static void main(String args[]) {
        String text = "Adventure";
        int leng= text.length();
        System.out.println(leng);
        char at= text.charAt(2);
        System.out.println(at);
        System.out.println(text.substring(0,4));

        String anotherText= "Adventure";
        System.out.println(text.equals(anotherText));
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.contains("vent"));
        System.out.println(text.replace('e','a'));
    }
}
