create table user (id int8 not null, email varchar(100), password varchar(20) not null, primary key (id));

create table user_authority (user_id int8 not null, authority_id int4 not null);
alter table if exists authority add constraint UK_nrgoi6sdvipfsloa7ykxwlslf unique (authority);
alter table if exists user_authority add constraint FKgvxjs381k6f48d5d2yi11uh89 foreign key (authority_id) references authority;
alter table if exists user_authority add constraint FKpqlsjpkybgos9w2svcri7j8xy foreign key (user_id) references user;
