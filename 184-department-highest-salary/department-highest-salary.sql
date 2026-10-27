-- # Write your MySQL query statement below
-- select d.name as Department, e.name as Employee, e.salary as Salary from (
-- select name, salary , departmentId , dense_rank() over (partition by departmentId order by salary desc) as rnk from Employee) e
-- left join Department d on e.departmentId=d.id where rnk=1

Select d.name as Department, e.name as Employee, e.salary as Salary from Employee e left join Department d on d.id=e.departmentId where e.salary = (
    select max(salary) from Employee where departmentId=e.departmentId
) 