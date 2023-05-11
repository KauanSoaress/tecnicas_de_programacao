package archive;

import java.io.*;
import java.util.HashMap;

public class FunctionsFile {

    private HashMap<String, String> order = new HashMap<>();
    private String input1, input2, output;

    private void fileReader() throws IOException {
        BufferedReader reader1 = new BufferedReader(new FileReader(input1));

        String line1 = reader1.readLine();
        while(line1 != null) {
            String[] lineData = line1.split(";");
            if (isANumberedString(lineData[0])) {
                if (!order.containsKey(lineData[0])) {
                    order.put(lineData[0], lineData[1]);
                }
            } else {
                if (!order.containsKey(lineData[1])) {
                    order.put(lineData[1], lineData[0]);
                }
            }
            line1 = reader1.readLine();
        }
        reader1.close();

        BufferedReader reader2 = new BufferedReader(new FileReader(input2));

        String line2 = reader2.readLine();
        while(line2 != null) {
            String[] lineData = line2.split(";");
            if (isANumberedString(lineData[0])) {
                if (!order.containsKey(lineData[0])) {
                    order.put(lineData[0], lineData[1]);
                }
            } else {
                if (!order.containsKey(lineData[1])) {
                    order.put(lineData[1], lineData[0]);
                }
            }
            line2 = reader2.readLine();
        }
        reader2.close();
    }

    private void fileWriter () throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(output));

        order.keySet().forEach(eachCPF -> {
            try {
                writer.write(eachCPF + ";" + order.get(eachCPF) + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        writer.close();
    }
    private boolean isANumberedString (String x) {
        return x.matches("\\d+");
    }

    public void fileExecute() throws IOException{
        fileReader();
        fileWriter();
    }

    public FunctionsFile(String input1, String input2, String output) {
        this.input1 = input1;
        this.input2 = input2;
        this.output = output;
    }
}
