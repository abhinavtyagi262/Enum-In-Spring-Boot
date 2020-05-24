package com.abhinav;

import com.abhinav.constant.ErrorCode;
import com.abhinav.constant.ErrorCodes;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println(ErrorCode.SUCCESS.getCode() + "\t" + ErrorCode.SUCCESS.getDescription());
        System.out.println(ErrorCode.FAIL.getCode() + "\t" + ErrorCode.FAIL.getDescription());
        
        
        System.out.println(ErrorCodes.SUCCESS.getCode() + "\t" + ErrorCodes.SUCCESS.getDescription());
        System.out.println(ErrorCodes.FAIL.getCode() + "\t" + ErrorCodes.FAIL.getDescription());
    }
}
