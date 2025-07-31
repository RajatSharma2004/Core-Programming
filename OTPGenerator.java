import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class OTPGenerator {

    public static int generateSixDigitOTP() {
        Random random = new Random();
        return 100000 + random.nextInt(900000);
    }

    public static boolean areOTPsUnique(int[] otps) {
        if (otps == null || otps.length == 0) {
            return true;
        }
        Set<Integer> uniqueOtps = new HashSet<>();
        for (int otp : otps) {
            if (!uniqueOtps.add(otp)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numberOfOTPsToGenerate = 10;
        int[] generatedOTPs = new int[numberOfOTPsToGenerate];
        Set<Integer> uniqueCheckSet = new HashSet<>();
        Random random = new Random();

        System.out.println("Generating 10 unique 6-digit OTPs:");

        for (int i = 0; i < numberOfOTPsToGenerate; i++) {
            int otp;
            do {
                otp = generateSixDigitOTP();
            } while (!uniqueCheckSet.add(otp));
            generatedOTPs[i] = otp;
        }

        System.out.println("Generated OTPs: " + Arrays.toString(generatedOTPs));
        System.out.println("Are all generated OTPs unique? " + areOTPsUnique(generatedOTPs));
    }
}