1# Write your MySQL query statement below
2 select (SELECT num 
3from MyNumbers 
4group by num
5having count(num)=1
6order by  num desc
7limit 1) as num;