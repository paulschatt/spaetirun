-- required for gen_random_uuid
CREATE EXTENSION pgcrypto;

CREATE TABLE IF NOT EXISTS spaetirun (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name TEXT,
    created_at TIMESTAMP NOT NULL DEFAULT transaction_timestamp()
);

CREATE TABLE IF NOT EXISTS challenge (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name TEXT,
    description TEXT,
    points INTEGER NOT NULL,
    max_times INTEGER,
    spaetirun_id UUID REFERENCES spaetirun(id),
    created_at TIMESTAMP NOT NULL DEFAULT transaction_timestamp()
    );

CREATE TABLE IF NOT EXISTS team (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name TEXT,
    spaetirun_id UUID REFERENCES spaetirun(id),
    created_at TIMESTAMP NOT NULL DEFAULT transaction_timestamp()
);

CREATE TABLE IF NOT EXISTS player (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name TEXT,
    team_id UUID REFERENCES team(id),
    spaetirun_id UUID REFERENCES spaetirun(id),
    created_at TIMESTAMP NOT NULL DEFAULT transaction_timestamp()
);