package com.jobanalysis.demo.controller;

import com.jobanalysis.demo.entity.Rank;
import com.jobanalysis.demo.entity.Movie;
import com.jobanalysis.demo.entity.User;
import com.jobanalysis.demo.service.MovieService;
import net.sf.json.JSONArray;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.jobanalysis.demo.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

@Controller

public class rankController {

    @Autowired
    private RankService rankService;
    private Movie movie;

    @Resource
    private MovieService movieService;

    //跳转电影的详情页面
    @RequestMapping("/toRankMovie")
    public String redirectTo() {
        return "rankMovie";
    }
    //插入电影信息
    @RequestMapping(value = "insertRank.action",method = RequestMethod.POST)
    public ModelAndView insertMovie(Rank rank, HttpServletRequest request) {
        String userID = request.getParameter("userID");
        //User user=(User) request.getSession(true).getAttribute("users");
        //int userID = user.getId();
        String movieID = request.getParameter("movieID");
        String score = request.getParameter("score");
        String comment = request.getParameter("comment");



        rank.setUserID(Integer.parseInt(userID));
        rank.setMovieID(Integer.parseInt(movieID));
        rank.setScore(Integer.parseInt(score));
        rank.setComment(comment);


        int status1=rankService.insertTheRank(rank);
        int count=rankService.findCountOfMovie(Integer.parseInt(movieID));
        double totalScore=rankService.findScoreOfMovie(Integer.parseInt(movieID));
        double averageScore=totalScore/count;
        movie= movieService.findMovieByID(Integer.parseInt(movieID));
        movie.setAverageScore(averageScore);
        movie.setLiked(count);
        int status2=movieService.updateTheMovie(movie);


        ModelAndView mav = new ModelAndView();
        if(status1==0 && status2==0)
        {
            System.out.println(rank.toString());
            mav.setViewName("success");
        }
        return mav;
    }

    @RequestMapping(value={"/findCommentOfMovie"})
    @ResponseBody()
    public void findCommentOfMovie( HttpServletRequest request, HttpSession session, HttpServletResponse response) {

        List<Rank> rankList=null;
        int id=Integer.parseInt(request.getParameter("id"));
        rankList=this.rankService.findCommentOfMovie(id);


        if (rankList!= null) {
            for(Rank rank:rankList)
            {
                System.out.println(rank.toString());
            }
        }
        try {
            response.setContentType("text/json; charset=utf-8");
            JSONArray jsonArray = JSONArray.fromObject(rankList);
            System.out.println(String.valueOf(jsonArray));
            response.getWriter().write(String.valueOf(jsonArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value={"/findCommentOfMyself"})
    @ResponseBody()
    public void findCommentOfMyself( HttpServletRequest request, HttpSession session, HttpServletResponse response) {

        List<Rank> rankList=null;
        String userID = request.getParameter("userID");
//        User user=(User) request.getSession(true).getAttribute("users");
//        int userID=user.getId();

        rankList=this.rankService.findCommentOfMyself(Integer.parseInt(userID));


        if (rankList!= null) {
            for(Rank rank:rankList)
            {
                System.out.println(rank.toString());
            }
        }
        try {
            response.setContentType("text/json; charset=utf-8");
            JSONArray jsonArray = JSONArray.fromObject(rankList);
            System.out.println(String.valueOf(jsonArray));
            response.getWriter().write(String.valueOf(jsonArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
