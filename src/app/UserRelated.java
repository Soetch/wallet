package app;

import util.Exceptions;

import java.nio.file.Files;
import java.nio.file.Path;

public class UserRelated {
    public void UserList() {
        for(int i = 0; i < 5; i++) {
            if(Files.exists(Path.of("src/data/" + User.userID))) {
                System.out.println("The file exists.");
            } else {
                System.out.println(Exceptions.fileNoExisting);
            }
        }
    }
}
