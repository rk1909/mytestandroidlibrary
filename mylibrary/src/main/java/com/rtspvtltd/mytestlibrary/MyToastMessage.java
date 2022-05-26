package com.rtspvtltd.mytestlibrary;

import android.content.Context;
import android.widget.Toast;

public class MyToastMessage {
    public void printtoastmessage(Context context,String message){
        Toast.makeText(context,"The message is "+message, Toast.LENGTH_LONG).show();
    }
}
