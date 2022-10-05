package app;

import util.Exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class User {
    public static String userID = null;
    public static String userName = null;
    public static String userPassword = null;

    public void createUser(String userID, String userName, String userPassword) throws IOException {
        // Declare the path of the file who's going to be written.
        Path filePath = Path.of(userID);

        String userIDProcessed = "UserID : " + userID;
        String userNameProcessed = "userName : " + userName;
        String userPasswordProcessed = "userPassword : " + userPassword;

        try {
            // Create a file writer and a BufferedWriter : prepares the writing of the file.
            FileWriter fstream = new FileWriter("./" + filePath);
            BufferedWriter writer = new BufferedWriter(fstream);
            // Logs the end of the Preparation.
            System.out.println("[INFO] userCreate : Writing Preparation Achieved. Writing...");

            // Initializes Writing Process.
            writer.write(userIDProcessed);
            writer.newLine();
            writer.write(userNameProcessed);
            writer.newLine();
            writer.write(userPasswordProcessed);

            // If no Exception, Logs the end of the writing and the path of the file.
            System.out.println("[INFO] userCreate : File Written and located to " + filePath +". (User : " + userID + ")");

            // Logs the closing of the writer.
            System.out.println("[INFO] userCreate : Closed the BufferedWriter.");
            writer.close();
        } catch (Exception e) {
            System.out.println(Exceptions.writingUserError);
        }
    }
}