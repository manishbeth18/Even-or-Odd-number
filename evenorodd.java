import java.util.*;
class evenorodd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether its odd or even:");
        int n = sc.nextInt();
      if(n%2==0){
        System.out.println("The given number is even.");
      }
      else{
        System.out.println("The given number is odd.");
      }
    }
}
