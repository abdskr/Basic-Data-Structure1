import java.util.Scanner;

class Array{
    Scanner sc=new Scanner(System.in);

    int[] arr=new int[10];
    public void input(){

    for(int i=0;i<arr.length;i++){
        System.out.println("ENter No :"+i+" ");
        arr[i]=sc.nextInt();
    }
    
    }

    public void print(){
    
    for(int i=0;i<arr.length;i++){
        System.out.println(" No :"+i+" "+arr[i]);

    }
}

}


class ArrOper{
    public static void main(String[] args){

Array obj=new Array();
obj.input();
obj.print();

    }
}