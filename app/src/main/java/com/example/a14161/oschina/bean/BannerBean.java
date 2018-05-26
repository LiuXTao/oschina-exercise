package com.example.a14161.oschina.bean;

import org.itheima.recycler.bean.BasePageBean;

import java.util.List;

/**
 * Created by 14161 on 2018/3/11.
 */

public class BannerBean extends BasePageBean<BannerBean.ResultBean.ItemsBean>{


    /**
     * code : 1
     * message : success
     * notice : {"newsCount":20}
     * result : {"items":[{"detail":"","href":"http://t.cn/REuXqZj","id":0,"img":"https://static.oschina.net/uploads/cooperation/75410/google-beta-natural-language-api_9182cf80-b850-4a45-bf8e-92c1770e92ee.jpg","name":"创意 Pages 简历优秀作品","pubDate":"2018-03-09 10:45:30","type":0},{"detail":"","href":"https://my.oschina.net/gitosc/blog/1627438","id":1627438,"img":"https://static.oschina.net/uploads/cooperation/75323/ubuntu-forum-black-sql_0e4a5329-016a-4e5b-a40d-a05fafdd0413.jpg","name":"五花八门的验证码程序","pubDate":"2018-03-09 10:36:41","type":3},{"detail":"","href":"https://my.oschina.net/editorial-story/blog/1622423","id":1622423,"img":"https://static.oschina.net/uploads/cooperation/78083/chrome55-save-at-least-35-percent-memory_b31735c4-9c2a-4859-98eb-ebd813cc7bfc.png","name":"2017 年 Google 开源了这些超赞的项目","pubDate":"2018-02-26 11:18:32","type":3},{"detail":"","href":"https://www.oschina.net/question/2720166_2274811","id":2274811,"img":"https://static.oschina.net/uploads/cooperation/77929/top-income-programming-languages-2016_819cb3e8-2a12-4ab6-9432-284f96fdfc2e.jpg","name":"聊聊 Java 的现状和未来","pubDate":"2018-03-07 00:41:59","type":2},{"detail":"","href":"https://my.oschina.net/llzhang/blog/1622955","id":1622955,"img":"https://static.oschina.net/uploads/cooperation/78455/intellij-idea-2016-3-public-preview_092b8b64-c664-4892-9376-20397c93c5a1.jpg","name":"区块链(Blockchain)简单介绍","pubDate":"2018-03-09 10:31:31","type":3}],"nextPageToken":"61AF0C190D6BD629","prevPageToken":"3EA621243546C8A5","requestCount":5,"responseCount":5,"totalResults":5}
     * time : 2018-03-11 16:47:56
     */

    private int code;
    private String message;
    /**
     * newsCount : 20
     */

    private NoticeBean notice;
    /**
     * items : [{"detail":"","href":"http://t.cn/REuXqZj","id":0,"img":"https://static.oschina.net/uploads/cooperation/75410/google-beta-natural-language-api_9182cf80-b850-4a45-bf8e-92c1770e92ee.jpg","name":"创意 Pages 简历优秀作品","pubDate":"2018-03-09 10:45:30","type":0},{"detail":"","href":"https://my.oschina.net/gitosc/blog/1627438","id":1627438,"img":"https://static.oschina.net/uploads/cooperation/75323/ubuntu-forum-black-sql_0e4a5329-016a-4e5b-a40d-a05fafdd0413.jpg","name":"五花八门的验证码程序","pubDate":"2018-03-09 10:36:41","type":3},{"detail":"","href":"https://my.oschina.net/editorial-story/blog/1622423","id":1622423,"img":"https://static.oschina.net/uploads/cooperation/78083/chrome55-save-at-least-35-percent-memory_b31735c4-9c2a-4859-98eb-ebd813cc7bfc.png","name":"2017 年 Google 开源了这些超赞的项目","pubDate":"2018-02-26 11:18:32","type":3},{"detail":"","href":"https://www.oschina.net/question/2720166_2274811","id":2274811,"img":"https://static.oschina.net/uploads/cooperation/77929/top-income-programming-languages-2016_819cb3e8-2a12-4ab6-9432-284f96fdfc2e.jpg","name":"聊聊 Java 的现状和未来","pubDate":"2018-03-07 00:41:59","type":2},{"detail":"","href":"https://my.oschina.net/llzhang/blog/1622955","id":1622955,"img":"https://static.oschina.net/uploads/cooperation/78455/intellij-idea-2016-3-public-preview_092b8b64-c664-4892-9376-20397c93c5a1.jpg","name":"区块链(Blockchain)简单介绍","pubDate":"2018-03-09 10:31:31","type":3}]
     * nextPageToken : 61AF0C190D6BD629
     * prevPageToken : 3EA621243546C8A5
     * requestCount : 5
     * responseCount : 5
     * totalResults : 5
     */

    private ResultBean result;
    private String time;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public NoticeBean getNotice() {
        return notice;
    }

    public void setNotice(NoticeBean notice) {
        this.notice = notice;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public List getItemDatas() {
        return result.items;
    }

    public static class NoticeBean {
        private int newsCount;

        public int getNewsCount() {
            return newsCount;
        }

        public void setNewsCount(int newsCount) {
            this.newsCount = newsCount;
        }
    }

    public static class ResultBean {
        private String nextPageToken;
        private String prevPageToken;
        private int requestCount;
        private int responseCount;
        private int totalResults;
        /**
         * detail :
         * href : http://t.cn/REuXqZj
         * id : 0
         * img : https://static.oschina.net/uploads/cooperation/75410/google-beta-natural-language-api_9182cf80-b850-4a45-bf8e-92c1770e92ee.jpg
         * name : 创意 Pages 简历优秀作品
         * pubDate : 2018-03-09 10:45:30
         * type : 0
         */

        private List<ItemsBean> items;

        public String getNextPageToken() {
            return nextPageToken;
        }

        public void setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
        }

        public String getPrevPageToken() {
            return prevPageToken;
        }

        public void setPrevPageToken(String prevPageToken) {
            this.prevPageToken = prevPageToken;
        }

        public int getRequestCount() {
            return requestCount;
        }

        public void setRequestCount(int requestCount) {
            this.requestCount = requestCount;
        }

        public int getResponseCount() {
            return responseCount;
        }

        public void setResponseCount(int responseCount) {
            this.responseCount = responseCount;
        }

        public int getTotalResults() {
            return totalResults;
        }

        public void setTotalResults(int totalResults) {
            this.totalResults = totalResults;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            private String detail;
            private String href;
            private int id;
            private String img;
            private String name;
            private String pubDate;
            private int type;

            public String getDetail() {
                return detail;
            }

            public void setDetail(String detail) {
                this.detail = detail;
            }

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPubDate() {
                return pubDate;
            }

            public void setPubDate(String pubDate) {
                this.pubDate = pubDate;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }
    }
}
