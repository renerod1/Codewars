-- # write your SQL statement here: you are given a table 'booltoword' with column 'bool', return a table with column 'bool' and your result in a column named 'res'.
SELECT bool, (CASE bool WHEN TRUE THEN 'Yes' ELSE 'No' END) AS res 
FROM booltoword;