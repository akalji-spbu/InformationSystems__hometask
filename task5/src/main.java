/**
 * Created by akalji on 03.10.2017.
 */
import java.io.*;
import java.nio.file.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        HashSet<String> filesHashSet = new HashSet<>();
        try{
            Path start = Paths.get("c:\\Users\\akalj\\Desktop\\src\\");
            int maxDepth = 50000;
            try (Stream<Path> stream = Files.walk(start, maxDepth)) {
                List joined = stream
                        .map(String::valueOf)
                        .filter(path -> path.endsWith(".java"))
                        .collect(Collectors.toList());
                for(int i=0;i<joined.size();i++){
                    String currentFilePath = joined.get(i).toString();
                    File srcFile = new File(currentFilePath);
                    try
                    {
                        LineNumberReader lnr;
                        lnr = new LineNumberReader(
                                new BufferedReader(
                                        new FileReader(srcFile)));
                        String s;
                        while(true)
                        {
                            s = lnr.readLine();
                            if(s == null)
                                break;

                            if(s.indexOf("transient") != -1)
                            {
                                filesHashSet.add(currentFilePath);
                            }
                        }


                    }catch (Exception e){}
            }
        }catch (Exception e){}

    }catch (Exception e){}
        System.out.println(filesHashSet);
    }
}


