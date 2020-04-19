import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileToNum {
    public static int[] FTN(String p){
        int [] tab = new int[800];
        int [] arrayNum = new int[400];
        int k = 0;
        try {
            String path = p;
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                for (int i = 0; i < 59; i++) {
                    if((48 <= ((int)(data.charAt(i)))) && (((int)(data.charAt(i)))) <= 57){
                        tab[k] = (int)(data.charAt(i)) - 48;
                        k++;
                    }
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        for (int i = 0; i < 400; i++) {
            arrayNum[i] = 10*tab[2*i] + tab[2*i+1];
        }

        return arrayNum;
    }
}
