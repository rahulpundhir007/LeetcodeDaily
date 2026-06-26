1# Write your MySQL query statement below
2 SELECT (customer_number) from orders
3 group by (customer_number)
4 order by count(customer_number) desc
5 LIMIT 1;
6
7
8
9