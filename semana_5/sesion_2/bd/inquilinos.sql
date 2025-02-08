    CREATE DATABASE inquilinos;
    
    CREATE TABLE IF NOT EXISTS inquilinos (
      idinquilinos INT NOT NULL AUTO_INCREMENT,
      dni VARCHAR(8) NOT NULL,
      nombres VARCHAR(150) NOT NULL,
      paterno VARCHAR(150) NOT NULL,
      materno VARCHAR(150) NOT NULL,
      telefono VARCHAR(40) NULL,
      correo VARCHAR(200) NULL,
      deuda DECIMAL(10,2) NOT NULL,
      fecha_ingreso DATE NOT NULL,
      PRIMARY KEY (idinquilinos),
      UNIQUE INDEX dni_UNIQUE (dni ASC))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8;

        INSERT INTO inquilinos(dni, nombres, paterno, materno, 
    telefono, fecha_ingreso, correo, deuda) VALUES 
    ('31378082','LUISA', 'PAUCAR','NARRO','999888777',
    '2018-01-28','lpaucar@mail.com',0.00),
    ('43331042','AUGUSTO','SOTOMAYOR','NARVAJO','900800700',
    '2019-10-08','asoto@mail.com',0.00);


    /*
    Código:
    https://inlearningcode.blogspot.com/2019/10/mysql-bd.html
    */