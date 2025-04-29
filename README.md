# 📦 **Backend - Biblioteca Virtual**

Este é o backend do projeto Biblioteca Virtual. Ele fornece uma API RESTful para gerenciamento de pedidos, produtos, usuários, etc.

## 🚀 Tecnologias

- Java 21
- Spring Boot
- Spring Web
- Validation
- Spring Data JPA
- MySQL
- Maven

## 📁 Estrutura do Projeto

```
livrovirtual/ 
└── src/ 
└── main/ 
└── java/ 
└── com.bibliotecavirtual.livrovirtual/ 
├── LivrovirtualApplication.java # Classe principal de inicialização da aplicação 
├── controller/ # Camada de controle (API REST) 
│ └── LivroController.java # Endpoints relacionados a livros 
├── dto/ # Data Transfer Objects (DTOs) 
│ └── LivroDTO.java # Objeto de transferência de dados para livros 
├── entity/ # Entidades JPA 
│ └── Livro.java # Entidade de livro, mapeada para o banco de dados 
├── repository/ # Interfaces de acesso ao banco de dados 
│ └── LivroRepository.java # Interface para operações CRUD de livros 
├── service/ # Lógica de negócios 
│ └── LivroService.java # Serviço que manipula dados de livros
```
## ⚙️ Configuração

No arquivo `src/main/resources/application.properties`, configure o banco de dados:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
spring.datasource.username=root
spring.datasource.password=senha
spring.jpa.hibernate.ddl-auto=update
```

## ▶️ **Como rodar**
**Clone o repositório:**
git clone https://github.com/bibliotecavirtual1/biblioteca_virtual-backend.git
cd biblioteca_virtual-backend


**A API estará disponível em: http://localhost:8080**

## 📬 **Endpoints principais**

Método	Rota	Descrição
**POST**	/livrosvirtual	Criar um novo pedido
**GET**	/livrosvirtual	Buscar pedido por ID
**PUT**	/{id}	Atualizar um pedido
**DELETE**	/{id}	Remover um pedido por ID
