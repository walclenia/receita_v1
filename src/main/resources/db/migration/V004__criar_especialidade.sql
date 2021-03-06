-- Criar tabela Especialidade

CREATE TABLE IF NOT EXISTS public.PB_ESPECIALIDADE (
    id BIGSERIAL,
    data_cadastro TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    nome_especialidade VARCHAR(50) UNIQUE NOT NULL,
    	CONSTRAINT pk_id_especialidade PRIMARY KEY (id)
);

-- Carga teste na tabela Especialidade
INSERT INTO public.PB_ESPECIALIDADE (nome_especialidade) VALUES ('CLINICO GERAL');
INSERT INTO public.PB_ESPECIALIDADE (nome_especialidade) VALUES ('GINECOLOGIA E OBSTETRICIA');
INSERT INTO public.PB_ESPECIALIDADE (nome_especialidade) VALUES ('CARDIOLOGIA');
INSERT INTO public.PB_ESPECIALIDADE (nome_especialidade) VALUES ('OTORRINOLARINGOLOGIA');
INSERT INTO public.PB_ESPECIALIDADE (nome_especialidade) VALUES ('ONCOLOGIA');
INSERT INTO public.PB_ESPECIALIDADE (nome_especialidade) VALUES ('UROLOGIA');
INSERT INTO public.PB_ESPECIALIDADE (nome_especialidade) VALUES ('PNEUMOLOGIA');
INSERT INTO public.PB_ESPECIALIDADE (nome_especialidade) VALUES ('PROCTOLOGIA');
INSERT INTO public.PB_ESPECIALIDADE (nome_especialidade) VALUES ('PSQUIATRIA');
INSERT INTO public.PB_ESPECIALIDADE (nome_especialidade) VALUES ('RADIOLOGIA');
INSERT INTO public.PB_ESPECIALIDADE (nome_especialidade) VALUES ('ULTRASONOGRAFIA');
INSERT INTO public.PB_ESPECIALIDADE (nome_especialidade) VALUES ('ANESTELIOLOGIA');
INSERT INTO public.PB_ESPECIALIDADE (nome_especialidade) VALUES ('GASTROENTEROLOGIA');
