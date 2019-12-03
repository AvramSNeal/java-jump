-- Data Control Language (DCL)
-- used to control privileges in a database
-- users are granted read/write access to be able to view and/or manipulate data
​
# USER
​
-- create a user
create user 'blue123' identified by '123';

# GRANT

-- grant access to sql_review database
-- read access
grant select on sql_review.* to 'blue123';
​
-- read/write access
grant all on sql_review.* to 'blue123';
​
​
-- grant access to all databases to user
grant all on *.* to 'blue123';
​
​
# REVOKE
​
-- revoke access to all databases
-- will run, even if there is an error
revoke all on *.* from 'blue123';
​
​
-- show grants/permissions for current user
show grants for current_user();
​
​
# delete a user
# drop user 'blue123';
​
​