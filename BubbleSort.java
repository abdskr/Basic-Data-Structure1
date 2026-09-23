class BubbleSort{
	public static void main(String[] args){

		Bubble obj=new Bubble();
		int[] arr={68,34,12,39,44,56,11};
			obj.sorting(arr);
			obj.printArray(arr);
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

 public void printArray(int[] arr){
 	for(int i=0;i<arr.length;i++){
 		System.out.println(arr[i]+"  ");
 	}

 }	
}