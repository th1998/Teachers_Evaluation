package com.teachers.Controller;

import com.teachers.Model.Comment;
import com.teachers.Model.Course_score;
import com.teachers.Model.ResultMsg;
import com.teachers.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CommentController {
    @Autowired
    private CommentService commentService;

    @RequestMapping("/addComment")
    @ResponseBody
    public ResultMsg addComment(Comment comment){
        Comment c = new Comment();
        c.setTeacherId(comment.getTeacherId());
        c.setCourseId(comment.getCourseId());
        c.setUserId(comment.getUserId());
        c.setTermId(comment.getTermId());
        c.setScore(comment.getScore());
        int i = commentService.addComment(c);
        if(i>0){
            return new ResultMsg(1,"评价成功");
        }else{
            return new ResultMsg(2,"评价失败");
        }
    }

    @RequestMapping("/selectScore")
    @ResponseBody
    public List<Course_score> selectScore(Integer userId, Integer termId){
        return commentService.selectScore(userId,termId);
    }
}
