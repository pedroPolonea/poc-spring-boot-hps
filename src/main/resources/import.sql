insert into paciente (id_paciente,data_nascimento, nome, sobre_nome)
values	(1, {ts '2012-09-17 18:47:52.69'}, 'Paulo', 'Silva'),
		(2, {ts '2000-09-17 18:47:52.69'}, 'João', 'Silva'),
		(3, {ts '2002-09-17 18:47:52.69'}, 'Karlos', 'Carmos'),
		(4, {ts '1990-09-17 18:47:52.69'}, 'Felipe', 'Santos'),
		(5, {ts '1993-09-17 18:47:52.69'}, 'Carla', 'Silva'),
		(6, {ts '1994-09-17 18:47:52.69'}, 'Maria', 'Assis'),
		(7, {ts '1995-09-17 18:47:52.69'}, 'Katia', 'Lupo'),
		(8, {ts '1996-09-17 18:47:52.69'}, 'Josias', 'Angelos'),
		(9, {ts '1997-09-17 18:47:52.69'}, 'Joana', 'Puol'),
		(10, {ts '1998-09-17 18:47:52.69'}, 'Robertison', 'Silva');


insert into medico(id_medico, nome, sobre_nome)
values	(1, 'Kratos', 'God'),
		(2, 'Lilith', 'Trindade');


insert into morte(id_morte, data, id_paciente )
values(1, {ts '2019-09-17 18:47:52.69'}, 1);

insert into alta(id_alta, data_alta, id_paciente )
values(1, {ts '2019-09-17 18:47:52.69'}, 2);

insert into internamento(id_internamento, data_entrada, data_saida, id_paciente)
values	(1, {ts '2019-09-17 09:47:52.69'}, {ts '2019-09-17 18:47:52.69'}, 1),
		(2, {ts '2019-09-17 11:47:52.69'}, {ts '2019-09-17 18:47:52.69'}, 2),
		(3, {ts '2019-09-17 10:47:52.69'}, null, 3);

insert into consulta (id_consulta, data, id_medico, id_paciente)
values(1,{ts '2019-09-17 10:47:52.69'},1,4);