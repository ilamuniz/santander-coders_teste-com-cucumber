# Selenium / Webdriver - Teste com Cucumber

### Programa Santander Coders 2022
___
Trilha - Automação de Testes

Módulo VII: Selenium / Webdriver
___
### Atividade avaliativa utilizando o Cucumber

**Aplicação testada:** Schedule (agenda)

**Definição:**

A empresa "Agenda ada" esta lançando um novo aplicativo para o mercado. Esse aplicativo é uma agenda para o controle de atividade de seus usuários. Nessa agenda teremos a possibilidade de cadastrar atividades a serem executadas e destinar essas atividades à um usuário em especifico. E, essa atividade cadastrada, deve ser concluída e manter a data de encerramento.
Para termos um lançamos tranquilo no mercado vamos automatizar os testes, visando um aumento de qualidade. Para essa automação devemos utilizar Selenium na parte de páginas da web e Cucumber + RestAssured no parte da API.

**Tarefas:**

1. editar
- A descrição da tarefa é opcional e pode ser preenchida em um segundo momento utilizando o verbo PUT. // eu quero adicionar uma descrição à tarefa
- O usuário, a qual destina-se a atividade, também pode ser alterado. // eu quero alterar o usuário
- Após a conclusão de uma tarefa, essa pode ser encerrada chamando o PUT da API e trocando o taskStatus para CLOSE. // eu quero encerrar uma tarefa
- Nenhuma tarefa encerrada pode sofrer qualquer alteração. // eu quero editar uma tarefa encerrada
- Não deve ser possível apagar uma atividade já cadastrada. Permanecerá para histórico.

2. registrar
- Todas as tarefas recém cadastradas devem ter o taskStatus igual a OPEN. // eu quero registrar uma nova tarefa com taskStatus OPEN
- Não deve ser possível cadastrar uma tarefa com taskStatus igual a CLOSE. // eu quero registrar uma tarefa com taskStatus CLOSE
- A tarefa deve estar vinculada a um usuário. Esse vinculo acontece no payload de criação. // eu quero registrar uma tarefa sem usuário
- Toda tarefa cadastrada deve ter a informação de title preenchida, sendo essa uma informação obrigatória. // eu quero registrar uma tarefa sem título
- Ao encerrar uma tarefa deve ser registrado a data em closedAt.

**Repositório de referência da aplicação testada:** https://github.com/WilliamCesarSantos/schedule