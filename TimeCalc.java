import javax.print.DocFlavor.STRING;

public class TimeCalc {
    public static void main(String[] args) {
        String timeclock =  args[0];
        int minetsToAdd =  Integer.parseInt(args[1]);
        int hours = Integer.parseInt(timeclock.substring(0,2));
        int minets = Integer.parseInt(timeclock.substring(3,5));
        int totalmin = hours*60 + minets + minetsToAdd;
        hours = (totalmin/60)%24;
        minets = (totalmin)%60 ;
        String hourstring = "0";
        String minetstring ="0";
        if(hours < 10){
			hourstring = hourstring + hours;
		}else{
            hourstring= "" + hours;
        }
        if(minets < 10){
			minetstring = minetstring + minets;
		}
        else{
            minetstring= "" + minets;
        }
        System.out.println(hourstring + ":" + minetstring);
    }
}
