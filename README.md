# alura-forum-spring-boot-rest

### Código criado nas aulas sobre criação de uma API REST utilizando Spring Boot. 

* Banco de dados H2 (em memória). Verificar o arquivo `/src/resources/data.sql` para os registros que são inseridos ao subir a aplicação.
* Para autenticar, enviar uma requisição POST para o endpoint `/auth` com o seguinte payload:
```
{
	"email": "aluno@email.com",
	"senha": 123456
}
```
* A documentação da API pode ser acessada no endereço [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html).
