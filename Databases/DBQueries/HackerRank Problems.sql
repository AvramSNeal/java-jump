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