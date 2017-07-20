package resmayoung.example.com.relaxingrain;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //private static final String isPlaying = " Enjoy ";

    private MediaPlayer player;
    private Button birdButton;
    private Button bassButton;
    private Button recehButton;
    private Button thunderButton;
    private Button fiverain;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        birdButton = (Button) this.findViewById(R.id.rain1);
        birdButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(1);

            }
        });
        bassButton = (Button) this.findViewById(R.id.rain2);
        bassButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(2);

            }
        });
        recehButton = (Button) this.findViewById(R.id.rain3);
        recehButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(3);

            }
        });
        thunderButton = (Button) this.findViewById(R.id.rain4);
        thunderButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(4);

            }
        });
        fiverain = (Button) this.findViewById(R.id.rain5);
        fiverain.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(5);

            }
        });

    }

    @Override
    public void onPause() {
        try {
            super.onPause();
            player.pause();
        } catch (Exception e) {

        }
    }

    private void playSound(int arg) {
        try {
            if (player.isPlaying()) {
                player.stop();
                player.release();
            }
        } catch (Exception e) {
           Toast.makeText(this, " Let The Rain Wash All The Pain of Yesterday ", Toast.LENGTH_LONG).show();
        }
        if (arg == 1) {
            //Toast.makeText(this, isPlaying, Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.rainbird);

        } else if (arg == 2) {
            //Toast.makeText(this, isPlaying, Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.rainbass);
        } else if (arg == 3) {
            //Toast.makeText(this, isPlaying, Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.rainreceh);
        } else if (arg == 4) {
            //Toast.makeText(this, isPlaying, Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.rainthunder);
        } else if (arg == 5) {
            //Toast.makeText(this, isPlaying, Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.rainrecehbass);
        }
        player.setLooping(false);
        player.start();
    }
}