[![NPM](https://img.shields.io/npm/l/react)](https://github.com/lucarauj/LiveCoding-CRUD-Java-Spring/blob/main/LICENSE)

<h1 align="center">Live Coding API Rest:</h1>
<h2 align="center">CRUD Java Spring</h2>

<p align="center"><img width="300px" src="https://github.com/lucarauj/assets/blob/main/Spring.png" /></p>

<br>  

## Dependências:

- Spring Web
- Spring Data JPA
- PostgreSQL Driver
- Flyway Migration
- Validation
- Lombok

<br>

## Implementei:

- Criação do pacote repositories;
- Criação do pacote services com criação da classe ProductService, tratando a criação, atualizações e exclusões nesta classe;
- Finalização do tratamento de exceções;

<br>

## Anotações:

- @AllArgsConstructor: fornece a criação de um construtor com todos os atributos;
- @Autowired: Utilizada para injetar dependências automaticamente em uma classe, permitindo que você obtenha uma instância de uma classe necessária sem criar manualmente;
- @DeleteMapping: usada para mapear solicitações HTTP DELETE em métodos manipuladores específicos;
- @Entity: utilizada para informar que uma classe também é uma entidade;
- @EqualsAndHashCode: fornece os métodos equals() e hashCode();
- @ExceptionHandler: responsável por definir um tratamento para exceções específicas;
- @GetMapping: usada para mapear solicitações HTTP GET em métodos manipuladores específicos;
- @GeneratedValue(strategy = GenerationType.UUID): indica que a geração do valor do identificador único da entidade será gerenciada pelo provedor de persistência, utilizando a estratégia UUID;
- @Getter: fornece os métodos getters para atributos privados;
- @Id: especifica o identificador da entidade, que é usado ao carregar a entidade em um determinado contexto de persistência;
- @NoArgsConstructor: responsável por gerar um construtor sem parâmetros;
- @NotBlank: valida se o campo se encontra vazio ou nulo;
- @NotNull: usada para validar que um atributo não seja nulo;
- @PostMapping: usada para mapear solicitações HTTP POST em métodos específicos de manipulador;
- @PutMapping: usada para mapear solicitações HTTP PUT em métodos específicos de manipulador;
- @PathVariable: indica que o valor da variável virá de uma informação da rota;
- @RestController: Usada para marcar uma classe como um controller no padrão MVC (Model-View-Controller) do Spring;
- @RequestMapping: Especifica a URL que um método do controlador irá manipular;
- @RestControllerAdvice:  É usado para definir um componente global que trata exceções lançadas por controladores REST;
- @RequestBody: Usada para injetar o body de uma requisição nos parâmetros do método do controller que foi chamado para tratar essa requisição;
- @Setter: fornece os métodos setters para atributos privados;
- @Service: faz anotações de classes na camada de serviço;
- @Table: usada para especificar a tabela principal da entidade atualmente anotada;
- @Transactional: utilizada nos métodos que precisam de transação;
- @Valid: indica que o objeto será validado tendo como base as anotações de validação atribuídas aos campos;

<br>

## 👨‍🎓 Aluno

#### Lucas Araujo

<a href="https://www.linkedin.com/in/lucarauj"><img alt="lucarauj | LinkdeIN" width="40px" src="https://user-images.githubusercontent.com/43545812/144035037-0f415fc7-9f96-4517-a370-ccc6e78a714b.png" /></a>
