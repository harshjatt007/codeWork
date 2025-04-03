# Write your MySQL query statement below
with all_ids as (
    Select requester_id as id
    from RequestAccepted
    union all 
    Select accepter_id as id
    from RequestAccepted 
)
Select id,COUNT(id) as num
from all_ids 
group by id
order by count(id) desc
limit 1
