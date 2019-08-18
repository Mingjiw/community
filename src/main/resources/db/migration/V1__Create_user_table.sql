create table USER
(
  ID           INTEGER auto_increment,
  NAME         VARCHAR(50),
  TOKEN        CHAR(36),
  ACCOUNT_ID   VARCHAR(100),
  GMT_CREATE   BIGINT,
  GMT_MODIFIED BIGINT,
  primary key (ID)
);