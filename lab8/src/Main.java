import java.io.*;



public class Main {
    public static void main(String[] args) {
        String fileName = null;
        try {
            BufferedReader inputStream = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\test\\numbers.txt"));
            String line = null;
            line = inputStream.readLine();
            System.out.println("1st line is:" + line);
            line = inputStream.readLine();
            System.out.println("2th line is:" + line);
            line = inputStream.readLine();
            System.out.println("3rd line is:" + line);
            File numFile = new File("C:\\Users\\user\\Desktop\\test\\numbers.txt");
            if (numFile.exists())
                System.out.println(numFile.length());


            inputStream.close();


        } catch (Exception e) {
            System.out.println("Not found");
        }
    }
}