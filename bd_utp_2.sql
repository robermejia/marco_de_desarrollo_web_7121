-- Creación de la base de datos
CREATE DATABASE bd_utp;

-- Creación de la tabla Categorias
CREATE TABLE categorias (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(30) UNIQUE NOT NULL
);

-- Creación de la tabla Productos
CREATE TABLE productos (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  imagen VARCHAR(200) NOT NULL,
  precio DECIMAL(10, 2) NOT NULL,
  stock INT NOT NULL,
  categoria_id INT NOT NULL
);

-- Creación de la tabla Usuarios
CREATE TABLE usuarios (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  correo VARCHAR(100) UNIQUE NOT NULL,
  clave VARCHAR(255) NOT NULL,
  tipo VARCHAR(20) NOT NULL
);

-- Creación de la tabla Clientes
CREATE TABLE clientes (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  apellido VARCHAR(50) NOT NULL,
  dni VARCHAR(8) UNIQUE NOT NULL,
  telefono VARCHAR(9) NOT NULL,
  correo VARCHAR(100) UNIQUE NOT NULL
);

-- Creación de la tabla Pedidos
CREATE TABLE pedidos (
  id INT PRIMARY KEY AUTO_INCREMENT,
  cliente_id INT NOT NULL,
  usuario_id INT NOT NULL,  -- Se agrega la columna usuario_id
  fecha DATE NOT NULL,
  estado VARCHAR(20) NOT NULL DEFAULT 'Pendiente'
);

-- Creación de la tabla Detalles de Pedido
CREATE TABLE detalles_pedido (
  id INT PRIMARY KEY AUTO_INCREMENT,
  pedido_id INT NOT NULL,
  producto_id INT NOT NULL,
  cantidad INT NOT NULL,
  precio_unitario DECIMAL(10, 2) NOT NULL
);

-- Agregar la clave foránea a la tabla productos
ALTER TABLE productos
ADD CONSTRAINT fk_categoria
FOREIGN KEY (categoria_id) REFERENCES categorias(id);

-- Agregar la clave foránea a la tabla Pedidos
ALTER TABLE pedidos
ADD CONSTRAINT fk_cliente
FOREIGN KEY (cliente_id) REFERENCES clientes(id);

ALTER TABLE pedidos
ADD CONSTRAINT fk_usuario
FOREIGN KEY (usuario_id) REFERENCES usuarios(id);  -- Se agrega la clave foránea a usuarios

-- Agregar la clave foránea a la tabla Detalles de Pedido
ALTER TABLE detalles_pedido
ADD CONSTRAINT fk_pedido
FOREIGN KEY (pedido_id) REFERENCES pedidos(id);

ALTER TABLE detalles_pedido
ADD CONSTRAINT fk_producto
FOREIGN KEY (producto_id) REFERENCES productos(id);

-- Inserciones en la tabla Categorias
INSERT INTO categorias (nombre) VALUES
('Audifonos'),
('Almacenamiento'),
('Camaras'),
('Componentes');

-- Inserciones en la tabla Productos
INSERT INTO productos (id, nombre, imagen, precio, stock, categoria_id) VALUES
(1, 'Audifonos', 'https://images.pexels.com/photos/16688488/pexels-photo-16688488/free-photo-of-blanco-y-negro-escritorio-ordenador-portatil-oficina.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 30.00, 10, 1),
(2, 'Disco Duro Externo', 'https://images.pexels.com/photos/20076003/pexels-photo-20076003/free-photo-of-cable-tecnologia-portatil-electronica.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 200.00, 10, 2),
(3, 'Camara Pro', 'https://images.pexels.com/photos/11002709/pexels-photo-11002709.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 400.00, 10, 3),
(4, 'Auriculares', 'https://images.pexels.com/photos/3921803/pexels-photo-3921803.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 40.00, 10, 1),
(5, 'Siri', 'https://images.pexels.com/photos/1034653/pexels-photo-1034653.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 150.00, 10, 4),
(6, 'Tarjeta de Video', 'https://images.pexels.com/photos/4581903/pexels-photo-4581903.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 300.00, 10, 4),
(7, 'Celular', 'https://images.pexels.com/photos/10343717/pexels-photo-10343717.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 800.00, 10, 4),
(8, 'Laptop', 'https://images.pexels.com/photos/577210/pexels-photo-577210.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 3200.00, 10, 4);

-- Formato de la imagen:
UPDATE productos SET imagen = REPLACE(REPLACE(imagen, '\\u0026', '&'), '\\u003e', '>');

-- Inserciones en la tabla Clientes (Ejemplo):
INSERT INTO clientes (nombre, apellido, dni, telefono, correo) VALUES
('Juan', 'Perez', '78945612', '987654321', 'juan.perez@example.com'),
('Maria', 'Rodriguez', '12345678', '999888777', 'maria.rodriguez@example.com');

-- Inserciones en la tabla Pedidos (Ejemplo):
INSERT INTO pedidos (cliente_id, usuario_id, fecha, estado) VALUES
(1, 1, '2023-12-28', 'Pendiente'),
(2, 2, '2023-12-29', 'En proceso');

-- Inserciones en la tabla Detalles de Pedido (Ejemplo):
INSERT INTO detalles_pedido (pedido_id, producto_id, cantidad, precio_unitario) VALUES
(1, 1, 2, 30.00),
(1, 2, 1, 200.00),
(2, 3, 1, 400.00);