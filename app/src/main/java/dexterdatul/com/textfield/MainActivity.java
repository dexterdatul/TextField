package dexterdatul.com.textfield;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    AppCompatEditText user;
    AppCompatEditText password;
    TextInputLayout userLayout;
    TextInputLayout passwordLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.username_textfield);
        password = findViewById(R.id.password_textfield);
        userLayout = findViewById(R.id.username_textinputlayout);
        passwordLayout = findViewById(R.id.password_textinputlayout);

        passwordLayout.setCounterEnabled(true);
        passwordLayout.setCounterMaxLength(8);

        user.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (user.getText().toString().isEmpty()) {
                    userLayout.setErrorEnabled(true);
                    userLayout.setError("Please enter your username");
                } else {
                    userLayout.setErrorEnabled(false);
                }
            }
        });

        user.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (user.getText().toString().isEmpty()) {
                    userLayout.setErrorEnabled(true);
                    userLayout.setError("Please enter your username");
                } else {
                    userLayout.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        password.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (password.getText().toString().isEmpty()) {
                    passwordLayout.setErrorEnabled(true);
                    passwordLayout.setError("Please enter your password");
                } else {
                    passwordLayout.setErrorEnabled(false);
                }
            }
        });

        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (password.getText().toString().isEmpty()) {
                    passwordLayout.setErrorEnabled(true);
                    passwordLayout.setError("Please enter your password");
                } else {
                    passwordLayout.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
