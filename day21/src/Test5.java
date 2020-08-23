import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test5 {
    public static void main(String[] args) {
        String content="I am noob"+"from runoob..com";
        String pattern=".*ss.*";
        String pattern1=".*";
        boolean matches = Pattern.matches(pattern, content);
        System.out.println(matches);
        String line = "This order was placed for QT3000! OK?";
        String pattern2 = "(\\D+)(\\d+)(.*)";
        Pattern r = Pattern.compile(pattern2);
        Matcher matcher = r.matcher(line);

        if(matcher.find()){
            System.out.println(matcher.groupCount());
            System.out.println("Found value:--"+ matcher.group(0));
            System.out.println("Found value:---"+ matcher.group(1));
            System.out.println("Found value:----"+ matcher.group(2));
            System.out.println("Found value:-----"+ matcher.group(3));
        }else{
            System.out.println("no match...");
        }

    }
}
