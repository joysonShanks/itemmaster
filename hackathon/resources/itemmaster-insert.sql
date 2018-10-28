insert into users (id, username, password, firstname, lastname, dateofbirth, email) values ('1', 'joyson', '$2a$10$Xidspse050kjKokv2itETuqug3oApw7LS9syXk7QN8Xt3cTgdNBxe', 'Joyson', 'D Souza', '1993-04-17', 'joyson.ullal@gmail.com');

insert into users (id, username, password, firstname, lastname, dateofbirth, email) values ('4', 'admin', '$2a$10$.cIPNNiI6zgP8GrLber2bepqrOk5mMpKcCNKe8/fVZKZ8rRegE.0a', 'Admin', 'ITEMMASTER', '1993-04-17', 'admin@admin.com');

insert into role (id, role_name, description) values ('2', 'USER', 'Item master user');
insert into role (id, role_name, description) values ('3', 'ADMIN', 'Item master admin');


insert into user_role (user_id, role_id) values ('1', '2');
insert into user_role (user_id, role_id) values ('4', '3');



https://www.tinmegali.com/en/2017/06/25/oauth2-using-spring/

get access token 
curl trusted-app:secret@localhost:8080/oauth/token -d "grant_type=password&username=user&password=password"

