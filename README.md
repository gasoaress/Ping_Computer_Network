# Ping Network - Verificação de Conectividade

Este projeto Java realiza o ping em computadores de uma rede específica para verificar se eles estão conectados à internet. Ele percorre um intervalo de endereços IP, formata-os e, em seguida, faz a verificação da conectividade. O resultado é `true` se o computador estiver online e `false` caso contrário.

## Estrutura do Código

O código é composto pelos seguintes componentes principais:

### 1. **Atribuição de IPs**
   A função `AtribuirIps` cria um array de 254 endereços IP, começando por um valor inicial (`intitAddress`) fornecido no código. Esses IPs são os que serão verificados.

### 2. **Formatação de IPs**
   A função `IpFormmater` formata os números inteiros em strings no formato de endereços IP válidos. Ela leva em conta o limite de 254 hosts e converte a sequência de números inteiros para o padrão de IPs.

### 3. **Verificação de Conectividade**
   A função `SearchAddress` realiza o ping em cada endereço IP formatado. Ela utiliza a classe `InetAddress` para verificar se o IP está acessível dentro de um tempo máximo configurado.

## Como Funciona

- **Entrada de IP Inicial**: O código começa com um endereço IP inicial fictício (`intitAddress = 100001`) e incrementa esse valor para gerar um total de 254 IPs.

- **Formatação**: Os números são convertidos para o formato de IP, onde cada grupo de números é inserido com pontos (`.`).

- **Ping**: O código faz ping em cada IP formatado, e retorna `true` ou `false` dependendo da resposta de cada máquina.

- **Saída**: Para cada IP verificado, o resultado da busca é impresso no console, indicando se o endereço IP está acessível ou não.

## Como Executar

1. **Clonar o repositório**:

   ```bash
   git clone <link-do-repositorio>
2. **Compilar o Código**:
   
   ```bash
   javac Ping.java
3. **Executar o Progama**:

   ```bash
   java Ping

