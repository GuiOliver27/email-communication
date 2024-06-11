# Email Communication

Este projeto consiste em um sistema de mensageria para lidar com cadastro de usuários e envio de e-mails.

## Serviço de Cadastro de Usuários

Este serviço é responsável por receber solicitações POST em "/users" para cadastrar novos usuários. Ele salva os usuários e publica mensagens em um broker de mensagens para notificar outros serviços sobre as novas adições.

## Configuração do Broker de Mensagens

Este serviço é notificado pelo broker de mensagens sobre novos usuários cadastrados. Ele escuta as mensagens, envia e-mails para os usuários e salva os e-mails enviados.

## Serviço de Envio de E-mails

Este serviço é responsável por receber solicitações POST em "/users" para cadastrar novos usuários. Ele salva os usuários e publica mensagens em um broker de mensagens para notificar outros serviços sobre as novas adições.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.2.1
- Spring Data JPA
- RabbitMQ
- Postgrsql
- Cloud AMQP
- Google SMTP
