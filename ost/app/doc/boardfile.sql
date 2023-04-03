create table ost_board_file (
  boardfile_id int not null,
  filepath varchar(255) not null,
  origin_filename varchar(255) not null,
  mime_type varchar(50) not null,
  board_id int not null
);

alter table ost_board_file
  add constraint primary key (boardfile_id),
  modify column boardfile_id int not null auto_increment;
  
