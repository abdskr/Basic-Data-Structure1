import java.util.Scanner;
class Array1d{
    public static void main(String[] str){
        Scanner sc=new Scanner(System.in);
        System.out.print(" How many numbers you want :");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print(" How many numbers you want :");

            
             for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}