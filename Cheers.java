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
                String little = "abcdefghijklmnopqrstuvwxyz";
                String finish ="";
                while (i < name.length()){
                        if(anwords.indexOf(name.charAt(i)) != -1){
                                if(little.indexOf(name.charAt(i)) != -1){
                                        System.out.println("Give me an " + (char)(name.charAt(i)-32) + ": " + (char)(name.charAt(i)-32) + "!");
                                        finish= "" + (char)(name.charAt(i)-32);
                                }else{
                                        System.out.println("Give me an " + name.charAt(i) + ": " + name.charAt(i) + "!");
                                        finish= "" + name.charAt(i);
                                }
                        }else{
                                if(little.indexOf(name.charAt(i)) != -1){
                                        System.out.println("Give me a  " + (char)(name.charAt(i)-32) + ": " + (char)(name.charAt(i)-32) + "!");
                                        finish= "" + (char)(name.charAt(i)-32);
                                }else{
                                        System.out.println("Give me a  " + name.charAt(i) + ": " + name.charAt(i) + "!");
                                        finish= "" + name.charAt(i);
                                }
                        }
                        i++;
                }
                System.out.println("What does that spell?");
                for(int j =0; j < num; j++){
                        System.out.println( name +"!!!");
                }
        }
}
