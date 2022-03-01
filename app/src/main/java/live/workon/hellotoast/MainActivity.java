package live.workon.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int mCount=0;
    private TextView lblShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblShowCount = (TextView) findViewById(R.id.txtCount);
        if (lblShowCount !=null)
            lblShowCount.setText(Integer.toString(mCount));
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();

    }

    public void countUp(View view) {
        mCount +=1;
        Log.d("count", Integer.toString(mCount));
        if (lblShowCount !=null)
            lblShowCount.setText(Integer.toString(mCount));
    }
}