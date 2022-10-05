package tests;

import app.User;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class UserTest {
    // Create a User object.
    User testUser = new User();

    @Test
    void createUser() throws IOException {
       testUser.createUser("1", "TestUser", "TestPassword");
    }
}