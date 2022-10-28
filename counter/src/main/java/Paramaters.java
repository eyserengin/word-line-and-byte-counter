import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

@Parameters(separators = "=")
public class Paramaters {

    @Parameter(names = {"-h", "--help"},
            description = "Displays help information",
            help = true)
    public boolean help;

    @Parameter(names = {"-b", "--countBytes"},
            description = "Byte count of file ")
    public boolean countBytes = true;

    @Parameter(names = {"-w", "--countWords"},
            description = "Words count of file")
    public boolean countWords = true;

    @Parameter(names = {"-l", "--countLines"},
            description = "Line of file")
    public boolean countLines = true;

    @Parameter(names = {"-p", "--path"},
            required = true,
            description = "Path of the file( You have to give a path first)")
    public String filePath;

}
