INSERT INTO testdb.user_store
(
email_id,
password,
role)
VALUES
(
"cash@hospital.com",
123456789,
"cash");
INSERT INTO testdb.user_store
(
email_id,
password,
role)
VALUES
(
"pharma@hospital.com",
123456789,
"pharamcist");
INSERT INTO testdb.user_store
(
email_id,
password,
role)
VALUES
(
"diag@hospital.com",
123456789,
"diagnositics");

SELECT * FROM testdb.patient;INSERT INTO `testdb`.`patient`
(
`ws_pat_adrs`,
`ws_pat_age`,
`ws_pat_city`,
`ws_pat_dob`,
`ws_pat_name`,
`ws_pat_ssn`,
`ws_pat_state`,
`ws_pat_status`,
`ws_pat_type`,
`ws_pat_dod`,
`ws_pat_nod`)
VALUES
("address",
"10",
"Hyderabad",
"2020-02-02",
"Alexandar",
"123456789",
"Telangana",
"Active",
"single Room",
"2020-03-09",
10
);
INSERT INTO `testdb`.`medicines`
(
`ws_med_avail`,
`ws_med_name`,
`ws_med_qty`,
`ws_med_rate`)
VALUES
("Available",
"Paracetemol",
"100",
"10"
);
INSERT INTO `testdb`.`medicines`
(
`ws_med_avail`,
`ws_med_name`,
`ws_med_qty`,
`ws_med_rate`)
VALUES
("Available",
"Crocin",
"100",
"10"
);
INSERT INTO `testdb`.`medicines`
(
`ws_med_avail`,
`ws_med_name`,
`ws_med_qty`,
`ws_med_rate`)
VALUES
("Available",
"Dolo-650",
"100",
"10"
);
INSERT INTO `testdb`.`medicines`
(
`ws_med_avail`,
`ws_med_name`,
`ws_med_qty`,
`ws_med_rate`)
VALUES
("Available",
"Meftal-Spas",
"100",
"10"
);

INSERT INTO `testdb`.`diagnostics`(`ws_diag_name`,`ws_diag_amt`)
VALUES ("CTSCAN", 10000 );

INSERT INTO `testdb`.`diagnostics`(`ws_diag_name`,`ws_diag_amt`)
VALUES ("CBP", 10000 );

INSERT INTO `testdb`.`diagnostics`(`ws_diag_name`,`ws_diag_amt`)
VALUES ("LIPID", 10000 );


INSERT INTO `testdb`.`diagnostics`(`ws_diag_name`,`ws_diag_amt`)
VALUES ("ECG", 10000 );

INSERT INTO `testdb`.`diagnostics`(`ws_diag_name`,`ws_diag_amt`)
VALUES ("ECHO", 10000 );


INSERT INTO `testdb`.`patientdiagnostics`(`ws_diag_amt`,`ws_diag_name`,`ws_pat_id`)
VALUES (10000,"CBP",1);

INSERT INTO `testdb`.`patientdiagnostics`(`ws_diag_amt`,`ws_diag_name`,`ws_pat_id`)
VALUES (10000,"ECG",1);

INSERT INTO `testdb`.`patientmedicines`(`ws_pat_id`,`ws_med_name`,`ws_med_qty`,`ws_med_rate`,`ws_med_amt`)
VALUES (1,"Crocin",10,100,1000);

INSERT INTO `testdb`.`patientmedicines`(`ws_pat_id`,`ws_med_name`,`ws_med_qty`,`ws_med_rate`,`ws_med_amt`)
VALUES (1,"Dolo-650",11,100,1100);