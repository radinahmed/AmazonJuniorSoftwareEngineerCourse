public class Main {
    public static void main(String args[]) {
        String firstName = "Harry";
        String lastName = "Grow";
        String email = "harry.grow@example.com";
        String username = firstName.toLowerCase() + lastName.toLowerCase();
        String email1 = email.replace("example", "gmail");
        System.out.println(email1);
        System.out.println(email1.indexOf('@'));
        //TODO: Your code goes here
    }
}
