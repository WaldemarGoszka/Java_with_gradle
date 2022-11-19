package zajavka._warsztaty.w3;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    Stream<String> lines = Files.lines();

try (BufferedReader reader = Files.newBufferedReader(readingPath)) {
        String line = null;
        while((line = reader.readLine()) != null) {
            System.out.println("nextLine: " + line); ①
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    Path writingPath = Paths.get("/zajavka/bufferWritingFile.txt");
    List<String> data = new ArrayList<>();
try (BufferedWriter writer = Files.newBufferedWriter(writingPath)) {
        writer.write("zajavka!"); ②
    } catch (IOException e) {
        e.printStackTrace();
    }
}
