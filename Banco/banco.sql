-- ============================================================
-- SISTEMA DE GERENCIAMENTO DE RESTAURANTE COVIL
-- MySQL Workbench 8.0 CE - Banco de Dados Completo
-- ============================================================
-- 
-- INSTRUÇÕES DE USO:
-- 1. Abra o MySQL Workbench 8.0 CE
-- 2. Conecte ao seu servidor MySQL (Local instance)
-- 3. Copie TODO este código
-- 4. Cole em uma nova query tab (Ctrl+T)
-- 5. Execute com o raio (⚡) ou Ctrl+Shift+Enter
-- 6. Após executar, vá em: Database → Reverse Engineer
-- 7. Selecione o schema "restaurante_covil"
-- 8. O diagrama será gerado automaticamente!
--
-- ============================================================

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema restaurante_covil
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `restaurante_covil` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE `restaurante_covil`;

-- -----------------------------------------------------
-- Table `restaurante_covil`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `restaurante_covil`.`usuarios` (
  `id_usuario` INT NOT NULL AUTO_INCREMENT,
  `nome_completo` VARCHAR(100) NOT NULL,
  `cpf` VARCHAR(14) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `telefone` VARCHAR(15) NOT NULL,
  `endereco` VARCHAR(255) NULL,
  `login` VARCHAR(50) NOT NULL,
  `senha` VARCHAR(255) NOT NULL,
  `data_cadastro` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `ativo` TINYINT(1) NOT NULL DEFAULT 1,
  PRIMARY KEY (`id_usuario`),
  UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC),
  UNIQUE INDEX `login_UNIQUE` (`login` ASC))
ENGINE = InnoDB
COMMENT = 'Tabela de usuários do sistema (cadastro geral)';

-- -----------------------------------------------------
-- Table `restaurante_covil`.`funcionarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `restaurante_covil`.`funcionarios` (
  `id_funcionario` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `cpf` VARCHAR(14) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `telefone` VARCHAR(15) NOT NULL,
  `cidade` VARCHAR(100) NOT NULL,
  `bairro` VARCHAR(100) NOT NULL,
  `perfil_acesso` ENUM('Gerente', 'Administrativo', 'Funcionario') NOT NULL DEFAULT 'Funcionario',
  `data_cadastro` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `ativo` TINYINT(1) NOT NULL DEFAULT 1,
  PRIMARY KEY (`id_funcionario`),
  UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC))
ENGINE = InnoDB
COMMENT = 'Tabela de funcionários do restaurante';

-- -----------------------------------------------------
-- Table `restaurante_covil`.`clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `restaurante_covil`.`clientes` (
  `id_cliente` INT NOT NULL AUTO_INCREMENT,
  `nome_completo` VARCHAR(100) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `telefone` VARCHAR(15) NOT NULL,
  `cpf` VARCHAR(14) NOT NULL,
  `data_nascimento` DATE NULL,
  `data_cadastro` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `total_pedidos` INT NOT NULL DEFAULT 0,
  `cliente_vip` TINYINT(1) NOT NULL DEFAULT 0,
  `ativo` TINYINT(1) NOT NULL DEFAULT 1,
  PRIMARY KEY (`id_cliente`),
  UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC))
ENGINE = InnoDB
COMMENT = 'Tabela de clientes do restaurante';

