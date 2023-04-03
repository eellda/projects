create table ost_board (
  board_id int not null,
  title varchar(255) not null,
  content text not null,
  created_date datetime default now(),
  view_cnt int default 0
);

alter table ost_board
  add constraint primary key (board_id),
  modify column board_id int not null auto_increment;
  
alter table ost_board
  add column writer int,
  add constraint ost_board_fk foreign key (writer) references ost_member(member_id);