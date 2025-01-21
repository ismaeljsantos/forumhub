# FórumHub

FórumHub é uma API REST desenvolvida com Spring Boot para gerenciar tópicos de discussão. Esta API permite criar, visualizar, atualizar e excluir tópicos, além de implementar autenticação básica.

## Requisitos

- Java 17 ou superior
- Maven 3.6 ou superior

## Configuração do Projeto

### Passo 1: Clone o Repositório

Clone o repositório para o seu ambiente local:

```sh
git clone git@github.com:ismaeljsantos/forumhub.git
cd forumhub
```

### Passo 2: Configurar o Banco de Dados
A aplicação está configurada para usar o banco de dados H2 em memória para desenvolvimento. Você pode alterar a configuração do banco de dados no arquivo src/main/resources/application.properties.

### Passo 3: Compilar e Executar
Para compilar e executar o projeto, use o Maven:
```sh
mvn clean install
mvn spring-boot:run
```
### Uso da API
A API expõe as seguintes rotas para gerenciar tópicos de discussão:

#### Criar um Novo Tópico
```URL
POST /api/topics
```
- Corpo da requisição (JSON):
```json lines
{
    "title": "Título do Tópico",
    "content": "Conteúdo do Tópico"
}
```
#### Mostrar Todos os Tópicos
```URL
GET /api/topics
```
#### Mostrar um Tópico Específico
```URL
GET /api/topics/{id}
```
### Atualizar um Tópico
```sh
PUT /api/topics/{id}
```
- Corpo da requisição (JSON):

```json
{
"title": "Novo Título do Tópico",
"content": "Novo Conteúdo do Tópico"
}
```
#### Eliminar um Tópico
```URL 
DELETE /api/topics/{id}
```
## Autenticação e Autorização
A API está configurada com autenticação básica HTTP. Para acessar as rotas, use as seguintes credenciais:

 - Usuário: `user`

 - Senha: `password`

Você pode ajustar as configurações de segurança no arquivo `src/main/java/com/forumhub/security/SecurityConfig.java`.

### Contribuindo
Se você quiser contribuir com o projeto, siga estes passos:

Faça um fork do repositório.

Crie uma nova branch (`git checkout -b feature/nova-funcionalidade`).

Commit suas alterações (`git commit -am 'Adiciona nova funcionalidade'`).

Push para a branch (`git push origin feature/nova-funcionalidade`).

Abra um Pull Request.