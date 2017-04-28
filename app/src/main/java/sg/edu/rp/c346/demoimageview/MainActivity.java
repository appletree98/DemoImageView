package sg.edu.rp.c346.demoimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    // Declare the ImageView object called ivDay2
    ImageView ivDay2;
    ImageView ivDay3;
    ImageView ivDay4;
    ImageView ivDay5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the ImageView obj and assign to ivDay2
        ivDay2 = (ImageView) findViewById(R.id.imageView2);
        // Set the image
        ivDay2.setImageResource(R.drawable.day2);


        // Get the ImageView obj and assign to ivDay3
        ivDay3 = (ImageView) findViewById(R.id.imageView3);
        // Set the image
        ivDay3.setImageResource(R.drawable.day3);


        // Get the ImageView obj and assign to ivDay4
        ivDay4 = (ImageView) findViewById(R.id.imageView4);
        // Set the image
        ivDay4.setImageResource(R.drawable.day4);


        // Get the ImageView obj and assign to ivDay5
        ivDay5 = (ImageView) findViewById(R.id.imageView5);
        // Set the image
        ivDay5.setImageResource(R.drawable.day5);


    }
}
