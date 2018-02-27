import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class ThingyClass {
    public static void main(String[] args){
        String testStr = "The thing is thingything. We thingy the thingythingything. Thing thing.";
        System.out.println(countSubstring("thingy", testStr));
        System.out.println(countSubstring("thing", testStr));
    }
    public static int countSubstring(String subStr, String string){
        //Beautifully efficient and well-written code!!!!!!!!!!!!!!!!!!!!
        int startIndex = 0;
        int endIndex = 0;
        int occurrences = 0;
        String[] strList = string.split("");
        String[] subStrList = string.split("");
        for (int i = 0, L = strList.length; i < L; i++) {
            if(strList[i].compareToIgnoreCase(subStrList[0]) == 0){
                StringBuilder builder = new StringBuilder();
                for (int j = 0, lilL = subStrList.length; j < lilL; j++) {
                    if(!(strList[i+j].compareToIgnoreCase(subStrList[j]) == 0)){
                        break;
                    }else{
                        builder.append(strList[i+j]);
                    }
                    System.out.println(builder);
                }
                if(builder.toString().compareToIgnoreCase(subStr) == 0){
                    System.out.println("BLEH: " + (builder.toString().compareToIgnoreCase(subStr) == 0));
                    occurrences++;
                }
            }
        }
        return occurrences;
    }
}
