import java.util.Scanner;
public class learn {
    public static void main(String[] args){
        System.out.println("help!");
        Rectangle r1=new Rectangle();
        r1.calculatearea();
       System.out.println(r1.a);
    }
    
}
class  Rectangle{
  public int a;
  public void calculatearea(){
     
  //  Rectangle(){
    Scanner sc=new Scanner(System.in);
     
    System.out.println("enter the length");
    int l=sc.nextInt();
    System.out.println("enter the breath ");
    int b=sc.nextInt();
    // int a;
    a=l*b;
    System.out.println(a);
    sc.close();
  }
}
