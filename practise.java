// import java .util.Scanner;
// class practise{
//     public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the day[1-7]");
//     int day=sc.nextInt();
//     switch(day){
//         case 1:System.out.println("Monday");
//         break;
//         case 2:System.out.println("tuesday");
//         break;
//         case 3:System.out.println("wednesday");
//         break;
//         case 4:System.out.println("thrusday");
//         break;
//         case 5:System.out.println("friday");
//         break;
//         case 6:System.out.println("saturday");
//         break;
//         case 7:System.out.println("sunday");
//         break;
//         default:
//             System.out.println("enter the valid day");
//         }
//         sc.close();
//     }
//     }
import java .util.Scanner;
 class practise{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the website");
        String website=sc.next();
    if(website.endsWith(".org")){
        System.out.println("organizational website");
    }
    else if(website.endsWith(".com")){
        System.out.println("commerical website");

    }
    else if(website.endsWith(".in")){
        System.out.println("indian website");
    }
    sc.close();
    }

 }
