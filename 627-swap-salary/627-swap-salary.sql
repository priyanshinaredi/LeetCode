# Write your MySQL query statement below

UPDATE salary
SET sex= CASE sex
WHEN 'm' then 'f'
WHEN 'f' then 'm'
END 
