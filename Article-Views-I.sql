1# Write your MySQL query statement below
2SELECT  DISTINCT author_id  as id from Views 
3where author_id = viewer_id
4order by author_id;
5