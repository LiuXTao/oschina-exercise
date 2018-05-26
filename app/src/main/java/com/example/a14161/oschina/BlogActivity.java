package com.example.a14161.oschina;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.a14161.oschina.bean.BlogBean;
import com.example.a14161.oschina.utils.StringUtils;

import org.itheima.recycler.adapter.BaseLoadMoreRecyclerAdapter;
import org.itheima.recycler.header.RecyclerViewHeader;
import org.itheima.recycler.viewholder.BaseRecyclerViewHolder;
import org.itheima.recycler.widget.ItheimaRecyclerView;
import org.itheima.recycler.widget.PullToLoadMoreRecyclerView;

import butterknife.BindView;

public class BlogActivity extends AppCompatActivity {
    private SwipeRefreshLayout mSwipeRefreshLayou;
    private ItheimaRecyclerView mItheimaRecyclerView;
    private PullToLoadMoreRecyclerView pullToLoadMoreRecyclerView;
    private  String url="action/apiv2/blog?catalog=3&%20pageToken=";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);
         mSwipeRefreshLayou=(SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
        mItheimaRecyclerView=(ItheimaRecyclerView) findViewById(R.id.recycler_view);

        RecyclerViewHeader header = (RecyclerViewHeader) findViewById(R.id.recycler_header);
        header.attachTo(mItheimaRecyclerView);

        RadioGroup mRadioCroup=(RadioGroup) findViewById(R.id.rg_blog_head_layout);
        mRadioCroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup radioGroup,int checkedId){
                switch(checkedId){
                    case R.id.bt_blog_head_recommend:
                        url="action/apiv2/blog?catalog=3&%20pageToken=";
                        break;
                    case R.id.bt_blog_head_hot:
                        url="/action/apiv2/blog?catalog=2&nextPageToken=";
                        break;
                    case R.id.bt_blog_new_blod:
                        url="/action/apiv2/blog?catalog=1&nextPageToken=";
                        break;
                }
                initData(); // 别忘记调用该函数
            }
        });

        initData();

    }

    private void initData() {

        pullToLoadMoreRecyclerView = new PullToLoadMoreRecyclerView<BlogBean>(mSwipeRefreshLayou, mItheimaRecyclerView, MyRecyclerViewHolder.class) {
            @Override
            public int getItemResId() {
                //recylerview item资源id
                return R.layout.item_list_news;
            }

            @Override
            public String getApi() {
                //接口
                return url;
            }
            //是否加载更多的数据，根据业务逻辑自行判断，true表示有更多的数据，false表示没有更多的数据，如果不需要监听可以不重写该方法
            @Override
            public boolean isMoreData(BaseLoadMoreRecyclerAdapter.LoadMoreViewHolder holder) {
                System.out.println("isMoreData" + holder);

                return true;
            }
        };
        pullToLoadMoreRecyclerView.requestData();
    }
    public static class MyRecyclerViewHolder extends BaseRecyclerViewHolder<BlogBean.ResultBean.ItemsBean> {
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
        }

        /**
         * 绑定数据的方法，在mData获取数据（mData声明在基类中）
         */
        @Override
        public void onBindRealData() {


            mTvTitle.setText(mData.getTitle());
            mTvDescription.setText(mData.getBody());
            mTvTime.setText(mData.getAuthor()+"  "+ StringUtils.friendly_time3(mData.getPubDate()));
            mTvCommentCount.setText(mData.getCommentCount()+"");
        }



    }
}
