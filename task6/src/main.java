/**
 * Created by akalji on 03.10.2017.
 */
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        long countOfChar = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the char: ");
        String key = in.next();
        try{
            String pathOfFile = "c:\\Users\\akalj\\Desktop\\src\\com\\sun\\imageio\\plugins\\jpeg\\JFIFMarkerSegment.java";
            String SS = new String(Files.readAllBytes(Paths.get(pathOfFile)));
            Pattern p = Pattern.compile(key);
            Matcher m = p.matcher(SS);
            while(m.find()) {
                countOfChar++;
            }
   }catch (Exception e){}
        System.out.println(countOfChar);
}
}


