CREATE TABLE User {
    user_id         int,
    user_login      varchar(80),
    user_password   varchar(80),
    created_rooms   varchar(255),
    active_rooms    varchar(255)
    };

CREATE TABLE Chatroom {
    room_id         int,
    room_name       varchar(80),
    room_owner      varchar(80),
    room_messages   varchar(255)
    };

CREATE TABLE Message {
    msg_id      int,
    msg_author  varchar(80),
    msg_room    varchar(80),
    msg_text    varchar(255),
    msg_date    varchar(30)
    };