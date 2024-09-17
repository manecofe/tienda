-- Insertar permisos
INSERT INTO permissions (name) VALUES ('CREATE'), ('READ');

-- Insertar roles
INSERT INTO roles (role_name) VALUES ('EXTERNO'), ('ADMINISTRATIVO');

-- Inserta usuarios
INSERT INTO usuarios_entity (correo, contrasena, username) VALUES ('admin@admin.com', 'admin', 'admin'), ('test@test.com', 'test' , 'test');

-- Obtener los IDs para usar en los siguientes inserts
SELECT id FROM roles WHERE role_name = 'EXTERNO';
SELECT id FROM roles WHERE role_name = 'ADMINISTRATIVO';
SELECT id FROM permissions WHERE name = 'READ';
SELECT id FROM permissions WHERE name = 'CREATE';
SELECT id FROM usuarios_entity WHERE correo = 'admin@admin.com';
SELECT id FROM usuarios_entity WHERE correo = 'test@test.com';
-- Insertar relaciones Role-Permissions
-- Asignar solo permiso READ al role EXTERNO
INSERT INTO role_permissions (role_id, permission_id) VALUES (1, 1);

-- Asignar permisos READ y CREATE al role ADMINISTRATIVO
INSERT INTO role_permissions (role_id, permission_id) VALUES (2, 1);
INSERT INTO role_permissions (role_id, permission_id) VALUES (2, 2);

-- Asignar roles a usuarios
-- Asignar role ADMINISTRATIVO al usuario admin@admin.com
INSERT INTO user_roles (user_id, role_id) VALUES (1, 2);

-- Asignar role EXTERNO al usuario test@test.com
INSERT INTO user_roles (user_id, role_id) VALUES (2, 1);

INSERT INTO empresa_entity (nombre) VALUES ('Empresa A'), ('Empresa B');

INSERT INTO categoria_entity (nombre, empresa_id) VALUES ('Electrónica', 1), ('Hogar', 1), ('Ropa', 2);

-- Insertar productos
INSERT INTO producto_entity (nombre, precio, empresa_id) VALUES ('Laptop', 1000.00, 1), ('Smartphone', 600.00, 1), ('Televisor', 400.00, 1), ('Silla', 150.00, 2), ('Camiseta', 20.00, 2);

-- Insertar relación producto-categoría (producto puede estar en múltiples categorías)
INSERT INTO producto_categoria (producto_id, categoria_id) VALUES (1, 1), (2, 1), (3, 1), (4, 2), (5, 3);

-- Insertar órdenes
INSERT INTO orden_entity (cliente_id, total) VALUES (1, 1600.00), (1, 150.00), (2, 400.00), (2, 20.00);

-- Insertar relación orden-producto (órdenes pueden tener múltiples productos)
INSERT INTO orden_producto (orden_id, producto_id) VALUES (1, 1), (1, 2), (2, 4), (3, 3), (4, 5);
