create table pet
(
    dtype  varchar(31) not null,
    id     integer primary key auto_increment,
    name   varchar(255),
    color  varchar(255),
    size   integer,
    length integer
);
-- cats
insert into pet (dtype, name, color, size)
values ('Cat', 'cat1', 'color1', 10);
insert into pet (dtype, name, color, size)
values ('Cat', 'cat2', 'color2', 15);
insert into pet (dtype, name, color, size)
values ('Cat', 'cat3', 'color3', 20);
insert into pet (dtype, name, color, size)
values ('Cat', 'cat4', 'color3', 21);
insert into pet (dtype, name, color, size)
values ('Cat', 'cat5', 'color1', 8);
insert into pet (dtype, name, color, size)
values ('Cat', 'cat5', 'color4', 8);
insert into pet (dtype, name, color, size)
values ('Cat', 'cat5', 'color1', 8);

-- dog
insert into pet (dtype, name, color)
values ('Dog', 'dog1', 'red');
insert into pet (dtype, name, color)
values ('Dog', 'dog2', 'blue');
insert into pet (dtype, name, color)
values ('Dog', 'dog3', 'green');
insert into pet (dtype, name, color)
values ('Dog', 'dog4', 'black');
insert into pet (dtype, name, color)
values ('Dog', 'dog5', 'yellow');

-- snake
insert into pet (dtype, name, length)
values ('Snake', 's1', 112);
insert into pet (dtype, name, length)
values ('Snake', 's2', 100);
insert into pet (dtype, name, length)
values ('Snake', 's3', 105);

create table friends
(
    friend_id_left  int,
    friend_id_right int
);

insert into friends (friend_id_left, friend_id_right)
values (5, 2);
insert into friends (friend_id_left, friend_id_right)
values (5, 3);
insert into friends (friend_id_left, friend_id_right)
values (5, 4);
insert into friends (friend_id_left, friend_id_right)
values (3, 5);
insert into friends (friend_id_left, friend_id_right)
values (5, 6);
insert into friends (friend_id_left, friend_id_right)
values (5, 7);
insert into friends (friend_id_left, friend_id_right)
values (2, 3);
insert into friends (friend_id_left, friend_id_right)
values (2, 4);
insert into friends (friend_id_left, friend_id_right)
values (3, 13);
insert into friends (friend_id_left, friend_id_right)
values (4, 11);
insert into friends (friend_id_left, friend_id_right)
values (5, 8);
insert into friends (friend_id_left, friend_id_right)
values (6, 12);
insert into friends (friend_id_left, friend_id_right)
values (9, 10);
