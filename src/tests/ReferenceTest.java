package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReferenceTest {
    public final static String appID = "wallet";
    public final static String appTitle = "Wallet";
    public final static String appVersion = "alpha1.0.0";
    public final static String appAuthor = "Soetch";
    @Test
    void displayAppInfos() {
        System.out.println("This app's title is " + appTitle + ", it's ID is " + appID + ", it's author is " + appAuthor + " and it runs under the " + appVersion + " version.");
    }
}