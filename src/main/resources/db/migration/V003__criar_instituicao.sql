-- Criar tabela Instituicao

CREATE TABLE IF NOT EXISTS public.PB_INSTITUICAO (
    id BIGSERIAL,
    data_cadastro TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    cnpj VARCHAR(14) UNIQUE NOT NULL,
    razao_social VARCHAR(255) NOT NULL,
    endereco_fk INTEGER NOT NULL,
    numero_endereco VARCHAR(10) NULL,
    complemento VARCHAR(50) NULL,
    	CONSTRAINT pk_id_instituicao PRIMARY KEY (id),
    	FOREIGN KEY (endereco_fk) REFERENCES public.PB_ENDERECO (id)
);

-- Carga teste na tabela
INSERT INTO public.PB_INSTITUICAO (cnpj, razao_social, endereco_fk, numero_endereco, complemento) VALUES ('42839427000128', 'CRM PB', 1, '546', 'SALA 3');
INSERT INTO public.PB_INSTITUICAO (cnpj, razao_social, endereco_fk, numero_endereco, complemento) VALUES ('98558978000178', 'CRM PE', 1000, '12', 'SALA 1');
INSERT INTO public.PB_INSTITUICAO (cnpj, razao_social, endereco_fk, numero_endereco, complemento) VALUES ('88122347000158', 'CRM AL', 15465, '958', 'SALA 19');
INSERT INTO public.PB_INSTITUICAO (cnpj, razao_social, endereco_fk, numero_endereco, complemento) VALUES ('68272785000195', 'CRM CE', 16511, '1446', 'SALA 12');
INSERT INTO public.PB_INSTITUICAO (cnpj, razao_social, endereco_fk, numero_endereco, complemento) VALUES ('39502683000110', 'CRM MA', 19874, '954', 'SALA 10');
INSERT INTO public.PB_INSTITUICAO (cnpj, razao_social, endereco_fk, numero_endereco, complemento) VALUES ('22983641000146', 'CRM SP', 1651, '5416', 'SALA 8');
INSERT INTO public.PB_INSTITUICAO (cnpj, razao_social, endereco_fk, numero_endereco, complemento) VALUES ('64516940000110', 'CRM RJ', 154, '236', 'SALA 2');
INSERT INTO public.PB_INSTITUICAO (cnpj, razao_social, endereco_fk, numero_endereco, complemento) VALUES ('36668574000180', 'CRM RN', 15665, '146', 'SALA 5');
INSERT INTO public.PB_INSTITUICAO (cnpj, razao_social, endereco_fk, numero_endereco, complemento) VALUES ('55413481000159', 'CRM RR', 19877, '526', 'SALA 1');
INSERT INTO public.PB_INSTITUICAO (cnpj, razao_social, endereco_fk, numero_endereco, complemento) VALUES ('98164673000181', 'CRM AM', 119877, '91', 'SALA 20');
