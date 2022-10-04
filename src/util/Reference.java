package util;

public class Reference {
    public final static String appID = "wallet";
    public final static String appTitle = "Wallet";
    public final static String appVersion = "alpha1.0.0";
    public final static String appAuthor = "Soetch";

    /**
     * Displays the app's infos with a clean console line.
     */
    public static void displayAppInfos() {
        System.out.println("This app's title is " + appTitle + ", it's ID is " + appID + ", it's author is " + appAuthor + " and it runs under the " + appVersion + " version.");
    }
}
