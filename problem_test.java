// sleep through class
import java.util.Scanner;
public class problem_test {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     while(n-- > 0){
        int j = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
    boolean[] flag = new boolean[j];
    for(int i=0;i<j;i++){
        if(s.charAt(i)=='1' && k>0){
           int end = i +k ;

        if (end>=j){
            end=j-1;

        }
        for(int m=i;m<=end;m++){
            flag[m]=true;

            
        }
    }
     }
     int count =0;
     for(int i=0;i<j;i++){
        if(!flag[i]){
            count++;
        }
     }
        System.out.println(count);

    }
    sc.close();
}}