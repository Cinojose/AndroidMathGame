package ci6222.mathgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //final Button enter = (Button)findViewById(R.id.enterplay);
        //enter.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {

        Intent i;
        i = new Intent(this, GameActivity.class);
        startActivity(i);
    }

    public void onButtonClick(View view){
        onClick(view);
    }

}
