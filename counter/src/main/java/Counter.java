import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Counter {


    public  long countBytes(Path path) throws IOException {
        return Files.size(path);
    }

    public  long countWords(Path path) throws IOException {
        String sentence = Files.readString(path);
        StringTokenizer tokens = new StringTokenizer(sentence);
        return tokens.countTokens();
    }

    public  long countLines(Path path) {

        long lines = 0;

        try (Stream<String> stream = Files.lines(path)) {
            lines = stream.count();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;

    }
}