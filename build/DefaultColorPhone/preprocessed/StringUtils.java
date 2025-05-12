/**
 *
 * @author Kudo
 */
public class StringUtils {
    public static boolean contains(String text, String keyword) {
        return text != null && keyword != null && text.indexOf(keyword) != -1;
    }
}
