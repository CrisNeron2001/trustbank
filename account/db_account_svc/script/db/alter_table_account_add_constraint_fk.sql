ALTER TABLE IF EXISTS account 
ADD CONSTRAINT fk_user_account_user_id 
FOREIGN KEY (user_id)
REFERENCES user_trustbank(user_id);