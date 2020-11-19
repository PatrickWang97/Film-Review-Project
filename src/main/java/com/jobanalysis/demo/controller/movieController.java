package com.jobanalysis.demo.controller;

import com.jobanalysis.demo.entity.Movie;
import com.jobanalysis.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import net.sf.json.JSONObject;
import net.sf.json.JSONArray;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class movieController {
    @Autowired
    private MovieService movieService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }


    /************************************************查询电影开始********************************************************/
    //根据条件来查询电影

    @RequestMapping(value={"/findMovieByID"})
    @ResponseBody()
    public Movie findMovieByID( HttpServletRequest request, HttpSession session) {
        String id = request.getParameter("id");
        Movie movie=this.movieService.findMovieByID(Integer.parseInt(id));

        if (movie!= null) {

            System.out.println(movie.toString());
        }
        return movie;
    }


    @RequestMapping(value={"/findMovieByLanguage"})
    @ResponseBody()
    public void findMovieByLanguage( HttpServletRequest request, HttpSession session, HttpServletResponse response) {
        String language=request.getParameter("language");
        List<Movie> movieList=this.movieService.findMovieByLanguage(language);

        if (movieList!= null) {
            for(Movie movie:movieList)
            {
                System.out.println(movie.toString());
            }
        }

        try {
            response.setContentType("text/json; charset=utf-8");
            JSONArray jsonArray = JSONArray.fromObject(movieList);
            response.getWriter().write(String.valueOf(jsonArray));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @RequestMapping(value={"/findMovieByType"})
    @ResponseBody()
    public void findMovieByType(HttpServletRequest request, HttpSession session, HttpServletResponse response) {
        String type=request.getParameter("type");
        List<Movie> movieList=this.movieService.findMovieByType(type);
        if (movieList!= null) {
            for(Movie movie:movieList)
            {
                System.out.println(movie.toString());
            }
        }

        try {
            response.setContentType("text/json; charset=utf-8");
            JSONArray jsonArray = JSONArray.fromObject(movieList);
            response.getWriter().write(String.valueOf(jsonArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value={"/findMovieByName"})
    @ResponseBody()
    public void findMovieByName( HttpServletRequest request, HttpSession session,HttpServletResponse response) {
        String name=request.getParameter("name");
        List<Movie> movieList=this.movieService.findMovieByName(name);
        if (movieList!= null) {
            for(Movie movie:movieList)
            {
                System.out.println(movie.toString());
            }
        }
        try {
            response.setContentType("text/json; charset=utf-8");
            JSONArray jsonArray = JSONArray.fromObject(movieList);
            response.getWriter().write(String.valueOf(jsonArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value={"/findMovieByActor"})
    @ResponseBody()
    public void findMovieByActor( HttpServletRequest request, HttpSession session,HttpServletResponse response) {
        String actor=request.getParameter("actor");
        List<Movie> movieList=this.movieService.findMovieByActor(actor);
        if (movieList!= null) {
            for(Movie movie:movieList)
            {
                System.out.println(movie.toString());
            }
        }
        try {
            response.setContentType("text/json; charset=utf-8");
            JSONArray jsonArray = JSONArray.fromObject(movieList);
            response.getWriter().write(String.valueOf(jsonArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //主页面电影展示（默认为评分由高到低）
    @RequestMapping(value={"/pageOfMovieByRankDESC"})
    @ResponseBody()
    public void pageOfMovieByRankDESC( HttpServletRequest request, HttpSession session,HttpServletResponse response) {
        List<Movie> movieList=null;
        movieList=this.movieService.pageOfMovieByRankDESC();
        if (movieList!= null) {
            for(Movie movie:movieList)
            {
                System.out.println(movie.toString());
            }
        }
        try {
            response.setContentType("text/json; charset=utf-8");
            JSONArray jsonArray = JSONArray.fromObject(movieList);
            System.out.println(String.valueOf(jsonArray));
            response.getWriter().write(String.valueOf(jsonArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value={"/pageOfMovieByRankTop"})
    @ResponseBody()
    public void pageOfMovieByRankTop( HttpServletRequest request, HttpSession session,HttpServletResponse response) {
        List<Movie> movieList=null;
        movieList=this.movieService.pageOfMovieByRankTop();
        if (movieList!= null) {
            for(Movie movie:movieList)
            {
                System.out.println(movie.toString());
            }
        }
        try {
            response.setContentType("text/json; charset=utf-8");
            JSONArray jsonArray = JSONArray.fromObject(movieList);
            response.getWriter().write(String.valueOf(jsonArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //主页面电影展示（默认为评分由低到高）
    @RequestMapping(value={"/pageOfMovieByRankASC"})
    public void pageOfMovieByRankASC( HttpServletRequest request, HttpSession session,HttpServletResponse response) {
        List<Movie> movieList=null;
        movieList=this.movieService.pageOfMovieByRankASC();
        if (movieList!= null) {
            for(Movie movie:movieList)
            {
                System.out.println(movie.toString());
            }
        }
        try {
            response.setContentType("text/json; charset=utf-8");
            JSONArray jsonArray = JSONArray.fromObject(movieList);
            response.getWriter().write(String.valueOf(jsonArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //主页面电影展示(时间由近到远)
    @RequestMapping(value={"/pageOfMovieByTimeDESC"})
    @ResponseBody()
    public void pageOfMovieByTime( HttpServletRequest request, HttpSession session,HttpServletResponse response) {
        List<Movie> movieList=null;
        movieList=this.movieService.pageOfMovieByTimeDESC();
        if (movieList!= null) {
            for(Movie movie:movieList)
            {
                System.out.println(movie.toString());
            }
        }
        try {
            response.setContentType("text/json; charset=utf-8");
            JSONArray jsonArray = JSONArray.fromObject(movieList);
            response.getWriter().write(String.valueOf(jsonArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //电影展示(时间由近到远)
    @RequestMapping(value={"/pageOfMovieByTimeASC"})
    @ResponseBody()
    public void pageOfMovieByTimeASC( HttpServletRequest request, HttpSession session,HttpServletResponse response) {
        List<Movie> movieList=null;
        movieList=this.movieService.pageOfMovieByTimeASC();
        if (movieList!= null) {
            for(Movie movie:movieList)
            {
                System.out.println(movie.toString());
            }
        }
        try {
            response.setContentType("text/json; charset=utf-8");
            JSONArray jsonArray = JSONArray.fromObject(movieList);
            response.getWriter().write(String.valueOf(jsonArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /************************************************查询电影结束********************************************************/




    /************************************************新增电影开始********************************************************/
    //跳转插入电影的页面
    @RequestMapping("/toSetMovie")
    public String redirectTo() {
        return "setMovie";
    }
    //插入电影信息
    @RequestMapping(value = "insertMovie.action",method = RequestMethod.POST)
    public ModelAndView insertMovie(Movie movie,HttpServletRequest request) throws ParseException {
        String name = request.getParameter("name");
        String type = request.getParameter("type");
        String language = request.getParameter("language");
        String actors = request.getParameter("actors");
        String releaseDate=request.getParameter("releaseDate");
        String cover = request.getParameter("cover");
        String averageScore = request.getParameter("averageScore");
        String liked = request.getParameter("liked");


        movie.setName(name);
        movie.setType(type);
        movie.setLanguage(language);
        movie.setActors(actors);
        movie.setReleaseDate(releaseDate);
        movie.setCover(cover);
        movie.setAverageScore(Double.valueOf(averageScore));
        movie.setLiked(Integer.parseInt(liked));

        int status=movieService.insertTheMovie(movie);
        ModelAndView mav = new ModelAndView();
        if(status==0)
        {
            System.out.println(movie.toString());
            mav.setViewName("success");
        }
        return mav;
    }
    /************************************************新增电影结束********************************************************/





    /************************************************电影更新开始********************************************************/
    //跳转更新电影页面
    @RequestMapping("/toUpdateMovie")
    public String toUpdateMovie(HttpServletRequest request,Model model) {
        return "updateMovie";
    }

    //更新：更新电影内容
    @RequestMapping(value = "updateMovie.action",method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView updateMovie(Movie movie) {


        int status=movieService.updateTheMovie(movie);
        ModelAndView mav = new ModelAndView();
        if(status==0)
        {
            System.out.println(movie.toString());
            mav.setViewName("success");
        }
        return mav;
    }
    /************************************************电影更新结束********************************************************/
}
