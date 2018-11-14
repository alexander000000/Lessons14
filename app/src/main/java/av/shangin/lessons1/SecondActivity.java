package av.shangin.lessons1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;

public class SecondActivity extends Activity {

    private TextView m2Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        m2Text = findViewById(R.id.textView2);

        Intent myIntent = getIntent();
        String text;
        Uri myUri =myIntent.getData();


        if(myUri==null)
        {
            text =myIntent.getStringExtra(MainActivity1.msfString);
            m2Text.setText("Explicit["+text+"]");
        }
        else
        {
            //text= myUri.getHost();
            //text=myUri.toString();
            text =myIntent.getDataString();
            //if (text ==null)
                m2Text.setText("Implicit["+text+"]");
            //else m2Text.setText("Implicit is empty host");
        }


    }


}
