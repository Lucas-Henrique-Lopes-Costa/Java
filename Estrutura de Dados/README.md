# Estrutura de Dados

# Big-O

- Avalia a performance/complexidade de algoritmo em Grande quantidade de dados
- Tipos

    ![Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled.png](Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled.png)

    Ele roda em um tempo ***constante***

    ---

    ![Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%201.png](Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%201.png)

    Ele roda em um tempo LINEAR, porque é dividido por 3

    Em uma pesquisa, por exemplo, ele index por index (lento)

    ---

    ![Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%202.png](Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%202.png)

    ![Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%203.png](Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%203.png)

    ---

    ### O(log a)

    - Ele roda mais rápido o algoritmo

    ![Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%204.png](Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%204.png)

    Comparando com um linear (que busca index por index) o "O(log a)" divide a lista no meio e analisa se o primeiro número está em uma metade ou em outro, a partir disso ele escolhe um e depois repete esse processo até encontrar o que deseja (mais escalável)

    ---

    ### O($2^n$)

    ![Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%205.png](Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%205.png)

    Não é escalável, logo ele é mais lento do que o "O(log a)"

![Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%206.png](Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%206.png)

---

# Space Complexity

- Nele você também utiliza o conceito de ["O" (big O)]()

---

# Array

- Utiliza eles para gravar uma sequência de itens
- Static Array
    - Um Array com o tamanho de "***n*"** elementos, sendo eles indexados, ou seja, ***referenciados com um número.***

    ![Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%207.png](Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%207.png)

    Lembrando que começa no Index "0"

    ![Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%208.png](Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%208.png)

- Dynamic Array
    - Como criar um Dynamic Array ?
        - Criar um Static Array com um determinado número de elementos
        - Depois adicionar elementos nesse Array
            - Dessa forma você ira criar um novo Static Array com mais capacidade (o que já tinha e o que você adicionou)

        ![Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%209.png](Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%209.png)

---

## Linked List

- Lookup

    ![Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%2010.png](Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%2010.png)

- Insert

    ![Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%2011.png](Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%2011.png)

- Delete
    - Apagar o Primeiro

        ![Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%2012.png](Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%2012.png)

    - Apagar o do Meio

        ![Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%2013.png](Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%2013.png)

    - Apagar o Último

        ![Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%2014.png](Estrutura%20de%20Dados%201253a90a348b4f19bc414ed5b4691603/Untitled%2014.png)