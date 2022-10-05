package tests;

import app.User;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class UserTest {
    // Create a User object.
    User testUser = new User();

    @Test
    void addMoney() {
        System.out.println(testUser.addMoney(10, true));
    }

    @Test
    void takeMoney() {
        System.out.println(testUser.takeMoney(10, true));
    }

    @Test
    void createUser() throws IOException {
        testUser.createUser("1", "TestUser", "TestPassword");
    }

    @Test
    void deleteUser() throws IOException {
        testUser.deleteUser("1");
    }
}