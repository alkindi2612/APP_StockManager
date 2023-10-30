package kel.market;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextPassword;
    private CheckBox checkBoxRememberMe;
    private Button buttonLogin;
    private TextView textViewSignup;
    private TextView textViewFacebookLogin;
    private TextView textViewGoogleLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        checkBoxRememberMe = findViewById(R.id.checkBoxRememberMe);
        buttonLogin = findViewById(R.id.buttonLogin);
        textViewSignup = findViewById(R.id.textViewSignup);
        textViewFacebookLogin = findViewById(R.id.textViewFacebookLogin);
        textViewGoogleLogin = findViewById(R.id.textViewGoogleLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                boolean rememberMe = checkBoxRememberMe.isChecked();
                if (rememberMe) {
                    // TODO: Save username and password for future use
                }

                if (!username.isEmpty() && !password.isEmpty()) {
                    // TODO: Add your login logic here

                    Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Please enter username and password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        textViewSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: Navigate to sign up activity or show sign up dialog
                Toast.makeText(MainActivity.this, "Sign up now clicked", Toast.LENGTH_SHORT).show();
            }
        });

        textViewFacebookLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: Implement Facebook login logic
                Toast.makeText(MainActivity.this, "Login with Facebook clicked", Toast.LENGTH_SHORT).show();
            }
        });

        textViewGoogleLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: Implement Google login logic
                Toast.makeText(MainActivity.this, "Login with Google clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
