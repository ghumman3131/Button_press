package example.logicdemo;

import android.app.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity

{
    private TextView tv ;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.some_text);

        bt = (Button) findViewById(R.id.press_me_button);

        View.OnClickListener btclick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(tv.getText().toString() == "BEFORE BUTTON PRESS")
                {
                    tv.setText("AFTER BUTTON PRESSED");
                    tv.setTextColor(getResources().getColor(R.color.colorAccent));
                }
                else {
                    tv.setText("BEFORE BUTTON PRESS");
                }
            }
        };

        bt.setOnClickListener(btclick);






    }

}
