import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Email = sc.nextLine();

        System.out.println("Email="+ Email);

        System.out.println("username = "+ Email.substring(0,Email.indexOf("@")));

    }
}
