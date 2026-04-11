[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/H9OWARAO)
# Minha Resposta

**Aluno**: Thiago Nascente Borges

## Confirando o firewall no aws (grupo de segurança)

  Open the following ports for TCP: 1099, 5678-5679

## Abrindo as máquinas

Dentro da pasta que tenha o arquivo .pem da chave de acesso, abra o terminal.

### windows

```bash
icacls "[nome_da_chave].pem" /inheritance:r
```
> Reseta as permissões e remove a herança de pastas superiores

```bash
icacls "[nome_da_chave].pem" /grant:r "${env:UserName}:R"
```
> Concede permissão de leitura apenas para o seu usuário atual

Depois executar código de conexão do ssh, ainda no bash.

### Linux

Executar código a código das instruções no aws (as vezes vai precisar de sudo).

## Instalando o java:

  sudo apt install default-jdk

## Entrando no diretório e clonando git

``` bash
cd /mnt/efs/fs1
```

``` bash
git clone <link_HTTPS>
```

``` bash
cd exercicio05-javarmi-ThiagoNascente/
```

## Pode-se então compilar e depois executar

  ```bash
  javac example/hello/*.java
  ```
  > Compila tudo

  ```bash
  java example.hello.Server
  java example.hello.NewServer
  ```
  > Abre servidores na máquina 1

  ```bash
  java example.hello.Client <IP_Address_of_Server>
  ```
  > Executa cliente no IP das máquinas hospedeiras.
  
## Obs.:

Os comentários guardam resquícios do código adaptado para funcionar localmente.


