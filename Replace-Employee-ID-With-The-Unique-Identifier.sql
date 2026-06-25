1# Write your MySQL query statement below
2select u.unique_id ,e.name
3from Employees e
4LEFT JOIN
5EmployeeUNI u
6on u.id  = e.id;
7
8
9