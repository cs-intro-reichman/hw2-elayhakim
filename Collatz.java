// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int seed = Integer.parseInt(args[0]);
		char vc = args[1].charAt(0);
		String line = "";

		for(int i = 1; i <= seed; i++){

			int count = 1;
			int j=i;
			if(j==1){
				count++; 
				line= line + j + " ";
				j=4;}
				while(j!=1){
				line= line + j + " ";
				if(j%2==1){
					j= j* 3+1;}
				else{j/=2;}
					count++;
			}
			if(vc == 'v'){
				System.out.print(line + 1 + " ");
				System.out.println("(" + count + ")");
			}
			line = "";
		}
				System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
}
