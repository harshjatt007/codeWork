# Write your MySQL query statement below
select name from SalesPerson where name not in (
select a.name from SalesPerson a left join Orders b on a.sales_id=b.sales_id left join Company c on c.com_id=b.com_id where c.name = 'RED')