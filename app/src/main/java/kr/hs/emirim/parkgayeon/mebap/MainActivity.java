package kr.hs.emirim.parkgayeon.mebap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void onClick(View view){

            switch (view.getId()){
                case R.id.button1:
                    Toast.makeText(this,"잠깐.",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button2:
                    Toast.makeText(this,"따라나와",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button3:
                    Toast.makeText(this,"허어어어어어~",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button4:
                    Toast.makeText(this,"음?",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button5:
                    Toast.makeText(this,"잠깐잠깐잠ㅁ깐ㄴ!!",Toast.LENGTH_SHORT).show();
                    break;
                default:
                    Toast.makeText(this,"잘못했어욤~~!!",Toast.LENGTH_SHORT).show();
                    break;
            }
    }
}
