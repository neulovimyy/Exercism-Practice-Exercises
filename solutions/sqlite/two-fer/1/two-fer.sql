-- Schema: CREATE TABLE "twofer" ("input" TEXT, "response" TEXT);
-- Task: update the twofer table and set the response based on the input.

update twofer set response = 'One for ' || 
case 
    when input = '' then 'you' 
        else input 
end || ', one for me.';