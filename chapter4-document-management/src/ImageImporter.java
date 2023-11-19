import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ImageImporter implements Importer {

    @Override
    public Document importFile(final File file) throws IOException {
        final Map<String, String> attributes = new HashMap<>();

        attributes.put(PATH, file.getPath());

        final BufferedImage image = ImageIO.read(file);


        return new Document(attributes);
    }
}