-- -----------------------------------------------------
-- Table `restaurante_covil`.`categorias_cardapio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `restaurante_covil`.`categorias_cardapio` (
  `id_categoria` INT NOT NULL AUTO_INCREMENT,
  `nome_categoria` VARCHAR(50) NOT NULL,
  `descricao` VARCHAR(255) NULL,
  `icone` VARCHAR(50) NULL,
  `ordem_exibicao` INT NULL,
  PRIMARY KEY (`id_categoria`),
  UNIQUE INDEX `nome_categoria_UNIQUE` (`nome_categoria` ASC))
ENGINE = InnoDB
COMMENT = 'Categorias do cardápio (hambúrguers, acompanhamentos, bebidas)';

-- -----------------------------------------------------
-- Table `restaurante_covil`.`produtos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `restaurante_covil`.`produtos` (
  `id_produto` INT NOT NULL AUTO_INCREMENT,
  `id_categoria` INT NOT NULL,
  `nome_produto` VARCHAR(100) NOT NULL,
  `descricao` TEXT NOT NULL,
  `ingredientes` TEXT NULL,
  `preco` DECIMAL(10,2) NOT NULL,
  `preco_antigo` DECIMAL(10,2) NULL,
  `em_promocao` TINYINT(1) NOT NULL DEFAULT 0,
  `mais_vendido` TINYINT(1) NOT NULL DEFAULT 0,
  `imagem_url` VARCHAR(500) NULL,
  `icone` VARCHAR(50) NULL,
  `disponivel` TINYINT(1) NOT NULL DEFAULT 1,
  `data_cadastro` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_produto`),
  INDEX `fk_produtos_categoria_idx` (`id_categoria` ASC),
  CONSTRAINT `fk_produtos_categoria`
    FOREIGN KEY (`id_categoria`)
    REFERENCES `restaurante_covil`.`categorias_cardapio` (`id_categoria`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB
COMMENT = 'Tabela de produtos do cardápio';

-- -----------------------------------------------------
-- Table `restaurante_covil`.`mesas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `restaurante_covil`.`mesas` (
  `id_mesa` INT NOT NULL AUTO_INCREMENT,
  `numero_mesa` INT NOT NULL,
  `capacidade` INT NOT NULL,
  `localizacao` ENUM('sala-principal', 'varanda', 'area-vip', 'area-externa', 'mezanino') NOT NULL,
  `tipo_mesa` ENUM('redonda', 'quadrada', 'retangular', 'alta') NOT NULL,
  `status` ENUM('disponivel', 'ocupada', 'manutencao') NOT NULL DEFAULT 'disponivel',
  `observacoes` TEXT NULL,
  PRIMARY KEY (`id_mesa`),
  UNIQUE INDEX `numero_mesa_UNIQUE` (`numero_mesa` ASC))
ENGINE = InnoDB
COMMENT = 'Tabela de mesas do restaurante';

-- -----------------------------------------------------
-- Table `restaurante_covil`.`reservas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `restaurante_covil`.`reservas` (
  `id_reserva` INT NOT NULL AUTO_INCREMENT,
  `id_cliente` INT NULL,
  `id_mesa` INT NULL,
  `nome_cliente` VARCHAR(100) NOT NULL,
  `telefone` VARCHAR(15) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `data_reserva` DATE NOT NULL,
  `horario` TIME NOT NULL,
  `numero_pessoas` INT NOT NULL,
  `observacoes` TEXT NULL,
  `status_reserva` ENUM('confirmada', 'cancelada', 'finalizada', 'aguardando') NOT NULL DEFAULT 'aguardando',
  `data_cadastro` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_reserva`),
  INDEX `fk_reservas_cliente_idx` (`id_cliente` ASC),
  INDEX `fk_reservas_mesa_idx` (`id_mesa` ASC),
  INDEX `idx_data_reserva` (`data_reserva` ASC),
  CONSTRAINT `fk_reservas_cliente`
    FOREIGN KEY (`id_cliente`)
    REFERENCES `restaurante_covil`.`clientes` (`id_cliente`)
    ON DELETE SET NULL
    ON UPDATE CASCADE,
  CONSTRAINT `fk_reservas_mesa`
    FOREIGN KEY (`id_mesa`)
    REFERENCES `restaurante_covil`.`mesas` (`id_mesa`)
    ON DELETE SET NULL
    ON UPDATE CASCADE)
ENGINE = InnoDB
COMMENT = 'Tabela de reservas de mesas';

-- -----------------------------------------------------
-- Table `restaurante_covil`.`avaliacoes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `restaurante_covil`.`avaliacoes` (
  `id_avaliacao` INT NOT NULL AUTO_INCREMENT,
  `id_cliente` INT NULL,
  `nome_cliente` VARCHAR(100) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `nota` INT NOT NULL,
  `comentario` TEXT NOT NULL,
  `data_avaliacao` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `aprovada` TINYINT(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id_avaliacao`),
  INDEX `fk_avaliacoes_cliente_idx` (`id_cliente` ASC),
  CONSTRAINT `fk_avaliacoes_cliente`
    FOREIGN KEY (`id_cliente`)
    REFERENCES `restaurante_covil`.`clientes` (`id_cliente`)
    ON DELETE SET NULL
    ON UPDATE CASCADE,
  CONSTRAINT `chk_nota` CHECK (`nota` >= 1 AND `nota` <= 5))
ENGINE = InnoDB
COMMENT = 'Tabela de avaliações dos clientes';

