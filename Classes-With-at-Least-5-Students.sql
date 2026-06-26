1# Write your MySQL query statement below
2select class 
3from courses
4group by class
5-- order by count(student) desc
6having count(class)>=5;
7