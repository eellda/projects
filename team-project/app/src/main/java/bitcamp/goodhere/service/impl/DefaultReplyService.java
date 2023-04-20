package bitcamp.goodhere.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import bitcamp.goodhere.dao.ReplyDao;
import bitcamp.goodhere.service.ReplyService;
import bitcamp.goodhere.vo.Reply;

@Service
public class DefaultReplyService implements ReplyService {
  @Autowired private ReplyDao replyDao;


  @Override
  public void add(Reply reply) {
    replyDao.insert(reply);
  }

  @Override
  public List<Reply> list() {
    // TODO Auto-generated method stub
    return replyDao.findAll();
  }

  @Override
  public Reply get(int no) {
    Reply r = replyDao.findByNo(no);
    return r;
  }

  @Override
  public List<Reply> getList(Reply reply) {
    List<Reply> parentComments = replyDao.findList(reply);
    for (Reply parentComment : parentComments) {
      List<Reply> childComments = replyDao.findReList(parentComment.getNo());
      parentComment.setReComments(childComments);
    }
    return parentComments;
  }

  @Transactional
  @Override
  public void update(Reply reply) {
    if (replyDao.update(reply) == 0) {
      throw new RuntimeException("댓글이 존재하지 않습니다!");
    }    
  }

  @Transactional
  @Override
  public void delete(int no) {
    if (replyDao.delete(no) == 1) {
    } else {
      throw new RuntimeException("댓글이 존재하지 않습니다.");
    }
  }
}
