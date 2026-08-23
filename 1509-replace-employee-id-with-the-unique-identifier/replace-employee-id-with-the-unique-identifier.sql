# Write your MySQL query statement below
SELECT eu.unique_id,
        e.name
        from Employees AS e
        left join EmployeeUNI AS eu
        on e.id=eu.id;