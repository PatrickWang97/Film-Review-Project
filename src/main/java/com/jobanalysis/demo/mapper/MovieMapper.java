package com.jobanalysis.demo.mapper;
import com.jobanalysis.demo.entity.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MovieMapper {
    public int addMovie(Movie movie);
    public Movie selectMovieDetail(int id);
    public List<Movie> selectMovieByType(String type);
    public List<Movie> selectMovieByLanguage(String language);
    public List<Movie> selectMovieByName(String name);
    public List<Movie> selectMovieByActor(String actor);
    public List<Movie> pageOfMovieByRankDESC();
    public List<Movie> pageOfMovieByRankTop();
    public List<Movie> pageOfMovieByRankASC();
    public List<Movie> pageOfMovieByTimeDESC();
    public List<Movie> pageOfMovieByTimeASC();
    public int updateMovie(Movie movie);

}