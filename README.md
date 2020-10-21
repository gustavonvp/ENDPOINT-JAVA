# ENDPOINT-JAVA
ENDPOINT JAVA - MONGODB - MAVEN - SPRING     (POSTMAN --> Requisições)

### Para Rodar o Projeto - https://github.com/collab-uniba/socialcde4eclipse/wiki/How-to-import-a-GitHub-project-into-Eclipse --> TUTORIAL CLONAR PROJETO NO ECLIPSE (JAVA)
### Rodar com Spring Boot App -https://spring.io/guides/gs/spring-boot/ --> Tutorial de iniciar projeto com Spring Boot


:telephone:
Tal Algoritmo, possue conexão com banco de dados MONGODB, onde registra tabela de FOLHA DE PAGAMENTOS, com dados do FUNCIONARIO

:computer:
Podemos utilizar este endpoint para testar regras de negócio, 'policys' de certos serviços que serão implementados com uso de objetos

:bomb:
Utilizar certos 'Designer Patterns, para facilitar a implementação de serviços de maneira ágil sem necessidade de frontend muito elaborado
:pencil2:
Exemplo na aplicação: Padrão de Interface e Polimorfismo

:orange_book:
Possível Designer Pattern a se adotar com extensão da aplicação, como exemplo uma fábrica de funcionários e suas respectivas folhas de pagamento:

###Factory Method

:question:
A imagem abaixo é um exemplo de uma rota com restrição de idade, aplicado no postman (payload) para validar requisições com este ENDPOINT
:question:

https://github.com/gustavonvp/ENDPOINT-JAVA/blob/master/src/main/resources/templates/RangeIdade.PNG?raw=true

:gift:
Rota padrão retornar todos funcionários (/funcionarios) --> no Browser --> retorna JSON
