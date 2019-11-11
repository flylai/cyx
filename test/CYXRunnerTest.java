import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CYXRunnerTest {
    private static String srcDir = new File("").getAbsolutePath() + "/";
    private static String testDir = srcDir + "test/";
    private static String inPath = testDir + "in/";
    private static String outPath = testDir + "out/";

    private static PrintStream console = null;
    private static ByteArrayOutputStream bytes = null;


    private String readFile(String filePath) {
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            int size = fileInputStream.available();
            byte[] buffer = new byte[size];
            fileInputStream.read(buffer);
            fileInputStream.close();
            return new String(buffer);
        } catch (IOException e) {

        }
        return "";
    }

    @BeforeAll
    public static void setUp() {
        bytes = new ByteArrayOutputStream();
        console = System.out;
        System.setOut(new PrintStream(bytes));
    }

    @BeforeEach
    public void cleanUp() {
        bytes.reset();
    }

    @AfterAll
    public static void tearDown() {
        System.setOut(console);
    }

    @Test
    public void testNumCalc() {
        String testFile = "NumCalc";
        String expect = readFile(outPath + testFile + ".txt");
        CYXRunner.main(new String[]{inPath + testFile + ".cyx"});
        assertEquals(expect, bytes.toString());
    }

    @Test
    public void testStringCalc() {
        String testFile = "StringCalc";
        String expect = readFile(outPath + testFile + ".txt");
        CYXRunner.main(new String[]{inPath + testFile + ".cyx"});
        assertEquals(expect, bytes.toString());
    }

    @Test
    public void testVarRelated() {
        String testFile = "VarRelated";
        String expect = readFile(outPath + testFile + ".txt");
        CYXRunner.main(new String[]{inPath + testFile + ".cyx"});
        assertEquals(expect, bytes.toString());
    }

    @Test
    public void testScopeRelated() {
        String testFile = "ScopeRelated";
        String expect = readFile(outPath + testFile + ".txt");
        CYXRunner.main(new String[]{inPath + testFile + ".cyx"});
        assertEquals(expect, bytes.toString());
    }

    @Test
    public void testListRelated() {
        String testFile = "ListRelated";
        String expect = readFile(outPath + testFile + ".txt");
        CYXRunner.main(new String[]{inPath + testFile + ".cyx"});
        assertEquals(expect, bytes.toString());
    }

    @Test
    public void testIfRelated() {
        String testFile = "IfRelated";
        String expect = readFile(outPath + testFile + ".txt");
        CYXRunner.main(new String[]{inPath + testFile + ".cyx"});
        assertEquals(expect, bytes.toString());
    }

    @Test
    public void testLoopRelated() {
        String testFile = "LoopRelated";
        String expect = readFile(outPath + testFile + ".txt");
        CYXRunner.main(new String[]{inPath + testFile + ".cyx"});
        assertEquals(expect, bytes.toString());
    }

}