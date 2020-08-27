<h1 align="center">
  Robo (API)
</h1>
<p align="center">
  <img src="https://www.wellesleyfreelibrary.org/wp-content/uploads/2018/02/robot1.png" width="150">
</p>

## Tecnologias utilizadas
>[Back-end](https://github.com/cksar/robo)
>- Spring
>   - Spring Boot
>- Swagger
>- Heroku
>- JUnit

## Endpoints

> ### HEROKU - https://robot-ndd.herokuapp.com/
>- Arms Controller
>    - [GET] /api/arms/elbow/left - Informa a contração atual do cotovelo direito
>    - [PUT] /api/arms/elbow/left/{value} - Atualiza a contração atual do cotovelo direito
>    - [GET] /api/arms/elbow/right - Informa a contração atual do cotovelo esquerdo
>    - [PUT] /api/arms/elbow/right/{value} - Atualiza a contração atual do cotovelo esquerdo
>    - [GET] /api/arms/wrist/left - Informa a rotação atual do pulso direito
>    - [PUT] /api/arms/wrist/left/{value} - Atualiza a rotação atual do pulso direito
>    - [GET] /api/arms/wrist/right - Informa a rotação atual do pulso esquerdo
>    - [PUT] /api/arms/wrist/right/{value} - Atualiza a rotação atual do pulso esquerdo

>- Head Controller
>    - [GET] /api/head/inclination - Informa a inclinação atual da cabeça
>    - [PUT] /api/head/inclination/{value} - Atualiza a inclinação atual da cabeça
>    - [GET] /api/head/rotation - Informa a rotação atual da cabeça
>    - [PUT] /api/head/rotation/{value} - Atualiza a rotação atual da cabeça

> Para mais detalhes: [Documentação (swagger)](http://robot-ndd.herokuapp.com/swagger-ui.html#)