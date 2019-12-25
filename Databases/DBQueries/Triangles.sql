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
     triangles