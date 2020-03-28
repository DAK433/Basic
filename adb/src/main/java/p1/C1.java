package p1;

public class C1 {

	public static void main(String[] args) {
		

	}
	public static int findMax(int arr[]){  
        int max=0;  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }
        System.out.println(max);
        return max;  
    }  
	
	

}
