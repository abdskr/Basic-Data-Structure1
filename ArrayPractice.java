import java.util.Scanner;
class ArrayPractice{
    public static void main(String[] args){
        int sum=0,target,index=-1;
        int[] arr=new int[10];
        Scanner sc= new Scanner(System.in);
       
        for(int i=0;i<arr.length;i++){
             System.out.print("Enter numbers  "+i+" :");
             arr[i]=sc.nextInt();
             sum+=arr[i];
        }

        for(int i=0;i<arr.length;i++){
            
          System.out.println(" numbers are :"+i+" :"+arr[i]); 

}
        System.out.println("Sum is:"+sum );
        int Max=arr[0];
      for(int i=0;i<arr.length;i++){
          if(arr[i]>Max)
          Max=arr[i];
          }

        System.out.println("Maximium of a number  is:"+Max );
         System.out.println("Enter number to serch:" );
         target=sc.nextInt();

         for(int i=0;i<arr.length;i++){
            if(target==arr[i])
            
            index=i;
         }
         if(index!=-1)
          System.out.println("The desired number is:"+index );
          else
           System.out.println("The number is not found" );


    }
}