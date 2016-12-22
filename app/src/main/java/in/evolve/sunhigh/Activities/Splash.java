package in.evolve.sunhigh.Activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import butterknife.BindView;
import in.evolve.sunhigh.R;

public class Splash extends BaseActivity {


   private ProgressBar splashProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashProgressBar = (ProgressBar) findViewById(R.id.progress_bar);

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent launchLanding = new Intent(Splash.this,Landing.class);
               startActivity(launchLanding);
               Splash.this.finish();
           }
       },5000);
    }
}
