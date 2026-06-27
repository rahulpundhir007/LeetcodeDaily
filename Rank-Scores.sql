1# Write your MySQL query statement below
2select score , DENSE_RANK() Over(
3order by score desc)  as 'rank' from Scores;