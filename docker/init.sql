INSERT INTO user(username, password, enable) VALUES ('user','$2a$10$YuXR9RErsgWgKlQkGh6Ys.2qLXaEXk9eaY5RBRnN0hdnBeH/YfdGi',1);
INSERT INTO user(username, password, enable) VALUES ('admin','$2a$10$dXCBOaCr1BhSLm3BwtZjpumDLH9KDZU/XHn4YE3RohQOhDbLUyAtS',1);

INSERT INTO rol(rol) VALUES ("ROLE_USER");
INSERT INTO rol(rol) VALUES ("ROLE_ADMIN");

INSERT INTO user_rol(user_id, rol_id) VALUES (1,1);
INSERT INTO user_rol(user_id, rol_id) VALUES (2,1);
INSERT INTO user_rol(user_id, rol_id) VALUES (2,2);