# Write your MySQL query statement below
SELECT p.firstName,p.lastName,
a.city AS city , a.state AS state   
FROM PERSON p LEFT JOIN ADDRESS a
ON p.personId=a.personId;

