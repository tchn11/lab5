package lab5.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static lab5.console.ConsoleManager.PrintErr;

/**
 * Operates the script file for opening/reading.
 */
public class ScriptManager {
    private BufferedReader scriptReader;

    /**
     * Constructor, open script file
     * @param path Path to script file
     */
    public ScriptManager(String path){
        try {
            scriptReader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            PrintErr("Фаил не найден:" + path);
        }
    }

    /**
     * Read next line from script
     * @return Line in String
     */
    public String nextLine(){
        try {
            return scriptReader.readLine();
        } catch (IOException e) {
            PrintErr("Ошибка доступа к файлу.");
        } catch (NullPointerException e){
            return "exit";
        }
        return "exit";
    }


}
