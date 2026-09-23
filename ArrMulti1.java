import java.util.Scanner;
class ArrMulti1{
    public static void main(String [] args){
        int[][] arr=new int[3][4];
        Scanner inp=new Scanner(System.in) ;
          for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=inp.nextInt();
            }
           // System.out.println();
          }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
          }

    }
    
}