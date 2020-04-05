package app.opp.jokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOffice = (Button)findViewById(R.id.button);

        buttonOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(MainActivity.this, GameLevelsOffice.class);
                    startActivity(intent);finish();

                }catch (Exception e){};
            }
        });

        //________
        Button buttonZastol = (Button)findViewById(R.id.button2);

        buttonZastol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(MainActivity.this, GameLevelsZastol.class);
                    startActivity(intent);finish();

                }catch (Exception e){};
            }
        });
        //________

        //________
        Button buttonStudy = (Button)findViewById(R.id.button3);

        buttonZastol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(MainActivity.this, GameLevelsStudy.class);
                    startActivity(intent);finish();

                }catch (Exception e){};
            }
        });
        //________

        //________
        Button buttonNewRus = (Button)findViewById(R.id.button3);

        buttonZastol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(MainActivity.this, GameLevelsNewRus.class);
                    startActivity(intent);finish();

                }catch (Exception e){};
            }
        });
        //________

        //________
        Button buttonFamily = (Button)findViewById(R.id.button5);

        buttonZastol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(MainActivity.this, GameLevelsFamily.class);
                    startActivity(intent);finish();

                }catch (Exception e){};
            }
        });
        //________
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
