Create table if not EXISTS candy{
    id bigint not null,
    name nvarchar(25),
    price decimal(12,4),
    PRIMARY KEY(id)
}
