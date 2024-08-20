-- # write your SQL statement here: you are given a table 'getcount' with column 'str', return a table with column 'str' and your result in a column named 'res'.
SELECT str, LENGTH(regexp_replace(str, '[^aeiouAEIOU]', '', 'g')) AS res 
FROM getcount;