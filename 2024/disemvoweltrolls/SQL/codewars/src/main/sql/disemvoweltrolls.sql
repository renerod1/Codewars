-- # write your SQL statement here: you are given a table 'disemvowel' with column 'str', return a table with column 'str' and your result in a column named 'res'.
SELECT str, regexp_replace(str, '[aeiouAEIOU]', '', 'g') AS res 
FROM disemvowel;