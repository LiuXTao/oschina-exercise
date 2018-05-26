package com.example.a14161.oschina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.a14161.oschina.bean.DetailBean;
import com.example.a14161.oschina.utils.HtmlUtil;
import com.itheima.retrofitutils.ItheimaHttp;
import com.itheima.retrofitutils.Request;
import com.itheima.retrofitutils.listener.HttpResponseListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.http.Headers;

public class DetailActivity extends AppCompatActivity {
    @BindView(R.id.tv_title_deteil)
    TextView mTitleD;
    @BindView(R.id.tv_pub_data_detail)
    TextView mPubDataD;
    @BindView(R.id.tv_web_detail)
    WebView mWebD;
    @BindView(R.id.tv_soft_title_detail)
    TextView mSoftD;
    @BindView(R.id.tv_softs_layout)
    LinearLayout mSoftL;
    @BindView(R.id.tv_related_title_detail)
    TextView mRelateD;
    @BindView(R.id.tv_related_layout)
    LinearLayout mRelateL;
    @BindView(R.id.tv_commet__detail)
    TextView mCommentD;
    @BindView(R.id.tv_commet_layout)
    LinearLayout mCommentL;

    private String url="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);
        Intent intent=getIntent();
        int id=intent.getIntExtra("id",0);
        url="action/apiv2/news?id=";
        Request request = ItheimaHttp.newGetRequest(url+id);//apiUrl格式："xxx/xxxxx"
        Call call = ItheimaHttp.send(request, new HttpResponseListener<DetailBean>() {
            @Override
            public void onResponse(DetailBean detailBean, okhttp3.Headers headers) {
                //Log.d("DetailActivity",detailBean.getResult().getBody());
                mTitleD.setText(detailBean.getResult().getTitle());
                mPubDataD.setText(detailBean.getResult().getPubDate());
                //使可以解析js代码
                mWebD.getSettings().setJavaScriptEnabled(true);
                //防止加载hmtl格式字符串乱码
                mWebD.loadDataWithBaseURL(null, HtmlUtil.getNewContent(detailBean.getResult().getBody()), "text/html", "utf-8",null);

                List<DetailBean.ResultBean.AboutsBean> abouts= detailBean.getResult().getAbouts(); // 从bean中去除abouts数据形成一个列表
                if(abouts!=null&&abouts.size()>0){
                    for(int i=0;i<abouts.size();i++){
                        View view= View.inflate(DetailActivity.this,R.layout.item_about_softs,null);
                        TextView mTextView=view.findViewById(R.id.tv_item_about_soft_name);
                        mTextView.setText(abouts.get(i).getTitle());

                        mSoftL.addView(view);
                    }
                }
            }
        });
    }

}
