create ost_member(
  member_id int not null,
  name varchar(50) not null,
  nickname varchar)50 not null,
  email varchar(50) not null,
  tel varchar(20),
  created_date datetime default now()
);

alter table ost_member
  add constraint primary key (member_id),
  modify column member_id int not null auto_inrement;
  add constraint ost_memer_uk unique (email);
  modify column pwd varchar(100) not null;