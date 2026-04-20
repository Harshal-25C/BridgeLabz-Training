package com.regex.AdvancedRegexProblems;

/*
 * 💡 Explanation
 *    25[0-5] → 250–255
 *    2[0-4]\d → 200–249
 *    1\d{2} → 100–199
 *    [1-9]?\d → 0–99
 *    {3} → first three octets with dots
 *    Last group without dot                       */

public class IPAddressValidation {
    public static void main(String[] args) {

        String[] ips = {
            "192.168.1.1",
            "255.255.255.0",
            "256.1.1.1"
        };

        //Regex for IPv4 validation
        String regex =
            "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}" +
            "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";

        for(String ip : ips) {
            System.out.println(ip + " → " + ip.matches(regex));
        }
    }
}

/* Rules:
 * IPv4 consists of four numbers separated by dots
 * Each number must be between 0 and 255
 * 
 * Valid examples:
      192.168.1.1
      255.255.255.0
 * Invalid examples:
      256.1.1.1
      192.168.1
      192.168.01.1 (leading zero case can be restricted if needed)   
*/
