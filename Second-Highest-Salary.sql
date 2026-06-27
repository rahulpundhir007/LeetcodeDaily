1# Write your MySQL query statement below
2
3 select (SELECT distinct salary as SecondHighestSalary from Employee
4order by salary desc
5limit 1
6OFFSET 1) as SecondHighestSalary;
7