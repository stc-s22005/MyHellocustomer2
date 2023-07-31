package jp.suntech.s22005.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ボタン・オブジェクトの用意
        Button btClick = findViewById(R.id.btClick);
        //リスナ・オブジェクトの用意
        HelloLive listener = new HelloLive();
        //ボタンにリストを設定
        btClick.setOnClickListener(listener);
        //クリアボタンであるButtonオブジェクトを取得
        Button btClear = findViewById(R.id.btLiveclear);
        Button btClear1 = findViewById(R.id.btNameclear);
        //クリアボタンにリストを設定
        btClear.setOnClickListener(listener);
        btClear1.setOnClickListener(listener);
    }

    private class HelloLive implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            EditText input = findViewById(R.id.etLive);
            TextView output = findViewById(R.id.tvOutput);
            EditText input1 = findViewById(R.id.etName);
            TextView output1 = findViewById(R.id.tvOutput);

            int id = view.getId();
            if (id == R.id.btClick) {
                String inputStr = input.getText().toString();
                String inputStr1 = input1.getText().toString();
                output.setText(inputStr + "にお住まいの" + inputStr1 + "さん、こんにちは！");
            } else if (id == R.id.btLiveclear) {
                input.setText("");
                output.setText("");
            } else if (id == R.id.btNameclear) {
                input1.setText("");
                output1.setText("");
            }
        }
    }
}