Create database BD_Biblioteca;

Use BD_Biblioteca;

Create table Turma(

	id_Turma  INT PRIMARY KEY IDENTITY(1,1),
	nomeTurma VARCHAR(255) NOT NULL);

Create table Aluno(

	id_Aluno     INT PRIMARY KEY IDENTITY(1,1),
	nomeCompleto VARCHAR(255) NOT NULL,
	rm           INT NOT NULL,
	usuario      VARCHAR(255) NOT NULL,
	senha        VARCHAR(255) NOT NULL,
	sexo         VARCHAR(1) NOT NULL,
	flag		 BIT DEFAULT 1, 

	id_turma     INT NOT NULL,
	FOREIGN KEY(id_Turma) references Turma(id_Turma));

Create table Assunto(

	id_Assunto INT PRIMARY KEY IDENTITY(1,1),
	NomeAssunto VARCHAR(255));

Create table Categoria(

	id_Cat  INT PRIMARY KEY IDENTITY(1,1),
	NomeCat VARCHAR(255));

Create table Funcionario(

	id_Func   INT PRIMARY KEY IDENTITY(1,1),
	NomeFunc  VARCHAR(255) NOT NULL,
	EmailFunc VARCHAR(255) NOT NULL,
	Sexo      CHAR(1),
	Usuario   VARCHAR(255) NOT NULL,
	Senha     VARCHAR(255) NOT NULL,
	flag	  BIT DEFAULT 1);

Create table Autor(

	id_Autor INT PRIMARY KEY IDENTITY(1,1),
	nomeAutor VARCHAR(255) NOT NULL);

Create table Livro(

	id_Livro   INT PRIMARY KEY IDENTITY(1,1),
	nomeLivro  VARCHAR(255) NOT NULL,
	Sinopse    VARCHAR(8000) NOT NULL,

	id_Cat     INT NOT NULL,
	id_Assunto INT NOT NULL,

	FOREIGN KEY(id_Cat) references Categoria(id_Cat),
	FOREIGN KEY(id_Assunto) references Assunto(id_Assunto));

Create table Autor_Livro(

	id_Autor_Livro INT PRIMARY KEY IDENTITY(1,1),

	id_Autor INT NOT NULL,
	id_Livro INT NOT NULL,
	
	FOREIGN KEY(id_Autor) references Autor(id_Autor),
	FOREIGN KEY(id_Livro) references Livro(id_Livro));

Create table Reserva(
	id_Reserva INT PRIMARY KEY IDENTITY(1,1),
	Dia_Hora   DATETIME NOT NULL,

	id_Aluno INT NOT NULL,
	id_Livro INT NOT NULL,

	FOREIGN KEY(id_Aluno) references Aluno(id_Aluno),
	FOREIGN KEY(id_Livro) references Livro(id_Livro));

Create table Emprestimo(

	id_Emprestimo INT PRIMARY KEY IDENTITY(1,1),
	Data_Hora      DATE NOT NULL,

	id_Aluno   INT NOT NULL,
	id_Reserva INT NOT NULL,
	id_Func    INT NOT NULL,

	FOREIGN KEY(id_Func) references Funcionario(id_Func),
	FOREIGN KEY(id_Aluno) references Aluno(id_Aluno),
	FOREIGN KEY(id_Reserva) references Reserva(id_Reserva));