-- -----------------------------------------------------
-- Table `restaurante_covil`.`categorias_insumos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `restaurante_covil`.`categorias_insumos` (
  `id_categoria_insumo` INT NOT NULL AUTO_INCREMENT,
  `nome_categoria` VARCHAR(50) NOT NULL,
  `descricao` VARCHAR(255) NULL,
  PRIMARY KEY (`id_categoria_insumo`),
  UNIQUE INDEX `nome_categoria_UNIQUE` (`nome_categoria` ASC))
ENGINE = InnoDB
COMMENT = 'Categorias de insumos';

-- -----------------------------------------------------
-- Table `restaurante_covil`.`insumos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `restaurante_covil`.`insumos` (
  `id_insumo` INT NOT NULL AUTO_INCREMENT,
  `id_categoria_insumo` INT NOT NULL,
  `nome_insumo` VARCHAR(100) NOT NULL,
  `unidade_medida` ENUM('kg', 'g', 'l', 'ml', 'un', 'pacote', 'caixa') NOT NULL,
  `quantidade_estoque` DECIMAL(10,2) NOT NULL DEFAULT 0,
  `estoque_minimo` DECIMAL(10,2) NOT NULL,
  `custo_unitario` DECIMAL(10,2) NOT NULL,
  `fornecedor` VARCHAR(100) NULL,
  `data_validade` DATE NULL,
  `data_cadastro` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `data_ultima_atualizacao` DATETIME NULL,
  PRIMARY KEY (`id_insumo`),
  INDEX `fk_insumos_categoria_idx` (`id_categoria_insumo` ASC),
  CONSTRAINT `fk_insumos_categoria`
    FOREIGN KEY (`id_categoria_insumo`)
    REFERENCES `restaurante_covil`.`categorias_insumos` (`id_categoria_insumo`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB
COMMENT = 'Tabela de insumos/estoque';

-- -----------------------------------------------------
-- Table `restaurante_covil`.`movimentacoes_estoque`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `restaurante_covil`.`movimentacoes_estoque` (
  `id_movimentacao` INT NOT NULL AUTO_INCREMENT,
  `id_insumo` INT NOT NULL,
  `id_funcionario` INT NULL,
  `tipo_movimentacao` ENUM('entrada', 'saida', 'ajuste') NOT NULL,
  `quantidade` DECIMAL(10,2) NOT NULL,
  `motivo` VARCHAR(255) NULL,
  `data_movimentacao` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_movimentacao`),
  INDEX `fk_movimentacao_insumo_idx` (`id_insumo` ASC),
  INDEX `fk_movimentacao_funcionario_idx` (`id_funcionario` ASC),
  CONSTRAINT `fk_movimentacao_insumo`
    FOREIGN KEY (`id_insumo`)
    REFERENCES `restaurante_covil`.`insumos` (`id_insumo`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_movimentacao_funcionario`
    FOREIGN KEY (`id_funcionario`)
    REFERENCES `restaurante_covil`.`funcionarios` (`id_funcionario`)
    ON DELETE SET NULL
    ON UPDATE CASCADE)
ENGINE = InnoDB
COMMENT = 'Tabela de movimentações de estoque';

-- -----------------------------------------------------
-- Table `restaurante_covil`.`categorias_gastos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `restaurante_covil`.`categorias_gastos` (
  `id_categoria_gasto` INT NOT NULL AUTO_INCREMENT,
  `nome_categoria` VARCHAR(50) NOT NULL,
  `descricao` VARCHAR(255) NULL,
  PRIMARY KEY (`id_categoria_gasto`),
  UNIQUE INDEX `nome_categoria_UNIQUE` (`nome_categoria` ASC))
ENGINE = InnoDB
COMMENT = 'Categorias de gastos operacionais';

-- -----------------------------------------------------
-- Table `restaurante_covil`.`gastos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `restaurante_covil`.`gastos` (
  `id_gasto` INT NOT NULL AUTO_INCREMENT,
  `id_categoria_gasto` INT NOT NULL,
  `id_funcionario` INT NULL,
  `descricao` VARCHAR(255) NOT NULL,
  `valor` DECIMAL(10,2) NOT NULL,
  `data_gasto` DATE NOT NULL,
  `forma_pagamento` ENUM('dinheiro', 'cartao', 'pix', 'transferencia', 'boleto') NOT NULL,
  `fornecedor` VARCHAR(100) NULL,
  `numero_nota` VARCHAR(50) NULL,
  `observacoes` TEXT NULL,
  `data_cadastro` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_gasto`),
  INDEX `fk_gastos_categoria_idx` (`id_categoria_gasto` ASC),
  INDEX `fk_gastos_funcionario_idx` (`id_funcionario` ASC),
  INDEX `idx_data_gasto` (`data_gasto` ASC),
  CONSTRAINT `fk_gastos_categoria`
    FOREIGN KEY (`id_categoria_gasto`)
    REFERENCES `restaurante_covil`.`categorias_gastos` (`id_categoria_gasto`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_gastos_funcionario`
    FOREIGN KEY (`id_funcionario`)
    REFERENCES `restaurante_covil`.`funcionarios` (`id_funcionario`)
    ON DELETE SET NULL
    ON UPDATE CASCADE)
ENGINE = InnoDB
COMMENT = 'Tabela de gastos operacionais';

-- -----------------------------------------------------
-- Table `restaurante_covil`.`registro_ponto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `restaurante_covil`.`registro_ponto` (
  `id_registro` INT NOT NULL AUTO_INCREMENT,
  `id_funcionario` INT NOT NULL,
  `data_registro` DATE NOT NULL,
  `horario` TIME NOT NULL,
  `tipo_registro` ENUM('entrada', 'saida') NOT NULL,
  `observacoes` VARCHAR(255) NULL,
  `data_hora_registro` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_registro`),
  INDEX `fk_ponto_funcionario_idx` (`id_funcionario` ASC),
  INDEX `idx_data_registro` (`data_registro` ASC),
  CONSTRAINT `fk_ponto_funcionario`
    FOREIGN KEY (`id_funcionario`)
    REFERENCES `restaurante_covil`.`funcionarios` (`id_funcionario`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
COMMENT = 'Tabela de registro de ponto dos funcionários';

-- -----------------------------------------------------
-- Inserção de dados iniciais
-- -----------------------------------------------------

-- Categorias do cardápio
INSERT INTO `categorias_cardapio` (`nome_categoria`, `descricao`, `icone`, `ordem_exibicao`) VALUES
('Hambúrguers Reais', 'Nossos hambúrguers premium', 'fas fa-hamburger', 1),
('Acompanhamentos Nobres', 'Acompanhamentos especiais', 'fas fa-drumstick-bite', 2),
('Bebidas do Reino', 'Bebidas refrescantes e especiais', 'fas fa-glass-cheers', 3);

-- Categorias de insumos
INSERT INTO `categorias_insumos` (`nome_categoria`, `descricao`) VALUES
('Insumos e Ingredientes', 'Ingredientes para preparo dos pratos'),
('Equipamentos', 'Equipamentos de cozinha'),
('Manutenção', 'Materiais de manutenção'),
('Produtos de Limpeza', 'Produtos para limpeza e higienização');

-- Categorias de gastos
INSERT INTO `categorias_gastos` (`nome_categoria`, `descricao`) VALUES
('Insumos e Ingredientes', 'Compra de ingredientes'),
('Equipamentos', 'Compra e manutenção de equipamentos'),
('Manutenção', 'Serviços de manutenção'),
('Produtos de Limpeza', 'Produtos de limpeza'),
('Funcionários', 'Pagamentos e benefícios'),
('Marketing', 'Publicidade e marketing'),
('Contas', 'Luz, água, gás'),
('Impostos e Taxas', 'Impostos e taxas diversas'),
('Outros', 'Gastos diversos');

-- Funcionário gerente padrão
INSERT INTO `funcionarios` (`nome`, `cpf`, `email`, `telefone`, `cidade`, `bairro`, `perfil_acesso`) VALUES
('Eduardo Dall Rosa', '000.000.000-00', 'eduardo@covilrestaurante.com', '(48) 99999-9999', 'Chapecó', 'Centro', 'Gerente');

-- Mesas de exemplo
INSERT INTO `mesas` (`numero_mesa`, `capacidade`, `localizacao`, `tipo_mesa`, `status`) VALUES
(1, 4, 'sala-principal', 'redonda', 'disponivel'),
(2, 2, 'varanda', 'quadrada', 'disponivel'),
(3, 6, 'area-vip', 'retangular', 'disponivel'),
(4, 8, 'sala-principal', 'retangular', 'disponivel');

-- Produtos de exemplo
INSERT INTO `produtos` (`id_categoria`, `nome_produto`, `descricao`, `preco`, `mais_vendido`, `imagem_url`) VALUES
(1, 'X-Carne Real', 'Nosso hambúrguer premium com blend especial da casa, queijo aged cheddar, alface americana, tomate e molho secreto do reino.', 50.00, 1, 'https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=500'),
(1, 'Hambúrguer Padrão', 'O clássico que nunca sai de moda. Carne bovina, queijo, alface, tomate e maionese especial.', 25.00, 0, 'https://images.unsplash.com/photo-1550547660-d9450f859349?w=500'),
(2, 'Batatas Fritas do Reino', 'Batatas rústicas cortadas na casa, temperadas com sal especial e ervas finas.', 15.00, 1, 'https://images.unsplash.com/photo-1573080496219-bb080dd4f877?w=500'),
(3, 'Heineken', 'Cerveja premium gelada, perfeita para acompanhar nossos hambúrguers.', 6.00, 1, NULL);

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;