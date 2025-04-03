# Write your MySQL query statement below
Select "Low Salary" as category,
    sum(income<20000) as accounts_count
    from Accounts
Union 
Select "Average Salary" as category,
    sum(income between 20000 and 50000 ) as accounts_count
    from Accounts
Union
Select "High Salary" as category,
    sum(income>50000) as accounts_count
    from Accounts