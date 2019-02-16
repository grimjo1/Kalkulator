package com.example.kalkulator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    NumberController nc ;
    CalkController cc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nc = new NumberController();
        nc.setDisplay((TextView) findViewById(R.id.mainEditText));
        cc = new CalkController();
        cc.setNc(nc);
    }
    public void onDigitClick(View button){
        Button b = (Button) button;
        nc.addDigit(Integer.parseInt(b.getText().toString()));
    }
    public void onCClick(View b){
        nc.clear();
    }
    public void onClClick(View b){
        nc.clearLastDigit();
    }
    public void onPlusClick(View b){
        cc.slojit();
    }
    public void onCalkClick(View b){
        cc.vichislit();
    }
    public void onMinusClick(View b){
        cc.vichest();
    }
    public void onYmnojClick(View b){
        cc.ymnojit();
    }
    public void onDelitClick(View b){
        cc.delit();
    }
    public void onDotClick(View b){
        nc.addDot();
    }
    public void onInfoClick(View b){
        Intent i = new Intent(this,InfoActivity.class);
        startActivity(i);
    }
}
