package primus.pawel;

import static java.lang.Integer.parseInt;

// int32 to IPv4
// 5kyu
// https://www.codewars.com/kata/52e88b39ffb6ac53a400022e/train/java
// 2021-05-17 T:20:11:40
class Exercise_128 {

    public static String longToIP(long ip) {
        StringBuilder binaryRepresentation = new StringBuilder(Long.toBinaryString(ip));
        StringBuilder binary32Representation = new StringBuilder();
        StringBuilder IPv4 = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        if (binaryRepresentation.length() < 32) {
            String zero = "0";
            binary32Representation.append(zero.repeat(32 - binaryRepresentation.length()));
            binary32Representation.append(binaryRepresentation);
        } else {
            binary32Representation.append(binaryRepresentation);
        }


        for (int i = 0; i < binary32Representation.length(); i++) {
            sb.append(binary32Representation.charAt(i));
            if ((i + 1) % 8 == 0) {
                IPv4.append(parseInt(sb.toString(), 2)).append(".");
                sb.delete(0, sb.length());
            }
        }

        IPv4.deleteCharAt(IPv4.length() - 1);

        return IPv4.toString(); // do it!
    }

    public static void main(String[] args) {
        longToIP(23);
    }
}

/* public static String longToIP(long ip) {
    return InetAddresses.fromInteger((int) ip).getHostAddress();
  }

 public static String longToIP(long ip) {
    return String.format("%d.%d.%d.%d", (ip&0xFF000000)>>24, (ip&0xFF0000)>>16, (ip&0xFF00)>>8, ip&0xFF);
  }


  */
