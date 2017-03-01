package com.vogella.android.shopping;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v4.os.TraceCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String name, email, shop1,shop2,shop3,shop4,shop5,shop6,shop7,shop8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClickButton(View view) {

        Bundle b = new Bundle();
        EditText nameEditText = (EditText)findViewById(R.id.name_editText);
        name = nameEditText.getText().toString();

        EditText emailEditText = (EditText)findViewById(R.id.email_editText);
        email = emailEditText.getText().toString();

        EditText item1EditText = (EditText)findViewById(R.id.shop1_editText);
        shop1 = item1EditText.getText().toString();
        EditText item2EditText = (EditText)findViewById(R.id.shop2_editText);
        shop2 = item2EditText.getText().toString();
        EditText item3EditText = (EditText)findViewById(R.id.shop3_editText);
        shop3 = item3EditText.getText().toString();
        EditText item4EditText = (EditText)findViewById(R.id.shop4_editText);
        shop4 = item4EditText.getText().toString();
        EditText item5EditText = (EditText)findViewById(R.id.shop5_editText);
        shop5 = item5EditText.getText().toString();
        EditText item6EditText = (EditText)findViewById(R.id.shop6_editText);
        shop6 = item6EditText.getText().toString();
        EditText item7EditText = (EditText)findViewById(R.id.shop7_editText);
        shop7 = item7EditText.getText().toString();
        EditText item8EditText = (EditText)findViewById(R.id.shop8_editText);
        shop8 = item8EditText.getText().toString();

        b.putString("email", email );
        b.putString("name", name);
        b.putString("shopping_1", shop1);
        b.putString("shopping_2", shop2);
        b.putString("shopping_3", shop3);
        b.putString("shopping_4", shop4);
        b.putString("shopping_5", shop5);
        b.putString("shopping_6", shop6);
        b.putString("shopping_7", shop7);
        b.putString("shopping_8", shop8);

        FragmentOne fragmentOne = new FragmentOne();
        fragmentOne.setArguments(b);
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.activity_main, fragmentOne);
        ft.addToBackStack(null);
        ft.commit();
    }
}
