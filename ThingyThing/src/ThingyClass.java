import java.util.regex.Pattern;
/**
 *
 */
public class ThingyClass {
    public static void main(){
        String testStr = "The thing is thingything. We thingy the thingythingything. Thing thing.";
        System.out.println(countSubstring("thingy", testStr));
        System.out.println(countSubstring("thing", testStr));
    }
    public static int countSubstring(String subStr, String str){
        // the result of split() will contain one more element than the delimiter
        // the "-1" second argument makes it not discard trailing empty strings
        return str.split(Pattern.quote(subStr), -1).length - 1;
    }
}
