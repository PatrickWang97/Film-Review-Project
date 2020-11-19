package com.jobanalysis.demo.service;

import com.jobanalysis.demo.mapper.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.jobanalysis.demo.entity.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieMapper movieMapper;
    private Movie movie;
    private List<Movie> movieList;
//    首先做根据某个id来查询某部电影

    public Movie findMovieByID(int id)
    {
        movie= movieMapper.selectMovieDetail(id);
        return movie;
    }

    public List<Movie> findMovieByType(String type)
    {
        movieList= (List<Movie>) movieMapper.selectMovieByType(type);
        return movieList;
    }

    public List<Movie> findMovieByLanguage(String language)
    {
        movieList=(List<Movie>) movieMapper.selectMovieByLanguage(language);
        return movieList;
    }

    public List<Movie> findMovieByName(String name)
    {
        movieList=(List<Movie>) movieMapper.selectMovieByName(name);
        return movieList;
    }

    public List<Movie> findMovieByActor(String actor)
    {
        movieList=(List<Movie>) movieMapper.selectMovieByActor(actor);
        return movieList;
    }

    public List<Movie> pageOfMovieByRankDESC()
    {
        movieList=(List<Movie>) movieMapper.pageOfMovieByRankDESC();
        return movieList;
    }

    public List<Movie> pageOfMovieByRankTop()
    {
        movieList=(List<Movie>) movieMapper.pageOfMovieByRankTop();
        return movieList;
    }

    public List<Movie> pageOfMovieByRankASC()
    {
        movieList=(List<Movie>) movieMapper.pageOfMovieByRankASC();
        return movieList;
    }

    public List<Movie> pageOfMovieByTimeDESC()
    {
        movieList=(List<Movie>) movieMapper.pageOfMovieByTimeDESC();
        return movieList;
    }

    public List<Movie> pageOfMovieByTimeASC()
    {
        movieList=(List<Movie>) movieMapper.pageOfMovieByTimeASC();
        return movieList;
    }

    public int insertTheMovie(Movie myMovie)
    {
        this.movieMapper.addMovie(myMovie);
        return 0;
    }

    public int updateTheMovie(Movie myMovie)
    {
        this.movieMapper.updateMovie(myMovie);
        return 0;
    }


}
