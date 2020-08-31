-- begin STORE2_CLIENT
create table STORE2_CLIENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FULL_NAME varchar(255) not null,
    PHONE varchar(255) not null,
    EMAIL varchar(255) not null,
    SALE integer,
    --
    primary key (ID)
)^
-- end STORE2_CLIENT
-- begin STORE2_ORDER_POSITION
create table STORE2_ORDER_POSITION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT_ID varchar(36),
    COUNT_ bigint not null,
    --
    primary key (ID)
)^
-- end STORE2_ORDER_POSITION
-- begin STORE2_ORDER
create table STORE2_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ORDER_NUMBER bigint not null,
    CLIENT_ID varchar(36),
    --
    primary key (ID)
)^
-- end STORE2_ORDER
-- begin STORE2_PRODUCT
create table STORE2_PRODUCT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    PRICE bigint not null,
    --
    primary key (ID)
)^
-- end STORE2_PRODUCT
-- begin STORE2_ORDER_POSITION_ORDER_LINK
create table STORE2_ORDER_POSITION_ORDER_LINK (
    ORDER_ID varchar(36) not null,
    ORDER_POSITION_ID varchar(36) not null,
    primary key (ORDER_ID, ORDER_POSITION_ID)
)^
-- end STORE2_ORDER_POSITION_ORDER_LINK
