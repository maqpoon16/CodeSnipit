package com.maqpoon.codesnipit;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.maqpoon.codesnipit.VIewModels.FormInteractorImpl;
import com.maqpoon.codesnipit.VIewModels.FormPresenter;
import com.maqpoon.codesnipit.VIewModels.FormPresenterImpl;
import com.maqpoon.codesnipit.VIewModels.FormView;
import com.maqpoon.codesnipit.VIewModels.User;

public class MainActivity extends AppCompatActivity implements FormView {
    private EditText email,password,cnic,mobile,address;
    private Button button;
    private ProgressBar progressBar;
    FormPresenter presenter;
    private LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText) findViewById(R.id.inEmail);
        password = (EditText) findViewById(R.id.inPassword);
        cnic = (EditText) findViewById(R.id.inCnic);
        mobile = (EditText) findViewById(R.id.inMobile);
        address = (EditText) findViewById(R.id.inAddress);
        button = (Button) findViewById(R.id.inSave);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        presenter = new FormPresenterImpl(this, new FormInteractorImpl());
        //first time
        presenter.onButtonClick();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onButtonClick();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
        linearLayout.setVisibility(View.INVISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
        linearLayout.setVisibility(View.VISIBLE);
    }

    @Override
    public void setUser(User user) {
       email.setText(user.getEmail());
        password.setText(user.getPassword());
        mobile.setText(user.getMobile());
        address.setText(user.getAddress());
        cnic.setText(user.getCnic()
        );
    }


}
