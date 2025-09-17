# 🎮 DSList

API REST para gerenciamento de listas de jogos.  
Projeto desenvolvido em **Java 21** com **Spring Boot 3.5.4**, utilizando **Spring Data JPA**, **PostgreSQL** e **H2 Database** para persistência.  

Este projeto foi criado como parte do **Intensivão Java Spring**, com foco em boas práticas de arquitetura e desenvolvimento backend.

---

## MODELO DE DOMINIO: 
<img width="824" height="290" alt="dslist-model" src="https://github.com/user-attachments/assets/c4060cc6-c1e7-40d2-a99b-71c7db4b8645" />

## 🚀 Tecnologias

- **Java 21**
- **Spring Boot 3.5.4**
  - Spring Web (APIs REST)
  - Spring Data JPA (persistência)
- **PostgreSQL** (produção)
- **H2 Database** (testes/desenvolvimento)
- **JUnit / Spring Boot Test** (testes automatizados)
- **Maven** (build e dependências)
- **Docker** (containerização e deploy)
- **CI/CD** (integração e entrega contínua)

---

## 🏗️ Arquitetura

O projeto segue a arquitetura em camadas:

- **Entities** → mapeamento das tabelas do banco de dados  
- **Repositories** → acesso a dados com Spring Data JPA  
- **Services** → regras de negócio  
- **Controllers** → endpoints REST  

Fluxo: **Controller → Service → Repository → Database**

---

## ⚙️ Como executar

### Pré-requisitos
- [Java 21+](https://adoptium.net/)  
- [Maven](https://maven.apache.org/)  
- [PostgreSQL](https://www.postgresql.org/)  

### Passos
```bash
# Clonar o repositório
git clone https://github.com/Projecoes/dslist.git

# Entrar no diretório
cd dslist

# Executar a aplicação
./mvnw spring-boot:run
```

## 📌 Endpoints 

GET /games → Lista todos os jogos

GET /games/{id} → Retorna os detalhes de um jogo

GET /lists → Retorna as listas criadas

GET /lists/{id}/games → Retorna os jogos de uma lista específica

POST /lists/2/replacement → Muda os jogos das listas de posição


## 📸 Demonstração

GET /games
<img width="1730" height="961" alt="image" src="https://github.com/user-attachments/assets/2acf8fd5-61fa-4979-bb1b-069030e4a041" />

GET /games/{id}
<img width="1757" height="614" alt="image" src="https://github.com/user-attachments/assets/d508d67b-85da-4ea2-a0be-74cea6daceb3" />

GET /lists/
<img width="1141" height="552" alt="image" src="https://github.com/user-attachments/assets/be3e6f74-0598-4f16-aa6a-d7705b81590f" />








