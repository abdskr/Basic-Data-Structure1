class Binary1{
	public static void main(String[] args){


	int[] arr={13,2,7,9,19,5,17,1};


	for(int  i=0;i<arr.length;i++){
	for(int j=0;j<arr.length-i-1;j++){
		if(arr[j]>arr[j+1]){
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}

	}
}

     int low=0,high=arr.length-1;
     int search=9;
     while(low<=high){
     	int mid=(low+high)/2;
     	if(arr[mid]==search){
     		System.out.println("Found at index :"+mid);
     	}
     	else if(search>arr[mid]){
     		mid=high-1;
     	}
     	else
     		mid=low+1;
     	
     }

	}
}