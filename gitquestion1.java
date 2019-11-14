import java.util.*;
class input{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[100];
        int k=0;
        int count=0;
        int n=0;
        System.out.println("Enter the length of array");
        n=sc.nextInt();
        System.out.println("Enter hte value of k");
        k=sc.nextInt();
        int m=n+1-k;
        count = (m*(m+1))/2;
        System.out.println("The count asked is "+count);
}
}