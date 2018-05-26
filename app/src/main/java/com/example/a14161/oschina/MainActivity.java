package com.example.a14161.oschina;

import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a14161.oschina.bean.BannerBean;
import com.example.a14161.oschina.bean.NewsBean;
import com.itheima.loopviewpager.LoopViewPager;
//import com.itheima.retrofitutils.ItheimaHttp;
import com.itheima.retrofitutils.ItheimaHttp;
import com.itheima.retrofitutils.L;
import com.itheima.retrofitutils.Request;
import com.itheima.retrofitutils.listener.HttpResponseListener;

import org.itheima.recycler.adapter.BaseLoadMoreRecyclerAdapter;
import org.itheima.recycler.header.RecyclerViewHeader;
import org.itheima.recycler.listener.ItemClickSupport;
import org.itheima.recycler.viewholder.BaseRecyclerViewHolder;
import org.itheima.recycler.widget.ItheimaRecyclerView;
import org.itheima.recycler.widget.PullToLoadMoreRecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Headers;
import retrofit2.Call;


public class MainActivity extends AppCompatActivity {
    PullToLoadMoreRecyclerView pullToLoadMoreRecyclerView;
    private ItheimaRecyclerView mRecyclerView;
    @BindView(R.id.swipe_refresh_layout)
    SwipeRefreshLayout mSwipeRefreshLayout;

    //轮播变量
    LoopViewPager mLoopViewPager;
    List<String> imageList=new ArrayList<>();
    List<String> textList=new ArrayList<>();
    //下拉刷新和加载更多
    private int state=0;
    private static final int STATE_MORE=2;
    private static final int STATE_REFRESH=1;
    private String  nextPageToken="";
    private NewsBean mNewsBean;  //用来接收NewsBean
    List<NewsBean.ResultBean.ItemsBean> itemBeans=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","start");
        ButterKnife.bind(this);

        RecyclerViewHeader header = (RecyclerViewHeader) findViewById(R.id.recycler_header);
         mRecyclerView= (ItheimaRecyclerView) findViewById(R.id.recycler_view);
        header.attachTo(mRecyclerView);

        mLoopViewPager = (LoopViewPager) findViewById(R.id.lvp_pager);
        initBanner();

        ItemClickSupport itemClickSupport = new ItemClickSupport(mRecyclerView);
        //点击事件
        itemClickSupport.setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                int id=itemBeans.get(position).getId();
                Intent intent=new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("id",id);
                startActivity(intent);
            }
        });
        //长按事件
        itemClickSupport.setOnItemLongClickListener(new ItemClickSupport.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClicked(RecyclerView recyclerView, int position, View v) {
                Toast.makeText(recyclerView.getContext(), "我被长按了", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        pullToLoadMoreRecyclerView = new PullToLoadMoreRecyclerView<NewsBean>(mSwipeRefreshLayout, mRecyclerView, MyRecyclerViewHolder.class) {
            @Override
            public int getItemResId() {
                //recylerview item资源id
                return R.layout.item_list_news;
            }

            @Override
            public String getApi() {
                //接口
                String url= "action/apiv2/news?pageToken=";
                switch(state){
                    //加载更多
                    case STATE_MORE:
                        //获得下一个pagetoken
                        nextPageToken=mNewsBean.getResult().getNextPageToken();
                        url+=nextPageToken;
                        break;
                    //下拉刷新，家在第一个页面不需要pagetoken
                    case STATE_REFRESH:
                        break;
                }
                return url;
            }
//            //是否加载更多的数据，根据业务逻辑自行判断，true表示有更多的数据，false表示没有更多的数据，如果不需要监听可以不重写该方法
            @Override
            public boolean isMoreData(BaseLoadMoreRecyclerAdapter.LoadMoreViewHolder holder) {
                Log.d("MainActivity","load more");
                state=STATE_MORE;

                return true;
            }
        };

        /////监听下拉刷新//////////
        pullToLoadMoreRecyclerView.setLoadingDataListener(new PullToLoadMoreRecyclerView.LoadingDataListener<NewsBean>() {

            @Override
            public void onRefresh() {
                //监听下啦刷新，如果不需要监听可以不重新该方法
                L.i("setLoadingDataListener onRefresh");
                state=STATE_REFRESH;


            }

            @Override
            public void onSuccess(NewsBean newsBean , Headers headers) {
                //监听http请求成功，如果不需要监听可以不重新该方法
                L.i("setLoadingDataListener onSuccess: " + newsBean);
                mNewsBean=newsBean;
                List<NewsBean.ResultBean.ItemsBean> itemDatas=newsBean.getItemDatas();
                for (NewsBean.ResultBean.ItemsBean itemData : itemDatas) {
                    itemBeans.add(itemData);
                }
                Log.d("MainActivity",""+itemBeans.size());
            }

        });
        /////////////////////////////



        //开始请求
        pullToLoadMoreRecyclerView.requestData();

    }

    private void initBanner() {
        Request request = ItheimaHttp.newGetRequest("action/apiv2/banner?catalog=1");//apiUrl格式："xxx/xxxxx"
        Call call = ItheimaHttp.send(request, new HttpResponseListener<BannerBean>() {
            @Override
            public void onResponse(BannerBean bannerBean, Headers headers) {
                Log.d("MainActivity","---------------------");
                List<BannerBean.ResultBean.ItemsBean> itemDatas= bannerBean.getItemDatas();
                for(int i=0;i<itemDatas.size();i++){
                    textList.add(itemDatas.get(i).getName());
                    imageList.add(itemDatas.get(i).getImg());
                }
                mLoopViewPager.setImgData(imageList);
                mLoopViewPager.setTitleData(textList);
                mLoopViewPager.start();   //一行代码
            }
         });

    }

    public static class MyRecyclerViewHolder extends BaseRecyclerViewHolder<NewsBean.ResultBean.ItemsBean> {
        @BindView(R.id.newsTitle)
        TextView mTvTitle;
        @BindView(R.id.intro)
        TextView mTvDescription;
        @BindView(R.id.date)
        TextView mTvTime;
        @BindView(R.id.infoComment)
        ImageView mTvInfoComment;
        @BindView(R.id.commentNum)
        TextView mTvCommentCount;

        public MyRecyclerViewHolder(ViewGroup parentView, int itemResId) {
            super(parentView, itemResId);
            Log.d("MainActivity", "123");
        }

        /**
         * 绑定数据的方法，在mData获取数据（mData声明在基类中）
         */
        @Override
        public void onBindRealData() {
            Log.d("MainActivity",mData.getBody());
            mTvTitle.setText(mData.getTitle());
            mTvDescription.setText(mData.getBody());
            mTvTime.setText(mData.getPubDate());
            mTvCommentCount.setText(mData.getCommentCount() + "");

        }

    }

}
