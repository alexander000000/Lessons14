package av.shangin.lessons1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;

public class MainActivity1 extends AppCompatActivity {

    private Button mButton;
    private TextView mText;
    private Intent mIntent1;


    public static final String msfString ="go.go.go";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        final String newString = getString(R.string.newText);

        mText = findViewById(R.id.textView);

        mButton = findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mText.setText(newString);

                mIntent1 = new Intent(MainActivity1.this, SecondActivity.class);
                //mIntent1.setData(Uri.parse(msfString));
                mIntent1.putExtra(msfString,"MainActivity1");
                startActivity(mIntent1);
            }
        });



    }
}
