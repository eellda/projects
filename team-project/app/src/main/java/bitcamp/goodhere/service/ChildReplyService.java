package bitcamp.goodhere.service;

import java.util.List;
import bitcamp.goodhere.vo.ChildReply;

public interface ChildReplyService {
  void add(ChildReply childReply);
  List<ChildReply> list();
  List<ChildReply> getList(ChildReply childReply);
  void update(ChildReply childReply);
  void delete(int no);
}
