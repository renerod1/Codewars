--your statment goes here--
SELECT yr, (CASE (yr % 100) WHEN 0 THEN yr / 100 ELSE (yr / 100) + 1 END) AS century FROM years;