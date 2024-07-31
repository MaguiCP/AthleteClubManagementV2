# Athlete Club Management System V2 (Sistema de Gestão de Clube de Atletas V2)

### Português

## Descrição

Este projeto é a segunda versão de um sistema de gestão de clube de atletas. Permite gerir modalidades, atletas, equipas e competições internas e externas. O sistema possibilita a adição de novas modalidades, registo de atletas, criação de equipas, e gestão de competições, além de listar competições e calcular custos associados.

### Funcionalidades

- Adicionar modalidades ao clube.
- Registar atletas e associá-los a equipas.
- Criar e gerir equipas internas e externas.
- Criar e associar competições internas e externas.
- Listar todas as competições, tanto internas quanto externas.
- Calcular o custo de inscrições para competições externas.
- Ordenar competições por data de início.
- Identificar equipas externas que necessitam de alojamento.

### Melhorias

O código agora utiliza exceções personalizadas para garantir a validade dos dados inseridos:

- **`ExcecaoNIF`:** Esta exceção é lançada para validar o número de identificação fiscal (NIF).
- **`ExcecaoAlfabetoEspaco`:** Esta exceção garante que um campo de texto contenha apenas letras e espaços.
- **`ExcecaoCC`:** Esta exceção verifica a validade de um número de cartão de cidadão (CC).
- **`ExcecaoNumeroPositivo`:** Esta exceção assegura que um número fornecido seja positivo.

Além disso, o código agora divide as competições em internas e externas:

- **Competição Interna:** Representa competições realizadas dentro do clube, permitindo a adição de equipas internas e fornecendo uma descrição detalhada das competições.
- **Competição Externa:** Representa competições realizadas fora do clube, incluindo a gestão de equipas externas e a associação de equipas internas, além de calcular os custos de inscrição.

### English

## Description

This project is the second version of an athlete club management system. It allows managing sports, athletes, teams, and internal and external competitions. The system enables adding new sports, registering athletes, creating teams, and managing competitions, in addition to listing competitions and calculating associated costs.

### Features

- Add sports to the club.
- Register athletes and associate them with teams.
- Create and manage internal and external teams.
- Create and associate internal and external competitions.
- List all competitions, both internal and external.
- Calculate registration costs for external competitions.
- Sort competitions by start date.
- Identify external teams that require accommodation.

### Improvements

The code now uses custom exceptions to ensure the validity of the input data:

- **`ExcecaoNIF:`** This exception is thrown to validate the tax identification number (NIF).
- **`ExcecaoAlfabetoEspaco:`** This exception ensures that a text field contains only letters and spaces.
- **`ExcecaoCC:`** This exception checks the validity of an identity card number (CC).
- **`ExcecaoNumeroPositivo:`** This exception ensures that a provided number is positive.

Additionally, the code now divides competitions into internal and external:

- **Internal Competition:** Represents competitions held within the club, allowing the addition of internal teams and providing a detailed description of the competitions.
- **External Competition:** Represents competitions held outside the club, including the management of external teams and the association of internal teams, as well as calculating registration costs.
