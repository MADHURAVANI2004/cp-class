import java.util.*;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); 
        int temp = num;
        int n = 0;
        while(temp>0){
            n=n*10+(temp%10);
            temp /= 10;
        }
        if(num == n){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
