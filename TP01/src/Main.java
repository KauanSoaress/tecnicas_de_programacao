import archive.FunctionsFile;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String input1 = "C:\\Users\\Kauan Soares\\OneDrive\\Documentos\\UFC\\tecnicas_de_programacao\\TP01\\src\\archive\\input1.txt";
        String input2 = "C:\\Users\\Kauan Soares\\OneDrive\\Documentos\\UFC\\tecnicas_de_programacao\\TP01\\src\\archive\\input2.txt";
        String output = "C:\\Users\\Kauan Soares\\OneDrive\\Documentos\\UFC\\tecnicas_de_programacao\\TP01\\src\\archive\\output.txt";

        FunctionsFile relation = new FunctionsFile(input1, input2, output);
        try {
            relation.fileExecute();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}