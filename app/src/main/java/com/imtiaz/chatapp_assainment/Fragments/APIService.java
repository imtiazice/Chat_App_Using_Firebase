package com.imtiaz.chatapp_assainment.Fragments;

import com.imtiaz.chatapp_assainment.Notifications.MyResponse;
import com.imtiaz.chatapp_assainment.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAcSROgH0:APA91bEW35t-if2Zpuvkw3VQY9Qea-Mlb5GcTlJXf19RXB_r8O1guDpKb61iBjwJCiOtJxhuKev-DIkNKWOqjQIx-oPXaNXvm3fMXadPrJsPvUsWKKGRzuc3wbJwPhtlvmFwF1Ybjk4U"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
