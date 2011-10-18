Trabalho Final de Banco de Dados II
===================================

Rastreabilidade
---------------

Criar um banco de dados com rastreabilidade.  Isso significa: manter os
dados e nunca deletar um registro *fisicamente*, garantindo a segurança
do dados.

Deve haver uma tabela com todos os dados e, por exemplo, duas colunas
com _data modificação_, _status_ e _usuário que modificou_.  Essas 
colunas podem ser preenchidas usando triggers. 

Para o usuário que irá operar o sistema, deve ser mostrada uma visão,
com as colunas de controle de rastreabilidade ocultas.


Deve haver um usuário administrador com permissão para alterar a tabela,
e os usuários normais só podem ver e alterar a visão.

