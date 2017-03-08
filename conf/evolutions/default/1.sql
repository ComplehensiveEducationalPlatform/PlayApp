# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table test (
  user_id                       varchar(255),
  name                          varchar(255)
);


# --- !Downs

drop table if exists test;

