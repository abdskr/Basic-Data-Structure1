import java.util.Scanner;
class Data {
    public static void main(String[] args){
        int sum=0;
        Scanner inp=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("Enter 10 arrays:");
        for(int i=0;i<10;i++){
            arr[i]=inp.nextInt();
            sum+=arr[i];
        }
               
              //  double avg=double(sum)/arr.length;
                int max=arr[0];
                int min=arr[0];
                for(int i=0;i<arr.length;i++){
                    if(arr[i]>max)
                    max=arr[i];

                    else if(arr[i]<min)
                    min=arr[i];
                }

                 System.out.println("Sum of 10 arrays are:"+sum);
              //    System.out.println("Average of 10 arrays are:"+avg);
                   System.out.println("Maximium of 10 arrays are:"+max);
                    System.out.println("Minimium of 10 arrays are:"+min);

    }
}