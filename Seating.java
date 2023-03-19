package sorting;
//displaying the arrangement order whether true or false
public class Seating {

	public static void main(String[] args) {
		int[] ar= {1,1,0,0,1,0,1,0,1,1,0};//1 represents the boy 0represents the girl
		for(int i=0;i<ar.length-2;i++) {
			if( ar[i]==0) {
				if(ar[i+1]==1) {
					if(ar[i+2]==0) {
						System.out.println("Arrangement order is fail");
						break;
					}
				}
			}
		}

	}

}
