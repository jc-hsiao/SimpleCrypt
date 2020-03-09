import java.io.*;

public class MainApp {

    public static void main(String[] args) {
        String dataFromFile = readFile("sonnet18.txt");
        Caesar caesar = new Caesar();
        String encryptData = caesar.encrypt(dataFromFile);
        writeFile(encryptData,"sonnet18.enc");

        String check = readFile("sonnet18.enc");
        String decrypt = caesar.decrypt(check);
        System.out.println(decrypt);

    }

    public static String readFile(String fileName){
        String s = "";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String sCurrentLine;
            StringBuilder sBuilder = new StringBuilder(s);
            while ((sCurrentLine = br.readLine()) != null) {
                sBuilder.append(sCurrentLine).append("\n");
            }
            s = sBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

    public static void writeFile(String data, String fileName) {
        File file = new File(fileName);
        FileWriter fr = null;
        BufferedWriter br = null;
        try {
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);
            br.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
