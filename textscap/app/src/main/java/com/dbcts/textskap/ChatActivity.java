package com.dbcts.textskap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.content.SharedPreferences;
import android.database.DataSetObserver;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ChatActivity extends AppCompatActivity {

    // TODO: Add member variables here:
    private String mDisplayName;
    private ListView mChatListView;
    private EditText mInputText;
    private ImageButton mSendButton;

    private DatabaseReference mDatabaseRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        // TODO: Set up the display name and get the Firebase reference

        displayName();

        // Link the Views in the layout to the Java code
        mInputText = (EditText) findViewById(R.id.messageInput);
        mSendButton = (ImageButton) findViewById(R.id.sendButton);
        mChatListView = (ListView) findViewById(R.id.chat_list_view);

        // TODO: Send the message when the "enter" button is pressed


        // TODO: Add an OnClickListener to the sendButton to send a message

        mSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage();
            }
        });


mDatabaseRef = FirebaseDatabase.getInstance().getReference();

    }

    // TODO: Retrieve the display name from the Shared Preferences
    private void displayName(){

        SharedPreferences prefs = getSharedPreferences(RegistrationScreen.CHAT_PREFS,MODE_PRIVATE);
        mDisplayName = prefs.getString(RegistrationScreen.DISPLAY_NAME_KEY,null);

        if(mDisplayName == null){

            mDisplayName = "Anonymous";
        }


    }


    private void sendMessage() {

        String userInput = mInputText.getText().toString();

        if(!userInput.equals("")){

            IndividualMessage chat = new IndividualMessage(mDisplayName,userInput);

            mDatabaseRef.child("messages").push().setValue(chat);
            mInputText.setText("");
        }


    }

    // TODO: Override the onStart() lifecycle method. Setup the adapter here.


    @Override
    public void onStop() {
        super.onStop();

        // TODO: Remove the Firebase event listener on the adapter.

    }
}











