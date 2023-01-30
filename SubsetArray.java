import java.util.*;
public class SubsetArray{
	public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	int size;
	int count=0;
	System.out.println("Enter the size of the array1:");
	size=s.nextInt();
	int[]arr1=new int[size];
	for(int i=0;i<size;i++) {
		System.out.println("Enter the value of the array1 of index"+i+":");
		arr1[i]=s.nextInt();
	}
	int size1;
	System.out.println("Enter the size1 of the array2:");
	size1=s.nextInt();
	int[]arr2=new int[size1];
	for(int j=0;j<size1;j++) {
		System.out.println("Enter the value of the array1 of index"+j+":");
		arr2[j]=s.nextInt();
	}
	for(int k=0;k<arr1.length;k++) {
		for(int m=0;m<arr2.length;m++) {
			if(arr1[k]==arr2[m]) {
				count++;
			}
		}
	}
	if(count==arr1.length) {
		System.out.println("Array 1 is subset of Array 2");
	}
	else {
		System.out.println("Array 1 is not subset of Array 2");
	}
}
}
