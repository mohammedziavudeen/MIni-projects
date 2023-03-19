package sorting;
//arranging the seat order while women seating between more than 1 men and vice versa for men
public class TheatreSeatArrangement {

	public static void main(String[] args) {
		int[] ar= {1,0,1,1,0,1,0,1,0,1,0,1,1,1,0};
		for(int j=ar.length/2;j<ar.length;j++)
		for(int i=1;i<ar.length-1;i++) {
			if(ar[i-1]==ar[i+1]) {
				int temp=ar[i-1];
				ar[i-1]=ar[i];
				ar[i]=temp;
			}
		}
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]);
		}
	}
}
