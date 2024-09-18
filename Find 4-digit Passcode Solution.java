public class main {

    // example openPhone method --> this is a given method
    public static boolean openPhone(String passcode){
        if (passcode.equals("3825")) return true;
        return false;
    }

    // Method uses brute force to find the correct 4-digit passcode
    // If the passcode is correct (openPhone returns true) then return the 4-digit passcode
    public static String findPasscode(){
        // 10,000 choices for 4-digit passcode
        for(int passcode = 0; passcode <= 10000; passcode++){
            // Convert passCode to 4-digit string format
            String passCodeAttempt = String.format("%04d", passcode);
            if (openPhone(passCodeAttempt)) {
                return passCodeAttempt;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // test
        System.out.println(findPasscode());
    }
}
