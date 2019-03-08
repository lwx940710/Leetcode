# Write your MySQL query statement below
SELECT a.Name AS Employee
FROM Employee a
WHERE a.Salary > (SELECT b.Salary FROM Employee b WHERE a.ManagerID = b.Id)