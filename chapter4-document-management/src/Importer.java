import java.io.File;
import java.io.IOException;

public interface Importer {

    public static final String PATH = "pathToFile";

    Document importFile(File file) throws IOException;
}
