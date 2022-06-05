<h3>Avaliação I – PB 2022 – Springboot / UNICESUMAR – Compass.uol<h3>
1. Baseado no Scrum Guide, qual o tempo máximo deveriam ter as seguintes cerimônias:


  a. Daily:  15 minutos

  b. Planning: 8 horas

  c. Review: 4 horas

  d. Retrospectiva: 3 horas

2. José iniciou sua jornada recentemente com git e não está conseguindo publicar seu arquivo README e a classe Product.js que acabou de criar. O erro do git dá a seguinte informação:

Untracked Files:
README

Product.js

Por que esse “erro” de “Untracked files” ocorreu e qual comando resolveria o problema?

​	Esse erro ocorreu porque os arquivos foram criados no repositório local do José mas não foram adicionados no git. Em outras palavras, o git "enxerga" os arquivos mas o versionamento ainda não está ativo. A partir do comando git add os arquivos podem ser rastreados, entram na "Staged Zone" e tornam-se disponíveis para serem comitados a partir do comando git commit -m. Caso o usuário não queira adicionar os arquivos no git, pode ser usado o comando git clean para remover os "Untracked files".

3. O time de desenvolvimento analisou e descobriu que o projeto está gerando arquivos pesados e desnecessários para serem commitados no repositório git. Em qual arquivo você deve incluir a lista de extensões para que esses arquivos desnecessários sejam desconsiderados?**

​	Para que os arquivos desnecessários sejam desconsiderados deve-se incluir no arquivo .gitignore.

4. Com suas palavras, descreva as vantagens de utilizar o Scrum no seu projeto.

​	Dentro do contexto da definição de Scrum, framework simples para gerenciamento de projetos complexos, três pilares fundamentais são encontrados: transparência dos processos, requisitos de entrega e status (andamento do projeto); inspeção constante de tudo que está sendo feito (seja na *Daily* ou no *Review*); adaptação do processo e das mudanças ocorridas ao longo do projeto. Além dos pilares fundamentais, papeis básicos (Scrum Master; Product Owner; Dev Team), eventos básicos (planejamento e execução do Sprint, reuniões diárias - Daily, revisão e retrospectiva do Sprint ) e os artefatos gerados (Product Backlog, Sprint Backlog e Incremendo/Entrega) são encontrados.  Assim sendo, o método Scrum faz parte das Metodologias Ágeis que tem por objetivo otimizar o tempo de entrega do trabalho e qualidade do produto que está sendo desenvolvido. Uma das vantagens da utilização do Scrum quando comparado às metodologias tradicionais é sua estrutura flexível que permite maior liberdade no planejamento das ações; rápida adaptação perante mudanças; maior satisfação dos clientes e diminuição de suas expectativas; maior comunicação entre os membros do time; trabalho em equipe onde todos contribuem para o todo; status do desenvolvimento individual transparente a todos membros; erros, falhas e defeitos podem ser encontrados durante todo o ciclo, entre outras. 

5. José foi promovido de seu cargo anterior e se tornou o novo Product Owner do time, quais são suas novas responsabilidades como PO?

​	O *Product Owner* é o ponto central de liderança sobre o produto, sendo o  responsável por direcionar o projeto de acordo com a necessidade do cliente e das demais partes interessadas. Assim, José tem como novas responsabilidades: definir metas e criar uma visão para projetos de desenvolvimento; gerenciamento da lista de pendências do produto; priorização das necessidades; supervisionamento das etapas de desenvolvimento; antecipação das necessidades do cliente; atuar como vínculo e ponto de referência do projeto; avaliação do andamento do produto em cada iteração; entre outras.