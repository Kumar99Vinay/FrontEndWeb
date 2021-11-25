-- create a procedure to get all emps with dept detail
USE MYDB;
DELIMITER $$

CREATE PROCEDURE GetEmpCountByJob(IN jb VARCHAR(20) ,OUT COUNTER INT)
BEGIN
   SELECT COUNT(*)
   INTO counter
   FROM MYDB.EMP WHERE JOB=JB;
   
END$$
DELIMITER ;

CALL GETEMPCOUNTBYJOB('MANAGER',@total_emps);
SELECT @total_emps as counter;

SELECT COUNT(*)
    FROM MYDB.EMP WHERE JOB='MANAGER';








   