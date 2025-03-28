# Sistema de Controle de Versão

## Configuração inicial para uso do Git
Configure seu nome e email (usado para identificar o autor dos commits):
> - git config −−global user.name "Seu Nome Completo"
> - git config −−global user.email "seu−email@example.com"

## Criando Personal Access Token (PAT) no GitHub

GitHub não aceita mais autenticação via
senha para acesso via linha de comando
Somente por Personal Access Token (PAT)
Acesse https://github.com/settings/tokens
Ao criar o token marque a permissão
para repo.  

Como na imagem abaixo:  

![DUKE](token.png)

## Salvar em cache as credenciais do PAT

Para não ter que digitar o token a cada operação via linha de comando, é
possível usar o credential helper do git
-   Irá armazenar as credenciais na memória por 15 minutos  
> git config −−global credential.helper cache
-   Caso queira armazenar por mais tempo, use (irá armazenar por 1 hora)  
> git config −−global credential.helper 'cache −−timeout=3600'