package app;

import util.Exceptions;

import java.nio.file.Files;
import java.nio.file.Path;

public class UserRelated {
    public void UserList() {
        for(int i = 1; i < 5; i++) {
            if(Files.exists(Path.of("src/data/" + i))) {
                System.out.println("The file exists.");
            } else {
                System.out.println(Exceptions.fileNoExisting);
            }
        }
    }
}
