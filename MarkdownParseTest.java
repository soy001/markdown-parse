import static org.junit.Assert.*;

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
    public void testGetLink() throws IOException{
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> expectedList = List.of("https://something.com", "some-page.html");
        assertEquals(expectedList, links);
    }

    @Test
    public void testGetMoreLinks() throws IOException{
        Path fileName = Path.of("another-break.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> expectedList = List.of("https://www.google.com");
        assertEquals(expectedList, links);
    }

    @Test
    public void testFile1() throws IOException{
        Path fileName = Path.of("test-file2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> expectedList = List.of("https://www.google.com");
        assertEquals(expectedList, links);
    }
}