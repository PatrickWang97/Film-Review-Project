package com.jobanalysis.demo.mapper;
import com.jobanalysis.demo.entity.Rank;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RankMapper {
    public int addRank(Rank rank);
    public List<Rank> findCommentOfMovie(int id);
    public int findScoreOfMovie(int id);
    public int findCountOfMovie(int id);
    public List<Rank> findCommentOfMyself(int id);
}