package util;

public class Exceptions {
    public static final String addMoneyNoReturn = "[EXCEPTION] addMoney : You chose not to return.";
    public static final String takeMoneyNoReturn = "[EXCEPTION] takeMoney : You chose not to return.";
    public static final String writingUserError = "[ERROR] userCreate : Error while writing the file.";
    public static final String deleteUserError = "[ERROR] userDelete : Couldn't delete the file.";
    public static final String fileNoExisting = "[EXCEPTION] userList : The file doesn't exist";
    /**
     * Throws an exception from the exception list.
     */
    public static String throwException(String exception) {
        return exception;
    }
}
