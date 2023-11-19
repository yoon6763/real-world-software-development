import java.util.List;
import java.util.Map;

public class TextFile {
    private final Map<String, String> attributes;
    private final List<String> lines;

    public TextFile(Map<String, String> attributes, List<String> lines) {
        this.attributes = attributes;
        this.lines = lines;
    }
}
