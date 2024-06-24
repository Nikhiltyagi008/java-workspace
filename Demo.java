import java.util.Scanner;
class factorial{
    void multiply(){
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        
        }
        System.out.println("factorial is "+fact);
        sc.close();
    }
}
 public class Demo{
    public static void main(String[] args) {
        factorial f1=new factorial();
        f1.multiply();
    }
}        