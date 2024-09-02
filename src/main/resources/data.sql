-- Inserindo registros na tabela Time
INSERT INTO times (id, nome) VALUES
(1, 'Cartões'),
(2, 'Empréstimos'),
(3, 'Outros Assuntos');

-- Inserindo registros na tabela Atendente
INSERT INTO atendentes (id, nome, time_id) VALUES
(1, 'João Silva', 1),
(2, 'Maria Oliveira', 2),
(3, 'Carlos Souza', 3);

-- Inserindo registros na tabela Solicitacao
INSERT INTO solicitacoes ( tipo, atendente_id, data_criacao, status) VALUES
('PROBLEMAS_CARTAO', 1, '2024-09-01T10:00:00', 'PENDENTE'),
('CONTRATACAO_EMPRESTIMO', 2, '2024-09-01T11:00:00', 'PENDENTE'),
('OUTROS_ASSUNTOS', 3, '2024-09-01T12:00:00', 'PENDENTE'),
('PROBLEMAS_CARTAO', 1, '2024-09-01T13:00:00', 'PENDENTE'),
('CONTRATACAO_EMPRESTIMO', 2, '2024-09-01T14:00:00', 'PENDENTE');
