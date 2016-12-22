package in.evolve.sunhigh.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.FacebookSdk;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.common.SignInButton;

import in.evolve.sunhigh.R;

public class LoginMain extends BaseActivity {

    private LoginButton fbLoginButton;
    private SignInButton googleSignInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(LoginMain.this);
        setContentView(R.layout.activity_login_main);


        fbLoginButton  = (LoginButton) findViewById(R.id.fb_login_button);
        googleSignInButton = (SignInButton) findViewById(R.id.google_sign_in_button);
    }
}
