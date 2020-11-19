package com.jobanalysis.demo.service;

import com.jobanalysis.demo.DemoApplicationTests;


public class MoviesServiceTest extends DemoApplicationTests {
    /*

    public Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

    @Autowired
    public MoviesService moviesService;


    @Test
    public void getAllData() {


        List<Movie> movieList = moviesService.getAllData().stream().filter(m -> !m.getMname().isEmpty()).collect(Collectors.toList());
        List<Integer> userIdList = new ArrayList<Integer>();
        for (int i = 1; i < 101; i++) {
            userIdList.add(i);
        }

        for (int i = 1; i < 100001; i++) {
            Random random = new Random();
            int a = random.nextInt(userIdList.size());
            String userId = userIdList.get(a).toString();

            int b = random.nextInt(movieList.size());
            Movie movie = movieList.get(b);

            String mname = movie.getMname().split("/")[0];
            String content = "检索日志：" + userId + " " + mname;
            logger.info(content);
            System.out.println(content);

        }
    }

    @Test
    public void createUserBrowseLog() {


        List<Movie> movieList = moviesService.getAllData().stream().filter(m -> !m.getMname().isEmpty()).collect(Collectors.toList());
        List<Integer> userIdList = new ArrayList<Integer>();
        for (int i = 1; i < 101; i++) {
            userIdList.add(i);
        }

        for (int i = 1; i < 100001; i++) {
            Random random = new Random();
            int a = random.nextInt(userIdList.size());
            int userId = userIdList.get(a);

            int b = random.nextInt(movieList.size());
            Movie movie = movieList.get(b);

            int mid = movie.getMid();
            UserBrowseLog userBrowseLog = new UserBrowseLog();
            userBrowseLog.setMid(mid);
            userBrowseLog.setUid(userId);


            Random random1 = new Random();
            int c = random1.nextInt(29);

            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            Date now = new Date();

            Calendar begin = Calendar.getInstance();
            begin.setTime(now);
            begin.add(Calendar.DAY_OF_MONTH, -c);
            begin.add(Calendar.HOUR_OF_DAY, -c);
            begin.add(Calendar.MINUTE, -c);

            userBrowseLog.setBrowstime(begin.getTime());
            moviesService.CreateUserBrowseLog(userBrowseLog);

            System.out.println("完成插入，第" + i + "个");

        }
    }

    @Test
    public void insertMComment() {

        List<Movie> movieList = moviesService.getAllData().stream().filter(m -> !m.getMname().isEmpty()).collect(Collectors.toList());
        List<Integer> userIdList = new ArrayList<Integer>();
        for (int i = 1; i < 101; i++) {
            userIdList.add(i);
        }

        for (int i = 1; i < 100001; i++) {
            Random random = new Random();
            int a = random.nextInt(userIdList.size());
            int userId = userIdList.get(a);

            int b = random.nextInt(movieList.size());
            Movie movie = movieList.get(b);

            int mid = movie.getMid();
            MComment mComment = new MComment();
            mComment.setUid(userId);
            mComment.setMid(mid);
            String comment="";
            mComment.setCcontent(comment);

            Random random1 = new Random();
            int c = random1.nextInt(29);
            Date now = new Date();
            Calendar begin = Calendar.getInstance();
            begin.setTime(now);
            begin.add(Calendar.DAY_OF_MONTH, -c);
            begin.add(Calendar.HOUR_OF_DAY, -c);
            begin.add(Calendar.MINUTE, -c);

            mComment.setCtime(begin.getTime());

            Random random2 = new Random();
            int e = random2.nextInt(6);

            mComment.setCscore(e);


            moviesService.insertMComment(mComment);

            System.out.println("完成插入，第" + i + "个");

        }

    }*/
}