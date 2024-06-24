// class loop{
//     public static void main(String[] args) {
    
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
       
//     }
// }
/**
 * loop
 */
// public class loop {

//     public static void main(String[] args) {
//         int multiply;
//         for(int i=10;i>=1;i--){
//             for(int j=1;j<=10;j++){
//                 multiply=i*j;
//                 System.out.println(i+"*"+j+"="+multiply);
//             }
//             // multiply=2*i;
//             // System.out.println("2*"+i+" "+"="+multiply);
//         }
//     }

// }
// class loop{
//     public static void main(String[] args) {
//         int i=1;
//         while(i<=5){
            
//             System.out.print("5");
//             i++;
//         }
//     }
// }
import java.util.Scanner;
class loop{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}