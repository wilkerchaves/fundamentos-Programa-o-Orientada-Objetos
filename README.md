# Contas bancárias
Implementação simples de contas bancárias utilizando conceitos de Programação Orientada a Objetos utilizando a linguagem de programação Java.

Foram implementadas dois tipos de contas bancárias: conta poupança (SavingsAccount) e conta corrente (BusinessAccount). 
Diferentes detalhes foram implementados para as duas contas:
1) Para conta poupança:
- há uma cobrança de um valor 5.0 por saque;
- há um taxa de juros de rendimento (valor a ser informado na criação da classe)
2) Para conta corrente:
- há um limite de empréstimo para contratação (valor a ser informado na criação da classe);
- há uma cobrança de um valor 10.0 na contratação do empréstimo;


Para ambas as contas, são utilizados informação de agência, número de conta e proprietário.

Durante a instanciação das contas, deve-se informar: 
```
       new BusinessAccount((String) Proprietario, (Double) SaldoInicial,(Double) LimiteDeEmprestimo) 
       new SavingsAccounts((String) Proprietario, (Double) SaldoInicial, (Double) JurosDeRendimento)
       
```
      
Este exemplo implementa conceitos de Orientação a Objetos, Herança, Polimorfismo, Encapsulamento, Exceções na linguagem Java.


