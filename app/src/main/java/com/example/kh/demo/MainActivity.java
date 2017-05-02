package com.example.kh.demo;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    CheckBox cb;
    ToggleButton toggleButton;
    TextView txt1;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        cb = (CheckBox) findViewById(R.id.cb);
        toggleButton = (ToggleButton) findViewById(R.id.togglebutton);
        txt1 = (TextView) findViewById(R.id.txtdemo);


    }
    public  void process(View view){
        if(cb.isChecked())
            toast();
    }


    public void toast(){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast,
                (ViewGroup) findViewById(R.id.line));

              txt = (TextView) layout.findViewById(R.id.txtcoffee);

        Typeface typeface = Typeface.createFromAsset( getAssets(),"fonts/ba.ttf");
        txt.setTypeface(typeface);
        Toast toast = new Toast(this);
        toast.setGravity(Gravity.BOTTOM, 0, 0);

        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);

        toast.show();
    }

public void toggle(View v){
    if(toggleButton.isChecked())
        toast();
    else
        Toast.makeText(this, "fail to show", Toast.LENGTH_SHORT).show();

}
}
