package org.example;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import com.twilio.exception.ApiException;
import java.net.URI;
import java.net.URISyntaxException;

import java.net.URI;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "ACea664c218c196979b899a7012cdf92c3";
    public static final String AUTH_TOKEN = "0b96f991b47862beb4928df36568e876";


    public static void main(String[] args) throws URISyntaxException {
        System.out.println(1);
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
        String json = "{\"status\": \"sent\"}";
        ObjectMapper mapper = new ObjectMapper();


//        try {
//            Message message = Message.creator(
//                    new PhoneNumber("+15715087350"),  // To number
//                    new PhoneNumber("+18557280153"),  // From number
//                    "Your username is" + userName                    // SMS body
//            ).create();
//
//            System.out.println(1);
        Call call = Call
                .creator(
                        new PhoneNumber("+15715087350"),
                        new PhoneNumber("+18557280153"),
                        new URI("http://demo.twilio.com/docs/voice.xml")
                )
                .create();

        System.out.println(call.getSid());

    }}
//        }
//    }
