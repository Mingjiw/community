create table question
(
	id int auto_increment,
	title varchar(50),
	description text,
	gmt_create bigint,
	gmt_modified bigint,
	comment_count int default 0,
	view_count int default 0,
	like_count int default 0,
	tag varchar(256),
	creator int,
	constraint question_pk
	primary key (id)
);

