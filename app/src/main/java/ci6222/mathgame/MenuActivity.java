package ci6222.mathgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        final Button playButton = (Button)findViewById(R.id.buttonPlay);
        playButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){

        Intent i;
        i = new Intent(this, GameActivity.class);
        startActivity(i);

    }
}
