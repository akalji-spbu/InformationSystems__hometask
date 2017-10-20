import java.io.CharArrayWriter;

/**
 * Created by akalji on 21.09.2017.
 */
public class ROT13 {
    public static String ROT13(String word){
        String encoded = "";
        for(char ch:word.toCharArray()){
            if       (ch >= 'a' && ch <= 'm') ch += 13;
            else if  (ch >= 'n' && ch <= 'z') ch -= 13;
            else if  (ch >= 'A' && ch <= 'M') ch += 13;
            else if  (ch >= 'N' && ch <= 'Z') ch -= 13;
            encoded += ch;
        }
        return encoded;
    }
}
