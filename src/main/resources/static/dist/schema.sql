create table pboard (
    bno bigint(20) not null auto_increment,
    title varchar(200) not null,
    writer varchar(100) not null,
    content text,
    reg_at datetime not null default (now()),
    mod_at datetime not null default (now()),
    readcount bigint(20) default 0,
    primary key (pno)
);