package com.kenshin;

public class StringToInteger {
    public int atoi(String str) {
        int out = 0;
        int sign = 1;
        char[] strArray = str.trim().toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] == '-' || strArray[i] == '+') {
                if (i == 0) {
                    sign = strArray[i] == '-' ? -1 : 1;
                } else {
                    return 0;
                }
            } else if (strArray[i] >= '0' && strArray[i] <= '9') {
                if ((out > (int)(Integer.MAX_VALUE / 10)) || (out == (int)(Integer.MAX_VALUE / 10) && strArray[i] - '0' > 7 + (1 - sign) / 2) ) {
                    if (sign > 0) {
                        return Integer.MAX_VALUE;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else {
                    out = out * 10 + strArray[i] - '0';
                }
            } else {
                break;
            }
        }
        return out * sign;
    }
}
