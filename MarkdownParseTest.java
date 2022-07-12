import static org.junit.Assert.*;

import java.beans.Transient;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void checkLinks() throws IOException {
        MarkdownParse checkLink = new MarkdownParse();
        System.out.println(List.of("https://something.com", "some-page.html").toString());
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))));
    }

    @Test
    public void links() {
        ArrayList<String> links = getLinks("test-file.md");
        ArrayList<String> expect = new ArrayList<>();
        expect.add("https://something.com");
        expect.add("some-page.html");
        assertEquals(expect, links);
    }

    @Test
    public void links2() {
        ArrayList<String> links = getLinks("test-file2.md");
        ArrayList<String> expect = new ArrayList<>();
        assertEquals(expect, links);
    }
}
