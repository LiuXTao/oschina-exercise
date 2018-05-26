package com.example.a14161.oschina.bean;


import org.itheima.recycler.bean.BasePageBean;

import java.util.List;

/**
 * Created by 14161 on 2018/3/11.
 */

public class NewsBean extends BasePageBean<NewsBean.ResultBean.ItemsBean> {


    /**
     * code : 1
     * message : success
     * result : {"items":[{"author":"周其","body":"然而，在月尾，让我们花一点时间赞美总结一下二月份的十大新开发工具吧。","commentCount":0,"href":"https://www.oschina.net/translate/dev-tools-roundup-3","id":10004221,"pubDate":"2018-03-11 08:13:16","recommend":true,"title":"协作翻译 | 二月份十大新开发工具","type":4,"viewCount":862},{"author":"周其","body":"近日 Keras 作者 François Chollet 近日在 Twitter 上公布了一项他所做的调查，统计了在过去三个月中 ArXiv 上（截至 3 月 7 日）被提及（mention...","commentCount":0,"href":"https://www.oschina.net/news/94086/tensorflow-at-the-frist","id":94086,"pubDate":"2018-03-11 08:11:26","recommend":true,"title":"ArXiv 中最受欢迎的开源框架，TensorFlow 排名第一","type":6,"viewCount":487},{"author":"周其","body":"car-eye 设备子系统提供了一整套硬件设计、固件程序、系统软件、行车记录仪等功能模块的解决方案。","commentCount":0,"href":"https://www.oschina.net/p/car-eye-device","id":46886,"pubDate":"2018-03-11 08:11:17","recommend":true,"title":"Car-eye-device \u2014 多路行车记录仪功能模块的解决方案","type":1,"viewCount":243},{"author":"周其","body":"基于 Swoole 的内网穿透，支持本地微信开发、Web开发，让外网能够访问到！山寨简易版 Ngrok！","commentCount":0,"href":"https://gitee.com/yurunsoft/YurunProxy","id":94084,"pubDate":"2018-03-11 08:11:05","recommend":true,"title":"码云推荐 | 基于 Swoole 的内网穿透，支持本地微信开发","type":0,"viewCount":2},{"author":"周其","body":"我时不时会发现一种编程语言的不同用法它有时候会改变我对编程的看法啊。这篇文章中，我想分享一下让我惊讶的发现。这不是类似于高呼\u201c函数式编程会...","commentCount":0,"href":"https://www.oschina.net/news/94083/six-programming-paradigms-that-will-change-how","id":94083,"pubDate":"2018-03-11 08:09:56","recommend":true,"title":"6 个新奇的编程方式，改变你对编码的认知","type":6,"viewCount":727},{"author":"周其","body":"最近在学习Spring boot，写了个读写分离。并未照搬网文，而是独立思考后的成果，写完以后发现从零开始写读写分离并不难！","commentCount":7,"href":"https://my.oschina.net/floor/blog/1632565","id":1632565,"pubDate":"2018-03-11 08:09:39","recommend":false,"title":"每日一博 | 从零开始写简易读写分离并不复杂","type":3,"viewCount":873},{"author":"周其","body":"毫无疑问，Java 是当今世界上最重要的编程语言之一。js 框架给程序员提供了 一个可以构建程序的坚实基础。它包括定义的类和功能，用于硬件设备管理...","commentCount":12,"href":"https://www.oschina.net/news/94081/java-web-frameworks-compare","id":94081,"pubDate":"2018-03-11 08:06:51","recommend":false,"title":"五大 JAVA Web 框架的优缺点对比，Spring MVC 领先","type":6,"viewCount":245},{"author":"周其","body":"根据以开发人员为中心的分析公司RedMonk的2018年第一季度排名，JavaScript仍然是最受欢迎的编程语言，但微软提供的两款产品正在稳步增长。 RedMon...","commentCount":2,"href":"https://www.oschina.net/news/94080/javascript-rules-but-microsoft-programming-on-the-rise","id":94080,"pubDate":"2018-03-11 08:06:11","recommend":false,"title":"JavaScript 仍然位居榜首，TypeScript 也不甘落后","type":6,"viewCount":569},{"author":"周其","body":"钱不知所终，都去哪儿了，买吃的了呗！","commentCount":10,"href":"https://my.oschina.net/xxiaobian/blog/1632867","id":1632867,"pubDate":"2018-03-11 08:05:31","recommend":false,"title":"OSChina 周日乱弹 \u2014\u2014 爱丽丝爱吃京酱肉丝","type":3,"viewCount":535},{"author":"周其","body":"Google 在关于加速移动页面项目的公告中，透露了未来推出这些 Web 标准的计划。借由 AMP 的经验和技术，开发可以让非 AMP 网页内容即时加载的 Web ...","commentCount":0,"href":"https://www.oschina.net/news/94078/google-pushes-for-amp-based-technology-as-standard","id":94078,"pubDate":"2018-03-11 08:05:04","recommend":false,"title":"Google 意图让 AMP 网页快速载入技术成为标准","type":6,"viewCount":314},{"author":"达尔文","body":"安全电子邮件服务商 ProtonMail 刚刚宣布了 OpenPGPjs 的 3.0 版本。作为一款开源 OpenPGP 库，本次更新为数以百万计依赖于 OpenPGPjs 的用户带来了...","commentCount":1,"href":"https://www.oschina.net/news/94077/openpgpjs-3-0","id":94077,"pubDate":"2018-03-11 07:54:41","recommend":false,"title":"OpenPGP.js 3.0 发布，开源 OpenPGP 库","type":6,"viewCount":255},{"author":"达尔文","body":"Ionic v0.1.4-5 发布了。Ionic Framework 是一个高级的 HTML5 移动端应用框架，也是一个很漂亮的使用 HTML5 开发混合移动应用的前端框架。 该版本暂...","commentCount":1,"href":"https://www.oschina.net/news/94076/ionic-0-1-4-5","id":94076,"pubDate":"2018-03-11 07:47:30","recommend":false,"title":"Ionic v0.1.4-5 发布，HTML5 移动应用框架","type":6,"viewCount":338},{"author":"达尔文","body":"7-Zip 18.03 beta 发布了。7-Zip是一个开放源码的数据压缩程序，主要用在Microsoft Windows操作系统，Unix-like的操作系统如Linux与FreeBSD下面有7...","commentCount":2,"href":"https://www.oschina.net/news/94075/7-zip-18-03-beta","id":94075,"pubDate":"2018-03-11 07:44:09","recommend":false,"title":"7-Zip 18.03 beta 发布，数据压缩程序","type":6,"viewCount":271},{"author":"达尔文","body":"Next.js 5.0.1-canary.14 发布，Next.js 是一个用于在服务端渲染 React 应用程序的简单框架。 主要更新内容如下： 补丁 FIX deploy with-firebase...","commentCount":0,"href":"https://www.oschina.net/news/94074/next-5-0-1-canary-14","id":94074,"pubDate":"2018-03-11 07:37:13","recommend":false,"title":"Next.js 5.0.1-canary.14，React 应用的后端渲染框架","type":6,"viewCount":131},{"author":"达尔文","body":"Debian 9.4 发布了。Debian 项目很高兴地宣布其稳定发行版 Debian 9（代号延伸）的第四次更新。 本新闻稿主要增加了对安全问题的更正，并对严重问题...","commentCount":2,"href":"https://www.oschina.net/news/94073/debian-9-4","id":94073,"pubDate":"2018-03-11 07:34:24","recommend":false,"title":"Debian 9.4 发布，修复安全问题","type":6,"viewCount":350},{"author":"达尔文","body":"doctest 1.2.8 发布了，doctest 是一个新的 C++ 测试框架。与其他功能丰富的替代方案相比，编译时（by orders of magnitude）和运行时是最快的。它...","commentCount":0,"href":"https://www.oschina.net/news/94072/doctest-1-2-8-released","id":94072,"pubDate":"2018-03-11 07:28:03","recommend":false,"title":"doctest 1.2.8 发布，C++ 测试框架","type":6,"viewCount":121},{"author":"达尔文","body":"Sequelize 5.0.0 和 5.0.1 发布了。Sequelize.js 提供对 MySQL，MariaDB，SQLite 和 PostgreSQL 数据库的简单访问，通过映射数据库条目到对象，...","commentCount":1,"href":"https://www.oschina.net/news/94071/sequelize-5-0-0-and-5-0-1","id":94071,"pubDate":"2018-03-11 07:26:02","recommend":false,"title":"Sequelize 5.0.0 和 5.0.1 发布，Node.js 的 ORM","type":6,"viewCount":111},{"author":"淡漠悠然","body":"RabbitMQ 3.7.4 发布了。RabbitMQ 是由 LShift 提供的一个 Advanced Message Queuing Protocol (AMQP) 的开源实现，由以高性能、健壮以及可伸缩性出...","commentCount":0,"href":"https://www.oschina.net/news/94070/rabbitmq-3-7-4","id":94070,"pubDate":"2018-03-11 00:12:35","recommend":false,"title":"RabbitMQ 3.7.4 发布，常规更新","type":6,"viewCount":175},{"author":"淡漠悠然","body":"Maven 3.5.3 已发布， Apache Maven 是一个项目管理和构建工具。基于项目对象模型（POM）的概念， Maven 可以从中心位置管理项目的构建、报告和文...","commentCount":0,"href":"https://www.oschina.net/news/94068/maven-3-5-3","id":94068,"pubDate":"2018-03-10 23:47:49","recommend":false,"title":"Maven 3.5.3 发布，项目管理和构建工具","type":6,"viewCount":308},{"author":"淡漠悠然","body":"Jodd 4.2.0 已发布，Jodd 是一个开源的 Java 工具集， 包含一些实用的工具类和小型框架。简单，却很强大！该版本新增了一些实用的插件，更新内容如...","commentCount":1,"href":"https://www.oschina.net/news/94067/jodd-4-2-0-released","id":94067,"pubDate":"2018-03-10 22:47:59","recommend":false,"title":"Java 常用工具包 Jodd 4.2.0 发布","type":6,"viewCount":215}],"nextPageToken":"DBA816934CD0AA59","prevPageToken":"0997C855C600E421","requestCount":20,"responseCount":20,"totalResults":86470}
     * time : 2018-03-11 13:19:14
     */

