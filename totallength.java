import java.util.*;
public class totallength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("no of strings : ");
        int size = sc.nextInt();
        String arr[] = new String[size];

        for (int i=0; i<size; i++){
            arr[i] = sc.next();
        }
        int totalLength1 = 0;

        for (int i=0; i<size; i++ ){
            totalLength1 +=arr[i].length();
        }
        System.out.println("totallemgth ="+ totalLength1);

    }
}
