package Com;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[5];
		//int[]arr={10,20,30,40,50};
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		for(int i=0;i<=arr.length-1;i++) {
			if(i%2==0) {
		System.out.println(arr[i]+" ");
	}

}
		for(int i=0;i<=arr.length-1;i++) {
		if(i%2!=0){
			System.out.println(arr[i]+" ");
			
		}
		}
}
}