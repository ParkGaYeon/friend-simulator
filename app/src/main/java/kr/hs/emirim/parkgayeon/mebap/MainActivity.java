package kr.hs.emirim.parkgayeon.mebap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String TAG="메밥님";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate 메소드 호출~");
        setContentView(R.layout.activity_main);
        Log.d(TAG,"activity_main 레이아웃 세팅~");
    }

    void onClick(View view){
        Log.d(TAG,"onClick 메소드 호출~");
        Log.d(TAG,"클릭된 뷰 id :"+view.getId());

            switch (view.getId()){
                case R.id.button1:
                    Log.d(TAG,"버튼 1클릭~");
                    Toast.makeText(this,"빡가야 안뇽~",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button2:
                    Log.d(TAG,"버튼 2클릭~");
                    Toast.makeText(this,"야야야 빡가연",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button3:
                    Log.d(TAG,"버튼 3클릭~");
                    Toast.makeText(this,"으흐흐흐하핳",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button4:
                    Log.d(TAG,"버튼 4클릭~");
                    Toast.makeText(this,"졸...려....",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button5:
                    Log.d(TAG,"버튼 5클릭~");
                    Toast.makeText(this,"야야야야 내 자캐봐라 예쁘지!!",Toast.LENGTH_SHORT).show();
                    break;
                default:
                    Log.d(TAG,"버튼 잘못클릭~");
                    Toast.makeText(this,"잘못눌렀어욥!!",Toast.LENGTH_SHORT).show();
                    break;
            }
        Log.d(TAG,"무사히 종료~");
    }
}
