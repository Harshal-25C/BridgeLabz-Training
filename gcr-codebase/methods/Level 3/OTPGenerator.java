public class OTPGenerator{
    //This method generates a random 6-digit OTP using Math.random()
    public static int generateOTP(){
        return (int) (Math.random()*900000)+100000;
    }

    //This method generates 10 OTPs and stores them in an array
    public static int[] generateTenOTPs(){
        int[] otps = new int[10];

        for(int i=0; i<10; i++){
            otps[i] = generateOTP();
        }
        return otps;
    }

    //This method checks whether all OTPs in the array are unique
    public static boolean areOTPsUnique(int[] otps){
        for(int i=0; i<otps.length; i++){
            for(int j=i+1; j<otps.length; j++){
                if(otps[i]==otps[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        //Generate 10 OTP numbers
        int[] otps = generateTenOTPs();

        //Display all generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }
		//Check whether all OTPs are unique
        System.out.println("Are all OTPs unique? " + areOTPsUnique(otps));
    }
}
