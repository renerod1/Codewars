-- Create your SELECT statement here
SELECT
    (SELECT MIN(age) FROM people) AS age_min,
    (SELECT MAX(age) FROM people) AS age_max 
FROM people LIMIT 1;