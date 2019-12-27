SELECT
    CASE
        WHEN
         NOT triangles.A + triangles.B > triangles.C
          THEN
           'Not A Triangle'
        WHEN
         triangles.A = triangles.B AND 
         triangles.A = triangles.C
          THEN
            'Equilateral'
        WHEN
         triangles.A = triangles.B OR 
         triangles.A = triangles.C OR
         triangles.B = triangles.C
          THEN
           'Isosceles'
        WHEN
         NOT triangles.A = triangles.B AND 
         NOT triangles.A = triangles.C
          THEN
           'Scalene'
        
        END AS locale
    FROM
     triangles;
     
# ----

SELECT
    CASE
        WHEN
         occupations.occupation = 'Doctor'
          THEN
           CONCAT(occupations.name, '(D)')
        WHEN
         occupations.occupation = 'Singer'
          THEN
           CONCAT(occupations.name, '(S)')
        WHEN
         occupations.occupation = 'Actor'
          THEN
           CONCAT(occupations.name, '(A)')
        WHEN
         occupations.occupation = 'Professor'
          THEN
           CONCAT(occupations.name, '(P)')
         END AS locale
    FROM occupations
    ORDER BY name;
SELECT CONCAT('There are a total of ',COUNT(occupation), ' ', LOWER(occupation), 's.') 
FROM occupations
GROUP BY occupation
ORDER BY COUNT(occupation);

#-----

SET @r1=0, @r2=0, @r3=0, @r4=0;
SELECT MIN(Doctor), MIN(Professor), MIN(Singer), MIN(Actor)
FROM(
  SELECT
    CASE
        WHEN occupation='Doctor' THEN (@r1:=@r1+1)
        WHEN occupation='Professor' THEN (@r2:=@r2+1)
        WHEN occupation='Singer' THEN (@r3:=@r3+1)
        WHEN occupation='Actor' THEN (@r4:=@r4+1) END AS RowNumber,
    CASE WHEN occupation='Doctor' THEN name END AS Doctor,
    CASE WHEN occupation='Professor' THEN name END AS Professor,
    CASE WHEN occupation='Singer' THEN name END AS Singer,
    CASE WHEN occupation='Actor' THEN name END AS Actor
  FROM occupations
  ORDER BY name
) Temp
GROUP BY RowNumber;

