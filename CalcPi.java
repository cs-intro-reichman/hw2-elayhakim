// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double x = 0;
		int div = 1;
		boolean  flag = true;
		for(int i =0; i< num; i++){
			if(flag){
				x+= 1.0/div;
			}else{
				x-= 1.0/div;
			}
			flag = !flag;
			div+=2;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:    " + x*4);
	}
}
