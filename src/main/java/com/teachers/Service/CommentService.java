package com.teachers.Service;

import com.teachers.Dao.CommentDao;
import com.teachers.Model.Comment;
import com.teachers.Model.Course_score;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentService {
    @Resource
    CommentDao commentdao;

    public  int addComment(Comment comment){
        return commentdao.addComment(comment);
    }

    public List<Course_score> selectScore(Integer userId,Integer termId){
        return  commentdao.selectScore(userId,termId);
    }
}
