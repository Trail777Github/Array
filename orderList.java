

public class orderList {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
	
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
			System.out.print(arr[i]+""+arr[j]+",");
					System.out.print("updated");
				}
			}		
		
		
		}
	}
}

