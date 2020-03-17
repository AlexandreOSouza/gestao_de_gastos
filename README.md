# API REST para a gestão de gastos

>## Arquitetura do projeto
>### O projeto é separado por serviços. Eles são:
>- GestaoData ( é responsável pela integração das APIs com a base de dados )
>- GastoInclusao ( é responsável pela inclusão e listagem dos gastos )
>- GastoAuth ( é responsável pela autenticação para as APIs )

>## O projeto
>### A API é baseada em microserviços usando springboot, a base de dados é feita com o Redis e a autenticação do usuário é feita através de um token JWT

>## End-points
>### A aplicação até o momento contém dois end-points, um para o cadastro de um novo gasto, e outro para a listagem dos gastos nos últimos 5 segundos.

>## Utilização da API
>### Para utilizar os End-points, primeiro você irá precisar gerar um token na aplicação, para isso faça um request para http://localhost:8081/authorization/login passando um login e senha no corpo da requisição. Ex: `{"login": "foo", "senha": "foo"}`. O retorno será algo como:   `{"token":"eyJhbGciOiJIUzI1NiJ9.eyJ1c3VhcmlvU2lzdGVtYSI6eyJpZCI6MSwibG9naW4iOiJhZG1pbiJ9LCJleHAiOjE1ODQ0NzE5MzMsImlhdCI6MTU4NDQ3MDEzM30.eNMd-IJnu20BHTTXOf2Raa9HQa1XshKQOqKz50pSMdQ"}`
>### Com o token em mãos agora é possível utilizar os End-points para isso no Header utilize `Authorization: demoToken eyJhbGciOiJIUzI1NiJ9.eyJ1c3VhcmlvU2lzdGVtYSI6eyJpZCI6MSwibG9naW4iOiJhZG1pbiJ9LCJleHAiOjE1ODQ0NzE5MzMsImlhdCI6MTU4NDQ3MDEzM30.eNMd-IJnu20BHTTXOf2Raa9HQa1XshKQOqKz50pSMdQ` E faça as requisições para:
>- ### http://localhost:8081/api/novo_gasto passando os dados do novo gasto no corpo da requisição para salvar um novo gasto
>- ### http://localhost:8081/api/listar_gastos?idUsuario=# para listar os gastos é preciso passar o id do usuário como paramêtro
