# Втора лабораториска вежба по Софтверско инженерство
<h2> Рената Димоска, бр. на индекс 176002 </h2>
<h3> Група на код: </h3>
<p> Ја добив групата на код 1. </p>
<h3> Control Flow Graph </h3>

![](/images/graf.png)

<h3> Цикломатска комплексност </h3>
<p> Цикломатската комплексност на овој код е 11, истата ја добив преку формулата V(G) = P + 1, каде што P е бројот на предикатни јазли. Во случајов P=10, па цикломатската комплексност изнесува 11. Цикломатската комплексност, исто така се пресметува и како V(G) = R, каде R e бројот на региони, во овој случај 11, и како V(G) = E - N + 2, каде Е е бројот на врски, а N се јазлите. Па цикломатската комплексност би била V(G) = 29E - 20N + 2 = 11. </p>
<h3> Тест случаи според критериумот Every statement </h3>

![](/images/statement.png)

<p> Every statement методот налага да се генерираат test cases кои овозможуваат тестирање на секоја наредба, односно секој statement од кодот. </p>
<h3> Тест случаи според критериумот Every path </h3>
<p> Овој метод е уште потемелен и погенерален од Every statement методот. Цел на овој метод е да се изминат сите можни патеки, и секоја патека претставува единствена секвенца од програмски јазли кои се извршуваат од даден test case.
Тука се сите патеки кои се извршуваат од test cases: </p>
<ol>
  <li> 1,2, 19; </li>
  <li> 1,2, 3, 19; </li>
  <li> 1,2, 3, 4, 19; </li>
  <li> 1,2, 3, 4, 5, 19; </li>
  <li> 1,2, 3, 4, 5, 6, 7.1, 7.2, (8,9,10,11,12,13,14,7.3,7.2), 15, 16, 17, 18, 19; </li>
  <li> 1,2, 3, 4, 5, 6, 7.1, 7.2, (8,10,11,13,14,7.3,7.2), 15, 16, 17, 18, 19; </li>
  <li> 1,2, 3, 4, 5, 6, 7.1, 7.2, 15, 16, 17, 18, 19; </li>
  <li> 1,2, 3, 4, 5, 6, 7.1, 7.2, (8,10,13,14,7.3,7.2), 15, 18, 19; </li></ol>
  

