package app;

import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;
import util.Exceptions;
import java.io.IOException;

public class User {
    public static String userID = null;
    public static String userName = null;
    public static String userPassword = null;

    public static int money = 0;

    public MongoClientOptions mongoOption = MongoClientOptions.builder().maxConnectionIdleTime(60000).build();

    public void createUser(String userID, String userName, String userPassword) {
        // Logging the setting up the client, database and collection.
        System.out.println("[INFO] : Setting up the MongoDB client...");
        MongoClient client = new MongoClient(new MongoClientURI("mongodb+srv://soetch:Marceau53@cluster0.abv1rzl.mongodb.net/?retryWrites=true&w=majority"));
        System.out.println("[INFO] Client is setup! Setting up the database...");
        MongoDatabase database = client.getDatabase("data");
        System.out.println("[INFO] Database is setup! Setting up the collection...");
        MongoCollection<Document> collection = database.getCollection("userlist");
        System.out.println("[INFO] All set up!");

        // Sending the Infos.
        Document user = new Document("userID", userID)
                .append("userName", userName)
                .append("userPassword", userPassword);
        collection.insertOne(user);
        System.out.println("User added !");
    }

    public void deleteUser(String userID) throws IOException {
        // TODO : Setup MongoDB user deletion.
    }

    /**
     * @return The balance of the account.
     */
    public int returnMoney() {
        return money;
    }

    /**
     * Adds money to a balance.
     */
    public String addMoney(int amountToAdd, boolean doReturn) {
        // Adds the money.
        money = money + amountToAdd;
        // Checks whether it returns or not.
        if(doReturn) {
            return String.valueOf(money);
        } else {
            return Exceptions.addMoneyNoReturn;
        }
    }

    /**
     * Takes money to a balance.
     */
    public String takeMoney(int amountToTake, boolean doReturn) {
        // Take the money.
        money = money - amountToTake;
        // Checks whether it returns or not.
        if(doReturn) {
            return String.valueOf(money);
        } else {
            return Exceptions.takeMoneyNoReturn;
        }
    }

    public String generateID() {
        // Setting up a MongoClient
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://soetch:Marceau53@cluster0.abv1rzl.mongodb.net/?retryWrites=true&w=majority"));
        MongoDatabase mongoDatabase = mongoClient.getDatabase("data");
        MongoCollection<Document> database = mongoDatabase.getCollection("userList");

        return null;
    }
}