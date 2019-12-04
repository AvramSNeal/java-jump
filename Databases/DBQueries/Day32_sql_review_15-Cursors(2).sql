-- Stored Functions
-- perform an operation and return a single value
-- they take in parameters and are by default in variables,
-- cannot be set as out or inout
​
​
delimiter $$
create function funcExample(x1 int, x2 int)
returns int
deterministic
begin
	declare ans int;
    set ans = x1 * x2;
    return ans;
end $$
​
delimiter ;

-- deterministic
select funcExample(2, 3);

-- non-deterministic
select now();