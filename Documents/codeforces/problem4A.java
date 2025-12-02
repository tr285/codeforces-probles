
import java.util.Scanner;

// water melon problem
public class problem4A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a==2 || a%2!=0){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
        sc.close();
    }
}