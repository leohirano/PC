# Circulo

Então Jennifer, não lembro o que o rogério falou, e acabo não salvando os Docx.
O código do circulo, que o Rogério passou, mantenha ele do jeito que está,
não há erros nele, mas há uma diferença no meu, que em vez de calcular (raio^raio)
ele simplesmente faz o expoente com pow o algoritmo.

Certo, depois de copiar, o que o rogério pediu é que fizessemos o método main em outra
classe.Porque disso é muito simples, como ele disse, reutilizar código

# Circulo

Então Jennifer, não lembro o que o rogério falou, e acabo não salvando os Docx.
O código do circulo, que o Rogério passou, mantenha ele do jeito que está,
não há erros nele, mas há uma diferença no meu, que em vez de calcular (raio^raio)
ele simplesmente faz o expoente com pow o algoritmo.

Certo, depois de copiar, o que o rogério pediu é que fizessemos o método main em outra
classe.Porque disso é muito simples, como ele disse, reutilizar código.

Desculpa se ali ficou confuso, o notebook estava meio lento para digitar
e me deixou irritado.

Entao voltando, o que o rogério quer é que nós criarmos um objeto que 
vai herdar (acho que não é termo correto) da classe circulo.

Certo, classe circulo criada exatamente como rogério pediu, então
vá em sua IDE (Eclipse ou NetBeans), no package do código crie
uma nova classe, e nela coloque o método Main.

O java ou melhor a Java Virtual Machine, que faz os nossos códigos rodar
Só busca o que esta no Main, se não ta no main, não é lido, isso é bom,
Pois aquela sua classe circulo só será neccessária caso tu invoque, então
a existência dela não atrapalha a performance do programa.

Criou o main, agora é hoje de criar o Objeto, e todo objeto vem de uma classe
então primeiro chama-se a classe em maiusculo "Circulo" e depois o nome que
terá o nosso objeto, o meu é "circo", depois "new" para alocar espaço em
memória e o nome da classe de novo "Circulo" como um método, só que sem
parametros.

Até esse exercício, eu não entendia para que servia os objetos, e nem
como eu criaria classes que não existem no java, mas é simples :
O objeto circo ele tem a capacidade de executar todos os métodos
de sua classe, ele é um filho dela, então se temos diversos calculos
que são realizados em métodos, podemos separar esse bloco dos métodos
que calculam, criar uma classe separada para eles (nesse caso a Circulo),
e na Main onde tudo acontece criamos o Objeto, que pode chamar os métodos 
e realizar os calculos que precisamos sem ficar numa classe bagunçada com 
diversas linhas jogadas.


Depois de criar o objeto, é necessário fazer um calculo teste com ele,
no meu código não fiz entrada de dados, é desnecessário.
"circo.mudaRaio(1);", ele vai armazenar no objeto a resposta de
mudaRaio, que vai passar o número 1.
Se formos olhar o método mudaRaio, vemos que ele é simplesmente um contador
se o raio que entramos como parametro for maior que 0 ele faz, mas os dois If's
praticamente tem a mesma resposta, não entendi o que o rogério quis fazer com isso.
Depois que o objeto circo já tem o 1 quardado nele, é só fazer
circo.area(), que vai usar o 1 armazeado já em circo, e como
a area de um circulo de raio 1 é sempre PI, deixar o valor como 1
garante que o código funciona.

O que eu fiz ali, foi simplesmente criar um outro método para escrever
a reposta de circo.area(), fiz isso para não sobrecarregar o método 
Main, desde a USP Leste, eu fico perturbado com a velocidade do código.

Bom é isso!

Espero que te ajude!


01001111 01101001 00100000 01001010 01100101 01101110 01101110 01101001 01100110 01100101 01110010 00100001 00001010 01000110 01101001 01110001 01110101 01100101 01101001 00100000 01100110 01100101 01101100 01101001 01111010 00100000 01110001 01110101 01100101 00100000 01101110 11100011 01101111 00100000 01110100 01100101 01110110 01100101 00100000 01101101 01100101 01100100 01101111 00100000 01100100 01100101 00100000 01110110 01101001 01110010 00100000 01100110 01100001 01101100 01100001 01110010 00100000 01100011 01101111 01101101 01101001 01100111 01101111 00100000 01110011 01101111 01100010 01110010 01100101 00100000 01101001 01110011 01110011 01101111 00101110 00001010 01001101 01100101 00100000 01110011 01101001 01101110 01110100 01101111 00100000 01101101 01110101 01101001 01110100 01101111 00100000 01100010 01100101 01101101 00100000 01110001 01110101 01100001 01101110 01100100 01101111 00100000 01110100 01110101 00100000 01100110 01101001 01100011 01100001 00100000 01101101 01100001 01101001 01110011 00100000 01100001 00100000 01110110 01101111 01101110 01110100 01100001 01100100 01100101 00100000 01100011 01101111 01101101 01101001 01100111 01101111 00101100 00100000 01100011 01101111 01101110 01100110 01101001 01100001 00100000 01100101 01101101 00100000 01101101 01101001 01101101 00100000 00111010 01000100 00001010 01000001 01110100 11101001 00100000 01001010 01100101 01101110 01101110 01101001 01100110 01100101 01110010 00100001 


S2!





