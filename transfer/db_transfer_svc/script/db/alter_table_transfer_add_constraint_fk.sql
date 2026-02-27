ALTER TABLE IF EXISTS ledger
ADD CONSTRAINT fk_account_ledger_account_id 
FOREIGN KEY (account_id)
REFERENCES account(account_id);