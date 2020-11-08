import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateJava {
    private String currentDir = System.getProperty("user.dir");

    public GenerateJava() {
        try {
            currentDir = currentDir + "/src/main/generatedJava/";
            File file = new File(currentDir + "Main.java");
            if (file.createNewFile()) {
                System.out.println("File created");
            } else {

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void erase() {
        try {
            FileWriter fw = new FileWriter(currentDir + "Main.java");
            fw.write("");
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void write(String str) {
        try {
            FileWriter fw = new FileWriter(currentDir + "Main.java", true);
            fw.write(str + "\n");
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
