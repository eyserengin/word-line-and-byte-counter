import com.beust.jcommander.JCommander;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {


        try {

            Counter counter = new Counter();
            Paramaters mcp = new Paramaters();
            JCommander jc = new JCommander(mcp);

            if (args.length != 0) {

                jc.parse(args);
                Path p1 = Paths.get(mcp.filePath);
                jc.setProgramName("My counter");
                boolean i = false;


                if (!mcp.countLines) {
                    System.out.print("Line of file: ");
                    System.out.println(counter.countLines(p1));
                    i=true;
                }

                if (!mcp.countBytes) {
                    System.out.print("Byte count of file: ");
                    System.out.println(counter.countBytes(p1));
                    i = true;
                }

                if (!mcp.countWords) {
                    System.out.print("Words count of file: ");
                    System.out.println(counter.countWords(p1));
                    i = true;
                }

                if (!i) {
                    System.out.println("Please enter 1 of the following options.");
                    jc.usage();
                }


            } else {
                jc.usage();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