    private int code;
    private String message;
    /**
     * items : [{"author":"周其","body":"然而，在月尾，让我们花一点时间赞美总结一下二月份的十大新开发工具吧。","commentCount":0,"href":"https://www.oschina.net/translate/dev-tools-roundup-3","id":10004221,"pubDate":"2018-03-11 08:13:16","recommend":true,"title":"协作翻译 | 二月份十大新开发工具","type":4,"viewCount":862},{"author":"周其","body":"近日 Keras 作者 François Chollet 近日在 Twitter 上公布了一项他所做的调查，统计了在过去三个月中 ArXiv 上（截至 3 月 7 日）被提及（mention...","commentCount":0,"href":"https://www.oschina.net/news/94086/tensorflow-at-the-frist","id":94086,"pubDate":"2018-03-11 08:11:26","recommend":true,"title":"ArXiv 中最受欢迎的开源框架，TensorFlow 排名第一","type":6,"viewCount":487},{"author":"周其","body":"car-eye 设备子系统提供了一整套硬件设计、固件程序、系统软件、行车记录仪等功能模块的解决方案。","commentCount":0,"href":"https://www.oschina.net/p/car-eye-device","id":46886,"pubDate":"2018-03-11 08:11:17","recommend":true,"title":"Car-eye-device \u2014 多路行车记录仪功能模块的解决方案","type":1,"viewCount":243},{"author":"周其","body":"基于 Swoole 的内网穿透，支持本地微信开发、Web开发，让外网能够访问到！山寨简易版 Ngrok！","commentCount":0,"href":"https://gitee.com/yurunsoft/YurunProxy","id":94084,"pubDate":"2018-03-11 08:11:05","recommend":true,"title":"码云推荐 | 基于 Swoole 的内网穿透，支持本地微信开发","type":0,"viewCount":2},{"author":"周其","body":"我时不时会发现一种编程语言的不同用法它有时候会改变我对编程的看法啊。这篇文章中，我想分享一下让我惊讶的发现。这不是类似于高呼\u201c函数式编程会...","commentCount":0,"href":"https://www.oschina.net/news/94083/six-programming-paradigms-that-will-change-how","id":94083,"pubDate":"2018-03-11 08:09:56","recommend":true,"title":"6 个新奇的编程方式，改变你对编码的认知","type":6,"viewCount":727},{"author":"周其","body":"最近在学习Spring boot，写了个读写分离。并未照搬网文，而是独立思考后的成果，写完以后发现从零开始写读写分离并不难！","commentCount":7,"href":"https://my.oschina.net/floor/blog/1632565","id":1632565,"pubDate":"2018-03-11 08:09:39","recommend":false,"title":"每日一博 | 从零开始写简易读写分离并不复杂","type":3,"viewCount":873},{"author":"周其","body":"毫无疑问，Java 是当今世界上最重要的编程语言之一。js 框架给程序员提供了 一个可以构建程序的坚实基础。它包括定义的类和功能，用于硬件设备管理...","commentCount":12,"href":"https://www.oschina.net/news/94081/java-web-frameworks-compare","id":94081,"pubDate":"2018-03-11 08:06:51","recommend":false,"title":"五大 JAVA Web 框架的优缺点对比，Spring MVC 领先","type":6,"viewCount":245},{"author":"周其","body":"根据以开发人员为中心的分析公司RedMonk的2018年第一季度排名，JavaScript仍然是最受欢迎的编程语言，但微软提供的两款产品正在稳步增长。 RedMon...","commentCount":2,"href":"https://www.oschina.net/news/94080/javascript-rules-but-microsoft-programming-on-the-rise","id":94080,"pubDate":"2018-03-11 08:06:11","recommend":false,"title":"JavaScript 仍然位居榜首，TypeScript 也不甘落后","type":6,"viewCount":569},{"author":"周其","body":"钱不知所终，都去哪儿了，买吃的了呗！","commentCount":10,"href":"https://my.oschina.net/xxiaobian/blog/1632867","id":1632867,"pubDate":"2018-03-11 08:05:31","recommend":false,"title":"OSChina 周日乱弹 \u2014\u2014 爱丽丝爱吃京酱肉丝","type":3,"viewCount":535},{"author":"周其","body":"Google 在关于加速移动页面项目的公告中，透露了未来推出这些 Web 标准的计划。借由 AMP 的经验和技术，开发可以让非 AMP 网页内容即时加载的 Web ...","commentCount":0,"href":"https://www.oschina.net/news/94078/google-pushes-for-amp-based-technology-as-standard","id":94078,"pubDate":"2018-03-11 08:05:04","recommend":false,"title":"Google 意图让 AMP 网页快速载入技术成为标准","type":6,"viewCount":314},{"author":"达尔文","body":"安全电子邮件服务商 ProtonMail 刚刚宣布了 OpenPGPjs 的 3.0 版本。作为一款开源 OpenPGP 库，本次更新为数以百万计依赖于 OpenPGPjs 的用户带来了...","commentCount":1,"href":"https://www.oschina.net/news/94077/openpgpjs-3-0","id":94077,"pubDate":"2018-03-11 07:54:41","recommend":false,"title":"OpenPGP.js 3.0 发布，开源 OpenPGP 库","type":6,"viewCount":255},{"author":"达尔文","body":"Ionic v0.1.4-5 发布了。Ionic Framework 是一个高级的 HTML5 移动端应用框架，也是一个很漂亮的使用 HTML5 开发混合移动应用的前端框架。 该版本暂...","commentCount":1,"href":"https://www.oschina.net/news/94076/ionic-0-1-4-5","id":94076,"pubDate":"2018-03-11 07:47:30","recommend":false,"title":"Ionic v0.1.4-5 发布，HTML5 移动应用框架","type":6,"viewCount":338},{"author":"达尔文","body":"7-Zip 18.03 beta 发布了。7-Zip是一个开放源码的数据压缩程序，主要用在Microsoft Windows操作系统，Unix-like的操作系统如Linux与FreeBSD下面有7...","commentCount":2,"href":"https://www.oschina.net/news/94075/7-zip-18-03-beta","id":94075,"pubDate":"2018-03-11 07:44:09","recommend":false,"title":"7-Zip 18.03 beta 发布，数据压缩程序","type":6,"viewCount":271},{"author":"达尔文","body":"Next.js 5.0.1-canary.14 发布，Next.js 是一个用于在服务端渲染 React 应用程序的简单框架。 主要更新内容如下： 补丁 FIX deploy with-firebase...","commentCount":0,"href":"https://www.oschina.net/news/94074/next-5-0-1-canary-14","id":94074,"pubDate":"2018-03-11 07:37:13","recommend":false,"title":"Next.js 5.0.1-canary.14，React 应用的后端渲染框架","type":6,"viewCount":131},{"author":"达尔文","body":"Debian 9.4 发布了。Debian 项目很高兴地宣布其稳定发行版 Debian 9（代号延伸）的第四次更新。 本新闻稿主要增加了对安全问题的更正，并对严重问题...","commentCount":2,"href":"https://www.oschina.net/news/94073/debian-9-4","id":94073,"pubDate":"2018-03-11 07:34:24","recommend":false,"title":"Debian 9.4 发布，修复安全问题","type":6,"viewCount":350},{"author":"达尔文","body":"doctest 1.2.8 发布了，doctest 是一个新的 C++ 测试框架。与其他功能丰富的替代方案相比，编译时（by orders of magnitude）和运行时是最快的。它...","commentCount":0,"href":"https://www.oschina.net/news/94072/doctest-1-2-8-released","id":94072,"pubDate":"2018-03-11 07:28:03","recommend":false,"title":"doctest 1.2.8 发布，C++ 测试框架","type":6,"viewCount":121},{"author":"达尔文","body":"Sequelize 5.0.0 和 5.0.1 发布了。Sequelize.js 提供对 MySQL，MariaDB，SQLite 和 PostgreSQL 数据库的简单访问，通过映射数据库条目到对象，...","commentCount":1,"href":"https://www.oschina.net/news/94071/sequelize-5-0-0-and-5-0-1","id":94071,"pubDate":"2018-03-11 07:26:02","recommend":false,"title":"Sequelize 5.0.0 和 5.0.1 发布，Node.js 的 ORM","type":6,"viewCount":111},{"author":"淡漠悠然","body":"RabbitMQ 3.7.4 发布了。RabbitMQ 是由 LShift 提供的一个 Advanced Message Queuing Protocol (AMQP) 的开源实现，由以高性能、健壮以及可伸缩性出...","commentCount":0,"href":"https://www.oschina.net/news/94070/rabbitmq-3-7-4","id":94070,"pubDate":"2018-03-11 00:12:35","recommend":false,"title":"RabbitMQ 3.7.4 发布，常规更新","type":6,"viewCount":175},{"author":"淡漠悠然","body":"Maven 3.5.3 已发布， Apache Maven 是一个项目管理和构建工具。基于项目对象模型（POM）的概念， Maven 可以从中心位置管理项目的构建、报告和文...","commentCount":0,"href":"https://www.oschina.net/news/94068/maven-3-5-3","id":94068,"pubDate":"2018-03-10 23:47:49","recommend":false,"title":"Maven 3.5.3 发布，项目管理和构建工具","type":6,"viewCount":308},{"author":"淡漠悠然","body":"Jodd 4.2.0 已发布，Jodd 是一个开源的 Java 工具集， 包含一些实用的工具类和小型框架。简单，却很强大！该版本新增了一些实用的插件，更新内容如...","commentCount":1,"href":"https://www.oschina.net/news/94067/jodd-4-2-0-released","id":94067,"pubDate":"2018-03-10 22:47:59","recommend":false,"title":"Java 常用工具包 Jodd 4.2.0 发布","type":6,"viewCount":215}]
     * nextPageToken : DBA816934CD0AA59
     * prevPageToken : 0997C855C600E421
     * requestCount : 20
     * responseCount : 20
     * totalResults : 86470
     */

