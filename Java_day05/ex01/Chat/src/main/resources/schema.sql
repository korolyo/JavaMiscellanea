CREATE SCHEMA IF NOT EXISTS chat;

CREATE TABLE IF NOT EXISTS chat.user
(
    user_id       SERIAL PRIMARY KEY,
    user_login    TEXT NOT NULL,
    user_password TEXT
);

CREATE TABLE IF NOT EXISTS  chat.chatroom
(
    room_id    SERIAL PRIMARY KEY,
    room_name  TEXT                               NOT NULL,
    room_owner INT REFERENCES chat.user(user_id) NOT NULL
);

CREATE TABLE IF NOT EXISTS  chat.message
(
    msg_id     SERIAL PRIMARY KEY,
    msg_author INT                                 NOT NULL REFERENCES chat.user(user_id),
    msg_room   INT                                 NOT NULL REFERENCES chat.chatroom(room_id),
    msg_text   TEXT                                NOT NULL,
    msg_date   TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);
