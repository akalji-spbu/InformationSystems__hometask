/**
 * Created by akalji on 03.10.2017.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
    final static int assumedLineLength = 50;

    public static void main(String[] args) {
        int numOfRandLines = Integer.parseInt(args[1]);
        Path file = Paths.get(args[0]);
        List<String> fileList = new ArrayList<String>((int)(file.toFile().length() / assumedLineLength) * 2);

        int numOfLinesInFile = 0;

        try (InputStream in = Files.newInputStream(file);
             BufferedReader reader =
                     new BufferedReader(new InputStreamReader(in))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                fileList.add(line);
                numOfLinesInFile++;
            }
        } catch (IOException x) {
            System.err.println(x);
        }
        System.out.println(numOfLinesInFile);
        Random random = new Random();
        for (int i = 0; i < numOfRandLines; i++) {
            System.out.format("%d: %s%n", i,
                    fileList.get(random.nextInt(numOfLinesInFile - 1)));
        }
    }
}
