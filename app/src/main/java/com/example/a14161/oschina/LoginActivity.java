package com.example.a14161.oschina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.itheima.retrofitutils.ItheimaHttp;
import com.itheima.retrofitutils.Request;
import com.itheima.retrofitutils.listener.HttpResponseListener;

import okhttp3.Headers;
import retrofit2.Call;

public class LoginActivity extends AppCompatActivity {
    private String url="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        url="action/api/login_validate";
        Request request = ItheimaHttp.newGetRequest(url);//apiUrl格式："xxx/xxxxx"
        request.putParams("keep_login",1)
                .putParams("user_name","13416342492")
                .putParams("pwd","lxtlxl520");
        Call call = ItheimaHttp.send(request, new HttpResponseListener<String>() {
            @Override
            public void onResponse(String s, Headers headers) {
                Log.d("LoginActivity",s);
            }
        });
    }

}
