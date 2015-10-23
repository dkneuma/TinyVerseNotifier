package edu.indwes.cis.danielneumann.tinyversenotifier;

import android.content.Intent;
import android.support.v4.app.RemoteInput;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReplyActivity extends AppCompatActivity {
    public static final String EXTRA_VOICE_REPLY = "extra_voice_reply";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reply);
        textView = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();
        textView.setText(getMessageText(intent));
    }

    private CharSequence getMessageText(Intent intent) {
        Bundle remoteInput = RemoteInput.getResultsFromIntent(intent);
        if (remoteInput != null) {
            return remoteInput.getCharSequence(EXTRA_VOICE_REPLY);
        }
        return null;
    }
}