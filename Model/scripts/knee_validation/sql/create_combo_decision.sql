
  CREATE TABLE "DEVELOPER"."COMBO_KNEE_DECISION" 
   (	"PTCPNT_VET_ID" NUMBER(*,0) NOT NULL ENABLE, 
	"PRFIL_DT" DATE NOT NULL ENABLE, 
	"INACTV_DT" DATE, 
	"SYSTEM_TYPE_CD" VARCHAR2(12 BYTE), 
	"RATING_DECN_ID" NUMBER(*,0), 
	"POA" VARCHAR2(200 BYTE), 
	"PRMLGN_DT" DATE, 
	"RATING_DT" DATE, 
	"VBMS_R_IND" VARCHAR2(1 BYTE), 
	"JRSDTN_TXT" VARCHAR2(50 BYTE), 
	"RATING_RCVD_DT" DATE, 
	"STATION_NUMBER" NUMBER NOT NULL ENABLE, 
	"STATION_NAME" VARCHAR2(100 BYTE) NOT NULL ENABLE, 
	"MILITARY_SVC_PERIOD_CODE" VARCHAR2(12 BYTE), 
	"MILITARY_SVC_PERIOD_DESC" VARCHAR2(250 BYTE), 
	"RATING_DECN_TYPE_CD" VARCHAR2(15 BYTE), 
	"RATING_DECN_TYPE_DESC" VARCHAR2(50 BYTE), 
	"NARRATIVE_CODESHEET_IND" VARCHAR2(1 BYTE), 
	"ISSUE_TXT" VARCHAR2(2048 BYTE), 
	"DECN_TXT" VARCHAR2(2048 BYTE), 
	"DSBLTY_DECN_TYPE_CD" VARCHAR2(12 BYTE), 
	"DSBLTY_DECN_TYPE_DESC" VARCHAR2(50 BYTE), 
	"DSBLTY_DECN_BASIS_TYPE_CD" VARCHAR2(12 BYTE), 
	"DSBLTY_DECN_BASIS_TYPE_DESC" VARCHAR2(50 BYTE), 
	"BLATRL_TYPE_CD" VARCHAR2(12 BYTE), 
	"BLATRL_TYPE_DESC" VARCHAR2(50 BYTE), 
	"DIAGNOSIS_CODE" VARCHAR2(12 BYTE), 
	"DIAGNOSIS_DESCRIPTION" VARCHAR2(250 BYTE), 
	"DSBLTY_ID" NUMBER(*,0), 
	"DSBLTY_DT" DATE, 
	"DGNSTC_TXT" VARCHAR2(300 BYTE), 
	"RELATD_DSBLTY_ID" NUMBER(*,0), 
	"RELATD_DSBLTY_DT" DATE, 
	"RELATD_DGNSTC_TXT" VARCHAR2(300 BYTE), 
	"FULL_DGNSTC_TXT" VARCHAR2(617 BYTE), 
	"SPLMTL_DECN_TYPE_CD" VARCHAR2(12 BYTE), 
	"HYPNTD_DGNSTC_TYPE_CD" VARCHAR2(12 BYTE), 
	"SHED_TYPE_CD" VARCHAR2(12 BYTE), 
	"PRGRPH_TYPE_CD" VARCHAR2(12 BYTE), 
	"PRCNT_NBR" VARCHAR2(10 BYTE), 
	"MAJOR_IND" VARCHAR2(1 BYTE), 
	"COMBAT_IND" VARCHAR2(1 BYTE), 
	"PREV_EVALTN_IND" VARCHAR2(1 BYTE), 
	"BEGIN_DT" DATE, 
	"END_DT" DATE, 
	"FUTURE_EXAM_DT" DATE, 
	"STATIC_IND" VARCHAR2(1 BYTE), 
	"ANCILY_DECN_TYPE_CD" VARCHAR2(12 BYTE), 
	"ANCILY_DECN_TYPE_DESC" VARCHAR2(50 BYTE), 
	"CMPTNY_DECN_TYPE_CD" VARCHAR2(12 BYTE), 
	"CMPTNY_DECN_TYPE_DESC" VARCHAR2(50 BYTE), 
	"DENTAL_SVC_CNECTD_IND" VARCHAR2(1 BYTE), 
	"INDVDL_UNEMPL_DECN_TYPE_CD" VARCHAR2(12 BYTE), 
	"INDVDL_UNEMPL_DECN_TYPE_DESC" VARCHAR2(50 BYTE), 
	"PERMNT_TOTAL_DECN_TYPE_CD" VARCHAR2(12 BYTE), 
	"PERMNT_TOTAL_DECN_TYPE_DESC" VARCHAR2(50 BYTE), 
	"SC_DEATH_DECN_TYPE_CD" VARCHAR2(12 BYTE), 
	"SC_DEATH_DECN_TYPE_DESC" VARCHAR2(50 BYTE), 
	"SMP_DECN_TYPE_CD" VARCHAR2(12 BYTE), 
	"SMP_DECN_TYPE_DESC" VARCHAR2(50 BYTE), 
	"SPECL_PRVSN_LAW_DECN_TYPE_CD" VARCHAR2(12 BYTE), 
	"SPECL_PRVSN_LAW_DECN_TYPE_DESC" VARCHAR2(50 BYTE), 
	"SMC_TYPE_CD" VARCHAR2(12 BYTE), 
	"SMC_TYPE_DESC" VARCHAR2(50 BYTE), 
	"HSPTL_SMC_TYPE_CD" VARCHAR2(12 BYTE), 
	"HSPTL_SMC_TYPE_DESC" VARCHAR2(50 BYTE), 
	"LOSS_USE_TYPE_CD" VARCHAR2(12 BYTE), 
	"LOSS_USE_TYPE_DESC" VARCHAR2(50 BYTE), 
	"ANTMCL_LOSS_TYPE_CD" VARCHAR2(12 BYTE), 
	"ANTMCL_LOSS_TYPE_DESC" VARCHAR2(50 BYTE), 
	"OTHER_LOSS_TYPE_CD" VARCHAR2(12 BYTE), 
	"OTHER_LOSS_TYPE_DESC" VARCHAR2(50 BYTE), 
	"SMC_PRGRPH_KEY_CD" VARCHAR2(12 BYTE), 
	"SMC_PRGRPH_TXT" VARCHAR2(2000 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 COMPRESS FOR OLTP NOLOGGING
  STORAGE(INITIAL 1048576 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "VBMS_TS" ;
 

   COMMENT ON TABLE "DEVELOPER"."COMBO_KNEE_DECISION"  IS 'snapshot table for snapshot ADHOC_DMT_RECURR.COMBO_KNEE_DECISION';
 

  CREATE INDEX "DEVELOPER"."IX_KNEE_DECISION_01" ON "DEVELOPER"."COMBO_KNEE_DECISION" ("PTCPNT_VET_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "INDEX_TS" ;
 

  CREATE INDEX "SYS"."IX_KNEE_DECISION_01" ON "DEVELOPER"."COMBO_KNEE_DECISION" ("DIAGNOSIS_CODE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "INDEX_TS" ;
 

  CREATE INDEX "DEVELOPER"."IX_KNEE_DECISION_02" ON "DEVELOPER"."COMBO_KNEE_DECISION" ("PRFIL_DT") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "INDEX_TS" ;
 

  CREATE INDEX "DEVELOPER"."IX_KNEE_DECISION_10" ON "DEVELOPER"."COMBO_KNEE_DECISION" ("SYSTEM_TYPE_CD") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "INDEX_TS" ;
 

  CREATE INDEX "DEVELOPER"."IX_KNEE_DECISION_11" ON "DEVELOPER"."COMBO_KNEE_DECISION" ("BEGIN_DT") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "INDEX_TS" ;
 

  CREATE INDEX "DEVELOPER"."IX_KNEE_DECISION_12" ON "DEVELOPER"."COMBO_KNEE_DECISION" ("END_DT") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "INDEX_TS" ;
 

  CREATE INDEX "DEVELOPER"."IX_KNEE_DECISION_13" ON "DEVELOPER"."COMBO_KNEE_DECISION" ("DSBLTY_DECN_TYPE_CD") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "INDEX_TS" ;
 

  CREATE INDEX "DEVELOPER"."IX_KNEE_DECISION_16" ON "DEVELOPER"."COMBO_KNEE_DECISION" ("PRMLGN_DT") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "INDEX_TS" ;
 

  CREATE INDEX "DEVELOPER"."IX_KNEE_DECISION_19" ON "DEVELOPER"."COMBO_KNEE_DECISION" ("PREV_EVALTN_IND") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "INDEX_TS" ;
 

  CREATE INDEX "DEVELOPER"."IX_KNEE_DECISION_20" ON "DEVELOPER"."COMBO_KNEE_DECISION" ("DSBLTY_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "INDEX_TS" ;
 
