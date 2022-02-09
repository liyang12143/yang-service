package com.digital.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author liyang
 * @date 2022/2/9 14:40
 */
@Service
public class StaticVariableService {

    private static String userName;

    @Value("${liyang.test.userName}")
    public void setUserName(String userName) {
        StaticVariableService.userName = userName;
    }

    public String test() {
        return userName;
    }



}
