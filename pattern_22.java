import java.io.*;
class pattern_22{
    private static void UpperPart(int x){
        int m, n;
        for (m = x - 1; m >= 0; m--) {
            for (n = 0; n < m; n++) {
                System.out.print(" ");
	    }for (n = m; n <= x - 1; n++) {
	        System.out.print("*"+ " ");
	    }System.out.println();
		}
    } private static void LowerPart(int y){
        int m, n;
        for (m = 1; m <= y; m++) {
            for (n = 1; n < m; n++) {
                System.out.print(" ");
            } for (n = m; n <= y; n++) {
                System.out.print("*"+ " ");
            }System.out.println();
        }
    }
	public static void main(String[] args)
	{
		int x = 7;
		UpperPart(x);
		int y =7;
		LowerPart(y);
	}
}
