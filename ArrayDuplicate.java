import java.util.*;
public class ArrayDuplicate {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int a;
		System.out.println("Enter the size of the array:");
		a=s.nextInt();
		int[]arr=new int[a];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the array of index "+i+" is:");
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=0;
				}
			}
			if(count>1 && arr[i]!=0) {
				System.out.println("Duplicates elements are:"+arr[i]);
			}
		}
	}
}
