package edu.quinnipiac.ser210.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RecieveMessageActivity extends AppCompatActivity
{

	private static final String EXTRA_MESSAGE = "message";

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recieve_message);

		Intent intent = getIntent();
		String messageText = intent.getStringExtra(EXTRA_MESSAGE);
		TextView messageView = (TextView) findViewById(R.id.message);
		messageView.setText(messageText);
	}
}