    private ResultBean result;
    private String time;

    @Override
    public List<ResultBean.ItemsBean> getItemDatas() {
        return result.items;
    }

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

    public static class ResultBean {
        private String nextPageToken;
        private String prevPageToken;
        private int requestCount;
        private int responseCount;
        private int totalResults;
        /**
         * author : 周其
         * body : 然而，在月尾，让我们花一点时间赞美总结一下二月份的十大新开发工具吧。
         * commentCount : 0
         * href : https://www.oschina.net/translate/dev-tools-roundup-3
         * id : 10004221
         * pubDate : 2018-03-11 08:13:16
         * recommend : true
         * title : 协作翻译 | 二月份十大新开发工具
         * type : 4
         * viewCount : 862
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
            private String author;
            private String body;
            private int commentCount;
            private String href;
            private int id;
            private String pubDate;
            private boolean recommend;
            private String title;
            private int type;
            private int viewCount;

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public String getBody() {
                return body;
            }

            public void setBody(String body) {
                this.body = body;
            }

            public int getCommentCount() {
                return commentCount;
            }

            public void setCommentCount(int commentCount) {
                this.commentCount = commentCount;
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

            public String getPubDate() {
                return pubDate;
            }

            public void setPubDate(String pubDate) {
                this.pubDate = pubDate;
            }

            public boolean isRecommend() {
                return recommend;
            }

            public void setRecommend(boolean recommend) {
                this.recommend = recommend;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getViewCount() {
                return viewCount;
            }

            public void setViewCount(int viewCount) {
                this.viewCount = viewCount;
            }
        }
    }
}
