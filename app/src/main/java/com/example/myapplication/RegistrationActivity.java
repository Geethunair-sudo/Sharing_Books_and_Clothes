package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.pojo.RegisterRequest;
import com.example.myapplication.pojo.RegisterResponse;
import com.example.myapplication.ws.APIService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RegistrationActivity extends AppCompatActivity {

    private static final String TAG = "RegistrationActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        final EditText etUsername = findViewById(R.id.username);
        final EditText etEmail = findViewById(R.id.email);
        final EditText etPhoneNum = findViewById(R.id.phonenum);
        final EditText etPassword = findViewById(R.id.password);

        Button btnLogin = findViewById(R.id.signin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etUsername.getText().toString();
                String email = etEmail.getText().toString();
                String phonenum = etPhoneNum.getText().toString();
                String password = etPassword.getText().toString();

                RegisterRequest registerRequest = new RegisterRequest();
                registerRequest.setUsername(username);
                registerRequest.setEmail(email);
                registerRequest.setPhonenum(phonenum);
                registerRequest.setPassword(password);

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("http://192.168.48.35/donatebookclothes/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                APIService service = retrofit.create(APIService.class);
                Call<RegisterResponse> call = service.register(registerRequest);
                call.enqueue(new Callback<RegisterResponse>() {
                    @Override
                    public void onResponse(Call<RegisterResponse> call, Response<RegisterResponse> response) {
                        if (response.body() != null && response.body().getStatus()) {
                            Intent intent = new Intent(getApplicationContext(), AddressActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    }

                    @Override
                    public void onFailure(Call<RegisterResponse> call, Throwable t) {
                        //Log.d("Registration","Message-" + t.getMessage());
                        Toast.makeText(getApplicationContext(), "Invalid_Credential", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
    }
}