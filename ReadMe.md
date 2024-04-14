# Rest API Supplier

## Technologies:
* Java 17
* Spring Boot, MVC
* Spring Data JPA
* MySQL
* Rest API
* Validation
* Exception


### FUNCTIONALITY/FEATURES:
- Приложение  View-RestController-Model-Service-Exception-Repository-MySQL
- Включает в себя:
    - 08.2(Exception1) REST API
    - 08.2(Exception2) REST API
    - 08.3(Exception3) REST API
- Приложение:
    - имеет html-страницу с которой отправляет get-запрос и получает ответ в виде json
    - имеет 3 файла java, посылающие Rest-запросы, заведомо вызывающие exception и с верной информацией для БД
    - принимает post-json-запросы в контроллер: 
      - из Postman
      - из приложения "08.1 REST API Consumer" отправляет ответ в виде json
    - имеет кастомные exception, посылающие json-exception в ответ на не верный запрос несуществующего пользователя, 
  либо попытку добавления пользователя с не проходящими валидацию данными.

- Подключить сервер MySQL, создать таблицу в БД
- Запустить FirstRestAppApplication

## Работа приложения:


* Открыть страницу в браузере http://localhost:8080  
  * на html-странице даны только GET-запросы без тела и описание ответа

## Запустить приложение 08.1 REST API Consumer:

- которое пошлет post-json-запросы, получит json-ответы, выведет в консоль jsons

## Запустить Java-файлы в самом приложении:

- Запустить Request_No_Exception.java, который:
    - отправляет post-запрос и get-запрос из Request_No_Exception на создание и получение пользователя
    - получает обратно в браузер статус 200 ОК 2 раза и состояние в виде json
    - преобразует пользователя в объект класса, выводит в консоль


- Запустить Request_Exception1.java, который:
    - отправляет post-запрос на создание пользователя, который не пройдет валидацию
    - получает обратно описание exception в виде json


- Запустить Request_Exception2.java, который:
    - отправляет get-запрос на получение несуществующего пользователя
    - получает обратно описание exception в виде json
      
## Postman запросы:

### Со статусом без ошибок:
* GET
 
`http://localhost:8080/people/1
http://localhost:8080/people/30
http://localhost:8080/people/`

* POST

`http://localhost:8080/people/new
{
"name": "Nina",
"age": "20",
"email": "nina1999@gmail.com"
}`

`http://localhost:8080/people/correct/4
{
"name": "Nina",
"age": "30",
"email": "nina1999@gmail.com"
}`

* DELETE

`http://localhost:8080/people/4
{
"name": "Nina",
"age": "30",
"email": "nina1999@gmail.com"
}
`

### Со статусом ошибки:

* GET

`http://localhost:8080/people/30`

* POST

`http://localhost:8080/people/new
{
"name": "Nina",
"age": "200",
"email": "nina1999@gmail.com"
}`

`http://localhost:8080/people/new
{
"name": "Nina",
"age": "20",  
"email": "nina1999.gmail.com"
}`

`http://localhost:8080/people/correct/4
{
"name": "Nina",
"age": "500",
"email": "nina1999@gmail.com"
}`

* DELETE

`http://localhost:8080/people/4
{
"name": "Nina",
"age": "40",
"email": "nina1999@gmail.com"
}`


### Additional info
