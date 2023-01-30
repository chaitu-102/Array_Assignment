
public class BubbleSort {

public static void main(String[]args) {
	int[]ar= {20,10,15,22,16,30,0};
	for(int i=0;i<ar.length;i++) {
		for(int j=1;j<ar.length;j++) {
			if(ar[j]<ar[j-1]) {
				int temp=ar[j-1];
				ar[j-1]=ar[j];
				ar[j]=temp;
			}
		}
		
	}
	for(int i=0;i<ar.length;i++) {
		System.out.print(ar[i] + " ");
	}
}
}