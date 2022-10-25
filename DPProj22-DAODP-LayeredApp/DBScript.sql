-- MOVIE_TICKET_BOOKING Table
CREATE TABLE "SYSTEM"."MOVIE_TICKET_BOOKING" 
   	("TICKET_ID" NUMBER NOT NULL ENABLE, 
	"CUST_NAME" VARCHAR2(20 BYTE), 
	"TICKET_COUNT" NUMBER, 
	"TYPE" VARCHAR2(20 BYTE), 
	"SEAT_NO" VARCHAR2(20 BYTE), 
	"BILL_AMOUNT" FLOAT(126), 
	CONSTRAINT "MOVIE_TICKET_BOOKING_PK" PRIMARY KEY ("TICKET_ID"));

-- TICKET_ID_SEQ
CREATE SEQUENCE  "SYSTEM"."TICKET_ID_SEQ"  MINVALUE 1000 MAXVALUE 2000 INCREMENT BY 1 START WITH 1000 CACHE 20 NOORDER  NOCYCLE;