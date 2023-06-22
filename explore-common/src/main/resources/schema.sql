create table classroom
(
    id          bigint primary key,
    name        text      not null,
    size        integer,
    creator     bigint    not null,
    create_time timestamp not null default CURRENT_TIME,
    updater     bigint    not null,
    update_time timestamp not null default CURRENT_TIME
);

create table student
(
    id          bigint primary key,
    name        text      not null,
    code        integer   not null,
    creator     bigint    not null,
    create_time timestamp not null default CURRENT_TIME,
    updater     bigint    not null,
    update_time timestamp not null default CURRENT_TIME
);