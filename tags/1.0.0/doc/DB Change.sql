Alter TABLE PURCHASE_SUBCTGY
add INSPECTOR          INTEGER;

ALTER TABLE PURCHASE_SUBCTGY 
    ADD FOREIGN KEY (INSPECTOR) REFERENCES OA_USER (USER_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

Alter table CAPEX_REQUEST
add	 ACTIVITY           VARCHAR(50)            NOT NULL Default 'Ceramics';
Alter table CAPEX_REQUEST
add    POST_AUDIT_DATE	  TIMESTAMP;
Alter table CAPEX_REQUEST
add    FIRST_EXP_DATE     TIMESTAMP;
Alter table CAPEX_REQUEST
add    LAST_EXP_DATE      TIMESTAMP;
Alter table CAPEX_REQUEST
add    COMPLEATION_DATE   TIMESTAMP;
Alter table CAPEX_REQUEST
add    PROJ_LEADER_ID     INTEGER;
Alter table CAPEX_REQUEST
add    ACCOUNTING_CD      VARCHAR(32);
Alter table CAPEX_REQUEST
add    IS_CAPEX_TYPE      INTEGER                NOT NULL Default 0;
Alter table CAPEX_REQUEST 
add    IS_ASSET_TYPE      INTEGER                NOT NULL Default 0;
Alter table CAPEX_REQUEST 
add    OTHER_TYPE         VARCHAR(100);
Alter table CAPEX_REQUEST 
add    IS_NEW_IMP_REASON  INTEGER                NOT NULL Default 0;
Alter table CAPEX_REQUEST 
add    IS_CPT_INC_REASON  INTEGER                NOT NULL Default 0;
Alter table CAPEX_REQUEST 
add    IS_CST_IMP_REASON  INTEGER                NOT NULL Default 0;
Alter table CAPEX_REQUEST 
add    IS_NEW_PDT_REASON  INTEGER                NOT NULL Default 0;
Alter table CAPEX_REQUEST 
add    IS_DOWNSIZ_REASON  INTEGER                NOT NULL Default 0;
Alter table CAPEX_REQUEST 
add    IS_HSE_REASON      INTEGER                NOT NULL Default 0;
Alter table CAPEX_REQUEST 
add    OTHER_REASON       VARCHAR(100);
Alter table CAPEX_REQUEST
add    CAPEX_CAPITAL_AMT  NUMERIC(14,2)          NOT NULL Default 0.00;
Alter table CAPEX_REQUEST
add    OTHER_EXPENSE_AMT  NUMERIC(14,2)          NOT NULL Default 0.0;
Alter table CAPEX_REQUEST
add    ASSET_DISPOSAL_AMT NUMERIC(14,2)          NOT NULL Default 0.0;
Alter table CAPEX_REQUEST
add    GROSS_BOOK_AMT     NUMERIC(14,2)          NOT NULL Default 0.0;
Alter table CAPEX_REQUEST
add    PROJ_IMPCT_NON1    VARCHAR(100);
Alter table CAPEX_REQUEST
add    PROJ_IMPCT_NON2    VARCHAR(100);
Alter table CAPEX_REQUEST
add    PROJ_IMPCT_OTHER1  VARCHAR(100);
Alter table CAPEX_REQUEST
add    PROJ_IMPCT_OTHER2  VARCHAR(100);
Alter table CAPEX_REQUEST
add    PROJ_IMPCT_OTHER3  VARCHAR(100);
Alter table CAPEX_REQUEST
add    REF_CURR_CD        VARCHAR(8)             NOT NULL Default 'EUR';
Alter table CAPEX_REQUEST 
add    REF_EXCHANGE_RATE  NUMERIC(11,4)          NOT NULL Default 0.00;
Alter table CAPEX_REQUEST
add    LST_FORECAST_AMT   NUMERIC(14,2);
Alter table CAPEX_REQUEST
add    DISCOUNT_CASH_FLOW NUMERIC(9,2);
Alter table CAPEX_REQUEST
add    NPV_LC             NUMERIC(14,2);
Alter table CAPEX_REQUEST
add    INTERNAL_RTN_RATE  NUMERIC(5,2);
Alter table CAPEX_REQUEST
add    DISCOUNT_RATE      NUMERIC(5,2);  

ALTER TABLE CAPEX_REQUEST                                                                     
    ADD FOREIGN KEY (PROJ_LEADER_ID) REFERENCES OA_USER (USER_ID) ON DELETE RESTRICT ON UPDATE RESTRICT
    ADD FOREIGN KEY (REF_CURR_CD) REFERENCES CURRENCY (CURR_CD) ON DELETE RESTRICT ON UPDATE RESTRICT; 

Alter table CAPEX_REQUEST
add    PROJ_LEADER_TITLE  VARCHAR(100);


drop table CAPEX;

CREATE TABLE CAPEX
(
   CAPEX_NO           VARCHAR(16)            NOT NULL,
   CAPEX_SITE         SMALLINT               NOT NULL,
   PUR_CTGY_ID        INTEGER,
   PUR_SUBCTGY_ID     INTEGER,
   BASE_CURR_CD       VARCHAR(8)             NOT NULL,
   BUDGET_ID          INTEGER,
   CAPEX_REQ_ID       INTEGER,
   ROW_VERSION        INTEGER                NOT NULL,
   CAPEX_ACTUALAMT    NUMERIC(14,2)          NOT NULL,
   PRIMARY KEY (CAPEX_NO)
);

ALTER TABLE CAPEX
    ADD FOREIGN KEY (CAPEX_SITE) REFERENCES SITE (SITE_ID) ON DELETE RESTRICT ON UPDATE RESTRICT
    ADD FOREIGN KEY (PUR_CTGY_ID) REFERENCES PURCHASE_CTGY (PUR_CTGY_ID) ON DELETE RESTRICT ON UPDATE RESTRICT
    ADD FOREIGN KEY (PUR_SUBCTGY_ID) REFERENCES PURCHASE_SUBCTGY (PUR_SUBCTGY_ID) ON DELETE RESTRICT ON UPDATE RESTRICT
    ADD FOREIGN KEY (BASE_CURR_CD) REFERENCES CURRENCY (CURR_CD) ON DELETE RESTRICT ON UPDATE RESTRICT
    ADD FOREIGN KEY (CAPEX_REQ_ID) REFERENCES CAPEX_REQUEST (CAPEX_REQ_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;
    
ALTER TABLE CAPEX_DEPARTMENT
    ADD FOREIGN KEY (CAPEX_NO) REFERENCES CAPEX (CAPEX_NO) ON DELETE RESTRICT ON UPDATE RESTRICT;
    
ALTER TABLE CAPEX_REQUEST
    ADD FOREIGN KEY (CAPEX_NO) REFERENCES CAPEX (CAPEX_NO) ON DELETE RESTRICT ON UPDATE RESTRICT;
    
ALTER TABLE PURCHASE_REQUEST
    ADD FOREIGN KEY (PR_CAPEX_NO) REFERENCES CAPEX (CAPEX_NO) ON DELETE RESTRICT ON UPDATE RESTRICT;   

ALTER TABLE capex_request_approver
    ADD your_turn_date TIMESTAMP;

ALTER TABLE capex_request_approver
    ADD email_date TIMESTAMP;

ALTER TABLE capex_request_approver
    ADD email_times INTEGER;
    
ALTER TABLE expense_approver
    ADD your_turn_date TIMESTAMP;

ALTER TABLE expense_approver
    ADD email_date TIMESTAMP;

ALTER TABLE expense_approver
    ADD email_times INTEGER;
    
ALTER TABLE po_approver
    ADD your_turn_date TIMESTAMP;

ALTER TABLE po_approver
    ADD email_date TIMESTAMP;

ALTER TABLE po_approver
    ADD email_times INTEGER;
    
ALTER TABLE pr_approver
    ADD your_turn_date TIMESTAMP;

ALTER TABLE pr_approver
    ADD email_date TIMESTAMP;

ALTER TABLE pr_approver
    ADD email_times INTEGER;
    
ALTER TABLE ta_approver
    ADD your_turn_date TIMESTAMP;

ALTER TABLE ta_approver
    ADD email_date TIMESTAMP;

ALTER TABLE ta_approver
    ADD email_times INTEGER;
    
DROP TABLE EMAIL;

CREATE TABLE EMAIL
(
   EMAIL_ID           INTEGER                NOT NULL GENERATED BY DEFAULT AS IDENTITY,
   MAIL_FR            VARCHAR(100)           NOT NULL,
   MAIL_TO            VARCHAR(100)           NOT NULL,
   SUBJECT            VARCHAR(100)           NOT NULL,
   BODY               VARCHAR(3600),
   CREATE_TIME        TIMESTAMP              NOT NULL,
   SEND_TIME          TIMESTAMP,
   FAIL_COUNT         INTEGER                NOT NULL DEFAULT 0,
   SITE								SMALLINT							 NOT NULL,
   WAIT_TO_SEND       INTEGER                NOT NULL DEFAULT 1,
   PRIMARY KEY (EMAIL_ID)
);

ALTER TABLE expense
    ADD EMAIL_DATE  TIMESTAMP;
    
ALTER TABLE expense
    ADD EMAIL_TIMES INTEGER NOT NULL DEFAULT 0;
   
ALTER TABLE hotel
    ADD EMAIL_DATE  TIMESTAMP;
    
ALTER TABLE hotel
    ADD EMAIL_TIMES INTEGER NOT NULL DEFAULT 0;
    
ALTER TABLE purchase_request
    ADD EMAIL_DATE  TIMESTAMP;
    
ALTER TABLE purchase_request
    ADD EMAIL_TIMES INTEGER NOT NULL DEFAULT 0;
    
ALTER TABLE supplier
    ADD EMAIL_DATE  TIMESTAMP;
    
ALTER TABLE supplier
    ADD EMAIL_TIMES INTEGER NOT NULL DEFAULT 0;

ALTER TABLE travel_application
    ADD EMAIL_DATE  TIMESTAMP;
    
ALTER TABLE travel_application
    ADD EMAIL_TIMES INTEGER NOT NULL DEFAULT 0;
    
ALTER TABLE purchase_order
    ADD EMAIL_DATE  TIMESTAMP;
    
ALTER TABLE purchase_order
    ADD EMAIL_TIMES INTEGER NOT NULL DEFAULT 0;
    
ALTER TABLE purchase_order
    ADD APPROVE_DATE TIMESTAMP;
    
ALTER TABLE purchase_order
		ADD confirmer INTEGER;
		
ALTER TABLE purchase_order
	ADD FOREIGN KEY (CONFIRMER) REFERENCES OA_USER (USER_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;
	
ALTER TABLE capex
	ADD CAPEX_YEAR INTEGER NOT NULL DEFAULT 2006;
	
ALTER TABLE HOTEL
	ADD HOTEL_EMAIL		  VARCHAR(150);

ALTER TABLE HOTEL
	ADD HOTEL_CONTACT      VARCHAR(100);
	
ALTER TABLE HOTEL_ROOM
	ADD ROOM_BREAKFAST     VARCHAR(100);

Alter table HOTEL Alter column HOTEL_NM set data type VARCHAR(500);
Alter table HOTEL Alter column HOTEL_ADDR set data type VARCHAR(500);
Alter table HOTEL Alter column HOTEL_DESC set data type VARCHAR(500);
Alter table HOTEL Alter column HOTEL_TELE set data type VARCHAR(50);
Alter table HOTEL Alter column HOTEL_FAX set data type VARCHAR(50);
Alter table HOTEL Alter column HOTEL_CONTACT set data type VARCHAR(150);
Alter table HOTEL Alter column HOTEL_EMAIL set data type VARCHAR(100);

Alter table HOTEL_ROOM Alter column ROOM_NM set data type VARCHAR(500);
Alter table HOTEL_ROOM Alter column ROOM_DESC set data type VARCHAR(1000);
Alter table HOTEL_ROOM Alter column ROOM_BREAKFAST set data type VARCHAR(255);

Drop table CAPEX_REQUEST_APPROVER;
Drop table EXPENSE_APPROVER;
Drop table PO_APPROVER;
Drop table PR_APPROVER;
Drop table SYSTEM_LOG;
Drop table TA_APPROVER;

CREATE TABLE CAPEX_REQUEST_APPROVER
(
   LIST_ID            VARCHAR(32)            NOT NULL,
   APPROVER_ID        INTEGER                NOT NULL,
   APPROVE_SEQ        SMALLINT               NOT NULL,
   APPROVE_STATUS     INTEGER                NOT NULL,
   APPROVE_DATE       TIMESTAMP,
   APPROVE_COMMENT    VARCHAR(255),
   CAN_MODIFY         INTEGER                NOT NULL,
   ACTUAL_APPROVER    INTEGER,
   YOUR_TURN_DATE     TIMESTAMP,
   EMAIL_DATE     TIMESTAMP,
   EMAIL_TIMES      INTEGER                NOT NULL DEFAULT 0,
   PRIMARY KEY (LIST_ID, APPROVER_ID)
);

CREATE TABLE EXPENSE_APPROVER
(
   LIST_ID            VARCHAR(32)            NOT NULL,
   APPROVER_ID        INTEGER                NOT NULL,
   APPROVE_SEQ        SMALLINT               NOT NULL,
   APPROVE_STATUS     INTEGER,
   APPROVE_DATE       TIMESTAMP,
   APPROVE_COMMENT    VARCHAR(255),
   CAN_MODIFY         INTEGER                NOT NULL,
   ACTUAL_APPROVER    INTEGER,
   YOUR_TURN_DATE     TIMESTAMP,
   EMAIL_DATE     TIMESTAMP,
   EMAIL_TIMES      INTEGER                NOT NULL DEFAULT 0,
   PRIMARY KEY (LIST_ID, APPROVER_ID)
);

CREATE TABLE PO_APPROVER
(
   LIST_ID            VARCHAR(32)            NOT NULL,
   APPROVER_ID        INTEGER                NOT NULL,
   APPROVE_SEQ        SMALLINT               NOT NULL,
   APPROVE_STATUS     INTEGER                NOT NULL,
   APPROVE_DATE       TIMESTAMP,
   APPROVE_COMMENT    VARCHAR(255),
   CAN_MODIFY         INTEGER                NOT NULL,
   ACTUAL_APPROVER    INTEGER,
   YOUR_TURN_DATE     TIMESTAMP,
   EMAIL_DATE     TIMESTAMP,
   EMAIL_TIMES      INTEGER                NOT NULL DEFAULT 0,
   PRIMARY KEY (LIST_ID, APPROVER_ID)
);

CREATE TABLE PR_APPROVER
(
   LIST_ID            VARCHAR(32)            NOT NULL,
   APPROVER_ID        INTEGER                NOT NULL,
   APPROVE_SEQ        SMALLINT               NOT NULL,
   APPROVE_STATUS     INTEGER,
   APPROVE_DATE       TIMESTAMP,
   APPROVE_COMMENT    VARCHAR(255),
   CAN_MODIFY         INTEGER                NOT NULL,
   ACTUAL_APPROVER    INTEGER,
   YOUR_TURN_DATE     TIMESTAMP,
   EMAIL_DATE     TIMESTAMP,
   EMAIL_TIMES      INTEGER                NOT NULL DEFAULT 0,
   PRIMARY KEY (LIST_ID, APPROVER_ID)
);

CREATE TABLE SYSTEM_LOG
(
   LOG_ID             INTEGER                NOT NULL GENERATED BY DEFAULT AS IDENTITY,
   SITE_ID            SMALLINT               NOT NULL,
   OBJECT             VARCHAR(50)            NOT NULL,
   OBJ_ID             VARCHAR(255)           NOT NULL,
   ACTION             VARCHAR(50)            NOT NULL,
   KEY_FIELD          VARCHAR(255),
   ACTION_TIME        TIMESTAMP              NOT NULL,
   USER_ID            INTEGER,
   PRIMARY KEY (LOG_ID)
);

CREATE TABLE TA_APPROVER
(
   LIST_ID            VARCHAR(32)            NOT NULL,
   APPROVER_ID        INTEGER                NOT NULL,
   APPROVE_SEQ        SMALLINT               NOT NULL,
   APPROVE_STATUS     INTEGER                NOT NULL,
   APPROVE_DATE       TIMESTAMP,
   APPROVE_COMMENT    VARCHAR(255),
   CAN_MODIFY         INTEGER                NOT NULL,
   ACTUAL_APPROVER    INTEGER,
   YOUR_TURN_DATE     TIMESTAMP,
   EMAIL_DATE     TIMESTAMP,
   EMAIL_TIMES      INTEGER                NOT NULL DEFAULT 0,
   PRIMARY KEY (LIST_ID, APPROVER_ID)
);

ALTER TABLE CAPEX_REQUEST_APPROVER
    ADD FOREIGN KEY (APPROVER_ID) REFERENCES OA_USER (USER_ID) ON DELETE RESTRICT ON UPDATE RESTRICT
    ADD FOREIGN KEY (ACTUAL_APPROVER) REFERENCES OA_USER (USER_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE EXPENSE_APPROVER
    ADD FOREIGN KEY (APPROVER_ID) REFERENCES OA_USER (USER_ID) ON DELETE RESTRICT ON UPDATE RESTRICT
    ADD FOREIGN KEY (ACTUAL_APPROVER) REFERENCES OA_USER (USER_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE PO_APPROVER
    ADD FOREIGN KEY (APPROVER_ID) REFERENCES OA_USER (USER_ID) ON DELETE RESTRICT ON UPDATE RESTRICT
    ADD FOREIGN KEY (ACTUAL_APPROVER) REFERENCES OA_USER (USER_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE PR_APPROVER
    ADD FOREIGN KEY (APPROVER_ID) REFERENCES OA_USER (USER_ID) ON DELETE RESTRICT ON UPDATE RESTRICT
    ADD FOREIGN KEY (ACTUAL_APPROVER) REFERENCES OA_USER (USER_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE SYSTEM_LOG
    ADD FOREIGN KEY (SITE_ID) REFERENCES SITE (SITE_ID) ON DELETE RESTRICT ON UPDATE RESTRICT
    ADD FOREIGN KEY (USER_ID) REFERENCES OA_USER (USER_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE TA_APPROVER
    ADD FOREIGN KEY (APPROVER_ID) REFERENCES OA_USER (USER_ID) ON DELETE RESTRICT ON UPDATE RESTRICT
    ADD FOREIGN KEY (ACTUAL_APPROVER) REFERENCES OA_USER (USER_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;	
	
ALTER TABLE SITE
	ADD SITE_ACTIVITY      VARCHAR(50)     NOT NULL DEFAULT 'Ceramics';
	
-- 2006-5-11
ALTER TABLE TRAVEL_APPLICATION
	ADD TA_FEE             NUMERIC(14,2)          NOT NULL DEFAULT 0;
	
--2006-6-7
alter table customer alter column cust_cd set data type varchar(17)
alter table AIR_TICKET_RECHARGE alter column cust_cd set data type varchar(17)
alter table EXPENSE_RECHARGE alter column cust_cd set data type varchar(17)
alter table PO_ITEM_RECHARGE alter column cust_cd set data type varchar(17)
alter table PR_ITEM_RECHARGE alter column cust_cd set data type varchar(17)

2006-7-4
CREATE TABLE EMAIL_BATCH
(
   EMAIL_BATCH_ID     INTEGER                NOT NULL GENERATED BY DEFAULT AS IDENTITY,
   MAIL_TO_USER		  INTEGER				 NOT NULL,
   BODY               CLOB(2M)               NOT LOGGED NOT COMPACT,
   TEMPLATE_NAME	  VARCHAR(100)           NOT NULL,
   SITE				  SMALLINT				 NOT NULL,
   IS_SEND			  INTEGER                NOT NULL,
   PRIMARY KEY (EMAIL_BATCH_ID)
);

2006-7-15
INSERT INTO OA_FUNCTION (FUNC_ID, FUNC_NM, FUNC_DESC) VALUES (32210150, 'purchase travel application', 'purchase travel application');
update role_function set FUNC_ID=32210150 where ROLE_ID=28;
update menu set FUNC_ID=32210150 where MENU_ID=332;
delete from OA_FUNCTION where func_id=22210150;
update ROLE set ROLE_TYPE=3 where ROLE_ID=28;
delete from user_role where role_id=28;

2006-7-23
alter table EMAIL_BATCH add REF_NO	  		  VARCHAR(16);

2006-7-30
ALTER TABLE CAPEX_REQUEST_ATTACH ALTER COLUMN FILE_NAME SET DATA TYPE VARCHAR ( 255 );
ALTER TABLE EXPENSE_ATTACH ALTER COLUMN FILE_NAME SET DATA TYPE VARCHAR ( 255 );
ALTER TABLE PO_ATTACH ALTER COLUMN FILE_NAME SET DATA TYPE VARCHAR ( 255 );
ALTER TABLE PO_ITEM_ATTACH ALTER COLUMN FILE_NAME SET DATA TYPE VARCHAR ( 255 );
ALTER TABLE PR_ATTACH ALTER COLUMN FILE_NAME SET DATA TYPE VARCHAR ( 255 );
ALTER TABLE PR_ITEM_ATTACH ALTER COLUMN FILE_NAME SET DATA TYPE VARCHAR ( 255 );

2006-8-21
delete from user_role where role_id = 69;
update role set ROLE_TYPE=3 where role_id=69;

2006-8-26
ALTER TABLE AIR_TICKET ADD BOARDING_PASS_RECEIVED INTEGER NOT NULL DEFAULT 1;
update air_ticket set BOARDING_PASS_RECEIVED = (select is_on_travel from travel_application where air_ticket.ta_no = travel_application.ta_no);
ALTER TABLE SUPPLIER ADD SUPP_COUNTRY SMALLINT NOT NULL DEFAULT 1;
update supplier set SUPP_COUNTRY = (select COUNTRY.COUNTRY_ID from CITY, PROVINCE, COUNTRY where  supplier.SUPP_CITY = CITY.CITY_ID and CITY.PROVINCE_ID = PROVINCE.PROVINCE_ID and PROVINCE.COUNTRY_ID = COUNTRY.COUNTRY_ID);
ALTER TABLE SUPPLIER_HISTORY ADD SUPP_COUNTRY SMALLINT NOT NULL DEFAULT 1;
update supplier_history set SUPP_COUNTRY = (select COUNTRY.COUNTRY_ID from CITY, PROVINCE, COUNTRY where  supplier_history.SUPP_CITY = CITY.CITY_ID and CITY.PROVINCE_ID = PROVINCE.PROVINCE_ID and PROVINCE.COUNTRY_ID = COUNTRY.COUNTRY_ID);

2006-9-11
CREATE TABLE KPI_SUMMARY(   KPI_SUMMARY_ID     INTEGER                NOT NULL GENERATED BY DEFAULT AS IDENTITY,   SUMMARY_DATE       TIMESTAMP              NOT NULL,   LOGIN_USER_COUNT   INTEGER                NOT NULL DEFAULT 0,   TA_CLOSED          INTEGER                NOT NULL DEFAULT 0,   AVG_TA_CLOSED_DAYS NUMERIC(9,2)           NOT NULL DEFAULT 0,   TA_CREATED         INTEGER                NOT NULL DEFAULT 0,   CAPEX_CLOSED       INTEGER                NOT NULL DEFAULT 0,   AVG_CE_CLOSED_DAYS NUMERIC(9,2)           NOT NULL DEFAULT 0,   CAPEX_CREATED      INTEGER                NOT NULL DEFAULT 0,   PR_CLOSED          INTEGER                NOT NULL DEFAULT 0,   AVG_PR_CLOSED_DAYS NUMERIC(9,2)           NOT NULL DEFAULT 0,   PR_CREATED         INTEGER                NOT NULL DEFAULT 0,   EXPENSE_CLOSED     INTEGER                NOT NULL DEFAULT 0,   AVG_EX_CLOSED_DAYS NUMERIC(9,2)           NOT NULL DEFAULT 0,   EXPENSE_CREATED    INTEGER                NOT NULL DEFAULT 0,   PRIMARY KEY (KPI_SUMMARY_ID));
CREATE TABLE KPI_SUM_PURCTGY(   KPI_SUM_PURCTGY_ID INTEGER                NOT NULL GENERATED BY DEFAULT AS IDENTITY,    KPI_SUMMARY_ID     INTEGER                NOT NULL,    SITE_ID            SMALLINT               NOT NULL,   SUMMARY_DATE       TIMESTAMP              NOT NULL,   PR_CATEGRY_ID      INTEGER                NOT NULL,   PR_CREATED         INTEGER                NOT NULL DEFAULT 0,   PRIMARY KEY (KPI_SUM_PURCTGY_ID));
CREATE TABLE KPI_SUM_EXPCTGY(   KPI_SUM_EXPCTGY_ID INTEGER                NOT NULL GENERATED BY DEFAULT AS IDENTITY,    KPI_SUMMARY_ID     INTEGER                NOT NULL,    SITE_ID            SMALLINT               NOT NULL,   SUMMARY_DATE       TIMESTAMP              NOT NULL,   EXP_REQ_CATEGRY_ID INTEGER                NOT NULL,   EXP_REQ_CREATED    INTEGER                NOT NULL DEFAULT 0,   PRIMARY KEY (KPI_SUM_EXPCTGY_ID));
ALTER TABLE HOTEL ADD HOTEL_SPEC VARCHAR(500);
ALTER TABLE CAPEX_REQUEST ADD APPROVE_DATE       TIMESTAMP;

2006-12-25
INSERT INTO OA_FUNCTION (FUNC_ID, FUNC_NM, FUNC_DESC) VALUES (22230011, 'final claim expense', 'final claim expense');
INSERT INTO ROLE (ROLE_ID, ROLE_NM, ROLE_DESC, ROLE_TYPE) VALUES (73, 'Finance (Expensen Final Claim)', NULL, 2);
INSERT INTO ROLE_FUNCTION (ROLE_ID, FUNC_ID) VALUES (73, 22230011);
INSERT INTO MENU (MENU_ID, MENU_NM, MENU_DESC, FUNC_ID, URL, PARENT_ID, ONCLICK, ONMOUSE_OVER, ONMOUSE_DOWN, SEC_MENU_NM, SEC_MENU_DESC) VALUES (346, 'Expense Final Claim', NULL, 22230011, 'listExpense_finalClaim', 34, NULL, NULL, NULL, 'Expense Final Claim', NULL);

2006-12-30
ALTER TABLE PO_ITEM ADD DESCRIPTION VARCHAR ( 24 );
ALTER TABLE EXPENSE ADD CONFIRM_DATE TIMESTAMP;
ALTER TABLE PURCHASE_ORDER ADD CONFIRM_DATE TIMESTAMP;

2007-01-10
ALTER TABLE HOTEL_ROOM ADD ROOM_NETWORK VARCHAR ( 255 );
UPDATE HOTEL_ROOM SET ROOM_NETWORK = ROOM_DESC;
UPDATE HOTEL_ROOM SET ROOM_DESC = NULL;
ALTER TABLE SUPPLIER ADD LAST_MODIFY_DATE TIMESTAMP;