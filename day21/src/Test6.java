import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test6 {
    public static void main(String[] args) {
        /*String content="This order was placed for QT3000! OK?";
        String pattern="(\\D*)(\\d+)(.*)";
        boolean matches = Pattern.matches(pattern, content);
        System.out.println(matches);*/
        String content = "I am noob" + "from runoobsfs..565656com....com.";
        String pattern = ".*com.*";
        Pattern p = Pattern.compile("([a-z+]+)([0-9]+)");
        Matcher matcher = p.matcher("as33**sfs8845**343bb**+454**bb45");
       /* boolean matches = matcher.matches();
        System.out.println(matches);*/
        String s = matcher.replaceFirst("#");
        System.out.println(s);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }
        String str = "a232b4334c3434";
        String[] arrs = str.split("\\d+");
        System.out.println(Arrays.toString(arrs));
        char a = 'a';
        byte b = (byte) a;
        int c = b;
        System.out.println(b);
        System.out.println(c);
        
    }
}
