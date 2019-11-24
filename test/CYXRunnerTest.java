import cyx.CYXRunner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CYXRunnerTest {
    private static String srcDir = new File("").getAbsolutePath() + "/";
    private static String testDir = srcDir + "test/";
    private static String inPath = testDir + "in/";
    private static String outPath = testDir + "out/";

    private static PrintStream console = null;
    private static ByteArrayOutputStream bytes = null;

    @BeforeAll
    public static void setUp() {
        bytes = new ByteArrayOutputStream();
        console = System.out;
        System.setOut(new PrintStream(bytes));
    }

    @AfterAll
    public static void tearDown() {
        System.setOut(console);
    }

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

    @BeforeEach
    public void cleanUp() {
        bytes.reset();
    }

    @Test
    public void testNumCalc() throws Exception {
        String testFile = "NumCalc";
        String expect = readFile(outPath + testFile + ".txt");
        CYXRunner.main(new String[]{inPath + testFile + ".cyx"});
        assertEquals(expect, bytes.toString());
    }

    @Test
    public void testStringCalc() throws Exception {
        String testFile = "StringCalc";
        String expect = readFile(outPath + testFile + ".txt");
        CYXRunner.main(new String[]{inPath + testFile + ".cyx"});
        assertEquals(expect, bytes.toString());
    }

    @Test
    public void testVarRelated() throws Exception {
        String testFile = "VarRelated";
        String expect = readFile(outPath + testFile + ".txt");
        CYXRunner.main(new String[]{inPath + testFile + ".cyx"});
        assertEquals(expect, bytes.toString());
    }

    @Test
    public void testScopeRelated() throws Exception {
        String testFile = "ScopeRelated";
        String expect = readFile(outPath + testFile + ".txt");
        CYXRunner.main(new String[]{inPath + testFile + ".cyx"});
        assertEquals(expect, bytes.toString());
    }

    @Test
    public void testListRelated() throws Exception {
        String testFile = "ListRelated";
        String expect = readFile(outPath + testFile + ".txt");
        CYXRunner.main(new String[]{inPath + testFile + ".cyx"});
        assertEquals(expect, bytes.toString());
    }

    @Test
    public void testIfRelated() throws Exception {
        String testFile = "IfRelated";
        String expect = readFile(outPath + testFile + ".txt");
        CYXRunner.main(new String[]{inPath + testFile + ".cyx"});
        assertEquals(expect, bytes.toString());
    }

    @Test
    public void testLoopRelated() throws Exception {
        String testFile = "LoopRelated";
        String expect = readFile(outPath + testFile + ".txt");
        CYXRunner.main(new String[]{inPath + testFile + ".cyx"});
        assertEquals(expect, bytes.toString());
    }

    @Test
    public void testFunRelated() throws Exception {
        String testDir = "FunRelated/";
        String fileDir = inPath + testDir;
        File inFile = new File(fileDir);
        for (File file : Objects.requireNonNull(inFile.listFiles())) {
            bytes.reset(); // 清空缓冲区
            String fileName = file.getName().replace(".cyx", "");
            String expect = readFile(outPath + testDir + fileName + ".txt");
            CYXRunner.main(new String[]{inPath + testDir + fileName + ".cyx"});
            assertEquals(expect, bytes.toString());
        }
    }

}