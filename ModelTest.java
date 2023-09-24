package RGR;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;

import static org.junit.Assert.*;

public class ModelTest {

    @Test
    public void testGetName() {
        // создаем временный файл для теста
        File tmpFile = null;
        try {
            tmpFile = File.createTempFile("testfile", ".txt");
            FileWriter writer = new FileWriter(tmpFile);
            writer.write("");
            writer.close();
        } catch (Exception e) {
            fail("Failed to create temporary file for tet");
        }

        // создаем объект класса и вызываем метод getName
        Model m1 = new Model();
        String result = m1.getName();

        // проверяем, что результат соответствует ожидаемому значению
        assertEquals("Пользователь 121", result);

        // удаляем временный файл
        tmpFile.delete();
    }

    @Test
    public void testGetAnswers() {
        // создаем объект класса и вызываем метод getAnswers
        Model myObj = new Model();
        String[] result = myObj.getAnswers();

        // проверяем, что результат не пустой и содержит ожидаемое количество элементов
        assertNotNull(result);
        assertEquals(10, result.length);
    }

    @Test
    public void testNumberTrue() {
        Model mod = new Model();
        String[] words1 = {"one", "two", "three"};
        String[] words2 = {"one", "two", "five"};
        int expected = 2;
        int actual = mod.numberTrue(words1, words2);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckFile() {
        Model system = new Model();
        boolean expected = false;
        boolean actual = system.checkFile();
        assertEquals(expected, actual);
    }
}