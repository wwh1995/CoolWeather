package activity;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class BaseActivity extends Activity {  
      
    public static final String TAG="tag";  
      
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
    }  
      
    /** 
     *�������л����  
     */  
    public void toast(String msg){  
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();      
        Log.d(TAG, msg);  
    }  
}  