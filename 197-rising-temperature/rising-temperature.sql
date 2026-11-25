# Write your MySQL query statement below

SELECT today.id
FROM Weather today
JOIN Weather yesterday
ON Datediff(today.recordDate,yesterday.recordDate)=1
WHERE today.temperature > yesterday.temperature;