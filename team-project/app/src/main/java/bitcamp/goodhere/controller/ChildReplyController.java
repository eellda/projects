package bitcamp.goodhere.controller;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import bitcamp.goodhere.service.ChildReplyService;
import bitcamp.goodhere.vo.ChildReply;
import bitcamp.goodhere.vo.Member;
import bitcamp.util.RestResult;
import bitcamp.util.RestStatus;
import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("replys/child")
public class ChildReplyController {
  Logger log = LogManager.getLogger(getClass());

  {
    log.trace("ReplyController 생성됨!");
  }

  @Autowired private ChildReplyService childReplyService;


  @PostMapping
  public Object createChildReply(
      ChildReply childReply,
      HttpSession session) throws Exception {

    //    Member loginUser = (Member) session.getAttribute("loginUser");
    Member writer = new Member();
    //    writer.setNo(loginUser.getNo());
    writer.setNo(1);
    childReply.setWriter(writer);
    childReplyService.add(childReply);

    return new RestResult().setStatus(RestStatus.SUCCESS);
  }

  @GetMapping
  public Object list() {
    //    System.out.println("==>");
    return new RestResult()
        .setStatus(RestStatus.SUCCESS)
        .setData(childReplyService.list());
  }

  @GetMapping("{no}")
  public List<ChildReply> listOfParentNo(@PathVariable int no) throws Exception {
    System.out.println("list 호출");
    ChildReply childReply = new ChildReply();
    childReply.setNo(no);

    return childReplyService.getList(childReply);
  }

}
