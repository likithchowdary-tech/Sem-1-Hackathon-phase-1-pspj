import java.util.Scanner;
public class Municipal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter vehical number: ");
        int vehicalnumber=sc.nextInt();
        System.out.println("Enter waste collected: ");
        int wastecollected=sc.nextInt();
        System.out.println("Enter number of collection points: ");
        int collectionpoints=sc.nextInt();
        System.out.println("Enter vehical status: ");
        char vehicalstatus=sc.next().charAt(0);
        System.out.println("---Vehical Details----");
        System.out.println("Vehical Number: "+vehicalnumber);
        System.out.println("Wasted Collected: "+wastecollected+"kg");
        System.out.println("Collection points: "+collectionpoints);
        System.out.println("Vehical Status:"+vehicalstatus);
    }
}
