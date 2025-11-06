//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	        String name = args[0];
                int num = Integer.parseInt(args[1]);
                int i = 0;
                String firstlet = "" + name.charAt(0);
                String anwords = "AaEeFfHhIiLlMmNnOoRrSsXx";
                while (i < name.length()){
                        if(anwords.indexOf(name.charAt(i)) != -1){
                                System.out.println("Give me an " + name.charAt(i) + ": " + name.charAt(i) + "!");
                        }else{
                                System.out.println("Give me a " + name.charAt(i) + ": " + name.charAt(i) + "!");
                        }
                        i++;
                }
                System.out.println("What does that spell?");
                for(int j =0; j < num; j++){
                        System.out.println( name +"!!!");
                }
        }
}
