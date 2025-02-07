create table if not exists orders(
    id serial primary key not null
);

create table if not exists order_items(
    id serial primary key not null,
    product_id int not null,
    quantity int not null,
    orders int references orders(id)
);

create table if not exists deliveries(
    id serial primary key not null,
    order_id int not null
);