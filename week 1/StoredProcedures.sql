CREATE OR REPLACE PROCEDURE DisplayMessage
AS
BEGIN
    DBMS_OUTPUT.PUT_LINE('Hello from Procedure');
END;
/

EXEC DisplayMessage;