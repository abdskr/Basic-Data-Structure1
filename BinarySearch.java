class BinarySearch{
    public static void main (String[] args){
        int[] arr={13,34,5,12,2,78,90};
        Bubble obj1=new Bubble();
        obj1.sorting(arr);
        Binary obj2=new Binary();
        int index=obj2.binary(arr, 90);
        System.out.println("Index of 90: " + index);
    }
}

class Bubble{
    public void sorting(int[] arr){
  int n=arr.length;
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int swap=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=swap;
            }
        }
    }
   
    }

    
}

class Binary{
    public int binary(int[] arr, int search){
    int l=0,h=arr.length-1,mid;

    while(l<=h){
        mid=(l+h)/2;
        if(search==arr[mid]){
            return mid;
        }
        if(search<arr[mid])
        h=mid-1;
        else
        l=mid+1;
       


    }
    return -1;
    }
}