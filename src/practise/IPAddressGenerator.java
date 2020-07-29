package practise;

import java.util.ArrayList;

public class IPAddressGenerator {
    // Construct the possible subarrays
    // validate the ip addresses (0-255) && !.0

    public ArrayList<String> generateIpAddress(String s) {
        ArrayList<String> address = new ArrayList<>();
        String temp = s;
        for(int i=1; i<temp.length()-2; i++) {
            for(int j=i+1; j<temp.length()-1; j++) {
                for(int k=j+1; k<temp.length(); k++) {
                    temp = temp.substring(0, k) + "." + temp.substring(k);
                    temp = temp.substring(0,j) + "." + temp.substring(j);
                    temp = temp.substring(0,i) + "." + temp.substring(i);
                    if(isValidAddress(temp)) {
                        address.add(temp);
                    }
                    temp = s;
                }
            }
        }
        return address;
    }

    private boolean isValidAddress(String s) {
        String ip[] = s.split("\\.");
        for(String fragment : ip){
            int val = Integer.parseInt(fragment);
            if(fragment.length() > 3 || val < 0 || val > 255) {
                return false;
            } else if(fragment.length() > 1) {
                if(val == 0 || fragment.charAt(0) == '0') {
                    return false;
                }
            }
        }
        return true;
    }
}
