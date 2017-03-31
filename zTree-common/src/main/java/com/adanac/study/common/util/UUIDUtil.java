package com.adanac.study.common.util;

import java.util.UUID;

/**
 * Created by allen on 2017/3/15.
 */
public class UUIDUtil {
    public static String getUuid(){
        UUID uuid = UUID.randomUUID();
        String uuidStr =  uuid.toString();
        uuidStr = uuidStr.replace("-", "");
        return uuidStr;
    }
}
