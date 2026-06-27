1# Write your MySQL query statement below
2SELECT p.firstName,p.lastName,a.city,a.state
3from Person p
4left join Address a
5on p.personId = a.personId;