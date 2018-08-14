package lafaya.register;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Toast   toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //注册码按键
        Button button_regist,button_logout;
        button_regist = (Button)findViewById(R.id.button_regist);
        button_logout = (Button)findViewById(R.id.id_logout);

        //输入注册码，延期码、授权码
        String text_input = null, delaycode = null, authorizecode = null;

        final TextView  id_text_delaycode, id_text_authorizecode;
        final EditText id_text_codenumber, id_text_randomcode, id_text_runingcounts;

        id_text_codenumber = (EditText)findViewById(R.id.id_text_codenumber);
        id_text_randomcode = (EditText)findViewById(R.id.id_text_randomcode);
        id_text_runingcounts = (EditText)findViewById(R.id.id_text_runingcounts);
        id_text_delaycode = (TextView)findViewById(R.id.id_text_delaycode);
        id_text_authorizecode = (TextView)findViewById(R.id.id_text_authorizecode);

        toast=Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT);

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        //                .setAction("Action", null).show();
        //    }
        //});

        toast.cancel();
        toast=Toast.makeText(getApplicationContext(), "请输入注册码！", Toast.LENGTH_LONG);
        toast.show();


        button_regist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((TextUtils.isEmpty(id_text_randomcode.getText().toString())) ||
                        (TextUtils.isEmpty(id_text_codenumber.getText().toString())) ||
                        (TextUtils.isEmpty(id_text_runingcounts.getText().toString()))){

                    toast.cancel();
                    toast=Toast.makeText(getApplicationContext(), "注册码无效，请输入正确的注册码！", Toast.LENGTH_LONG);
                    toast.show();
                    return;

                }
                String poweron_code;
                int randomnumber;

                poweron_code = id_text_randomcode.getText().toString() + "0" + id_text_codenumber.getText().toString() + "0" + id_text_runingcounts.getText().toString();
                randomnumber = Integer.parseInt(id_text_randomcode.getText().toString());
                //poweron_code = Long.getLong(id_text_randomcode.getText().toString()+"0" + id_text_codenumber.getText().toString()+"0" + id_text_runingcounts.getText().toString());

                String text_temp;
                text_temp = generatedDelaycode(Long.parseLong(poweron_code),randomnumber);
                id_text_delaycode.setText(text_temp);

                text_temp = generatedAuthorizecode(Long.parseLong(poweron_code),randomnumber);
                id_text_authorizecode.setText(text_temp);

            }
        });

        button_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    //获取计算总数
    private long getTotalcount(String text_input){
        return Long.getLong(text_input);

    }

    //生产延期注册码
    private String generatedDelaycode(long poweron_code, int randomnumber){
        String delaycode = "000000";

        int  temp = 0;
        temp =(int)(poweron_code % 11);
        if(temp > 9) temp = 0;

        delaycode = Long.toString(temp) + Long.toString(poweron_code % 8) +
                Long.toString(poweron_code % 7) + Long.toString(poweron_code % 4) +
                Long.toString(poweron_code % randomnumber) + Long.toString(poweron_code % 9);

        return "延期码：" + delaycode;
    }

    //生产授权注册码
    private String generatedAuthorizecode(long poweron_code,int randomnumber){
        String authorizecode = "000000";
        int  temp = 0;
        temp =(int)(poweron_code % 11);
        if(temp > 9) temp = 0;

        authorizecode = Long.toString(poweron_code % 8) + Long.toString(poweron_code % randomnumber) +
                Long.toString(poweron_code % 7) + Long.toString(poweron_code % 6) +
                Long.toString(poweron_code % 9) + Long.toString(temp);

        return "授权码：" + authorizecode;
    }


}
