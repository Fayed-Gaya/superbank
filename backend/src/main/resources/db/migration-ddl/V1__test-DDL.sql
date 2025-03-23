-- This is temporary
-- Create a table to store the log message
CREATE TABLE log_messages (
                              id SERIAL PRIMARY KEY,
                              message TEXT,
                              log_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Insert "Hello World" into the log_messages table
INSERT INTO log_messages (message)
VALUES ('Hello World');
