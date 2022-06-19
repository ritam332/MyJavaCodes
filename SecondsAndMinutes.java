public class SecondsAndMinutes {
    public static final String INVALID_VALUE_MESSAGE =" Invalid Value ";
    public static void main(String[] args) {
        System.out.println(getDurationString(77,12));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(3661));
    }

    public static String getDurationString(int minutes,int seconds) {
        if (minutes<0||seconds<0||seconds>59){
            return INVALID_VALUE_MESSAGE;
        }
        int hours=minutes/60;
        int remainingMinutes=minutes%60;
        String hoursString=hours+" h ";
        if (hours<10)
            hoursString="0"+hours+" h ";
        String minutesString=remainingMinutes+" m ";
        if (remainingMinutes<10)
            minutesString="0"+remainingMinutes+" m ";
        String secondsString=seconds+" s ";
        if (seconds<10)
            secondsString="0"+seconds+" s ";
        return hoursString+minutesString+secondsString;

    }
    public static String getDurationString(int seconds){
        if (seconds<0) return INVALID_VALUE_MESSAGE;
        int minutes=seconds/60;
        int remainingSeconds=seconds%60;
        return getDurationString(minutes,remainingSeconds);
    }
}
