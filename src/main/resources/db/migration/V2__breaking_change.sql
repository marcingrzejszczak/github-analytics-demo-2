-- This change is backward incompatible - you can't do A/B testing
ALTER TABLE ISSUES CHANGE repository repo VARCHAR(255);