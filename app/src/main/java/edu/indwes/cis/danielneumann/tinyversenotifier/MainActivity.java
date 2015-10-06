package edu.indwes.cis.danielneumann.tinyversenotifier;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.RemoteInput;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    static final String EXTRA_VOICE_REPLY = "extra_voice_reply";
    RemoteInput remoteInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String replyLabel = getResources().getString(R.string.reply_label);
        String[] replyChoices = getResources().getStringArray(R.array.reply_choices);
        remoteInput = new RemoteInput.Builder(EXTRA_VOICE_REPLY)
                .setLabel(replyLabel)
                .setChoices(replyChoices)
                .build();

        setContentView(R.layout.activity_main);
    }
}
