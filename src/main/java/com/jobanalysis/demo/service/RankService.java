package com.jobanalysis.demo.service;
import com.jobanalysis.demo.entity.Rank;
import com.jobanalysis.demo.mapper.RankMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RankService {

    @Autowired
    private RankMapper rankMapper;
    private Rank rank;
    private List<Rank> rankList;
    public int insertTheRank(Rank myRank)
    {
        this.rankMapper.addRank(myRank);
        return 0;
    }

    public List<Rank> findCommentOfMovie(int id)
    {
        rankList=this.rankMapper.findCommentOfMovie(id);
        return rankList;
    }

    public int findScoreOfMovie(int id)
    {
        return this.rankMapper.findScoreOfMovie(id);
    }

    public int findCountOfMovie(int id)
    {
        return this.rankMapper.findCountOfMovie(id);
    }

    public List<Rank> findCommentOfMyself(int id)
    {
        return this.rankMapper.findCommentOfMyself(id);
    }
}
