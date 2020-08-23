import java.text.ParseException;
import java.util.Properties;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  PACKAGE_NAME
 * @created : 2020/8/13
 * @description :
 */
public class MyDemo {
    public static void main(String[] args)  {

        System.out.println(getValue(2));




    }
    public static int getValue(int i) {
        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }
        return result;
    }
}
