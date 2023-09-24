package RGR;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Model {
    File file;
    public String getName(){
        File fileUsers = new File("C:\\Users\\katya\\OneDrive\\Рабочий стол\\TestSystem\\TestSystem\\inform_user.txt");
        String content = "";
        try (FileReader fileReader = new FileReader(fileUsers)) {
            Scanner scUsers = new Scanner(fileReader);
            content = scUsers.nextLine();
            while (scUsers.hasNextLine()){
                content += scUsers.nextLine();
            }
            fileReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return content;
    }
    public String[] getResults(){
        byte[] fileContent = new byte[0];

        try {
            fileContent = Files.readAllBytes(file.toPath());
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        String str = new String(fileContent);
        str = str.replace(";", " ");
        String[] words = str.split(" ");
        String str2 = "";
        for (int i = 1; i < words.length; i += 4){
            str2 += words[i] + " ";
        }
        String[] words1 = str2.split(" ");
        return words1;
    }

    public String[] getAnswers(){
        File file2 = new File("C:\\Users\\katya\\OneDrive\\Рабочий стол\\TestSystem\\TestSystem\\results.txt");
        String content = "";
        try (FileReader fileReader = new FileReader(file2)) {
            Scanner scUsers = new Scanner(fileReader);
            content = scUsers.nextLine();
            while (scUsers.hasNextLine()){
                content += scUsers.nextLine();
            }
            fileReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        String[] words2 = content.split(" ");
        return words2;
    }

    public int numberTrue(String[] words1, String[] words2){
        int count = 0;

        for(int i=0; i< words2.length; i++){
            if(words1[i].equals(words2[i])){
                count++;
            }
        }
        return count;
    }

    public boolean checkFile() {
        File file2 = new File("C:\\Users\\katya\\OneDrive\\Рабочий стол\\TestSystem\\TestSystem\\results.txt");
        if(file2.length() == 0){
            return true;
        }
        return false;
    }
    public void setFile(File file) {
        this.file = file;
    }

}
