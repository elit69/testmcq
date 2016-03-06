/*
Navicat PGSQL Data Transfer

Source Server         : local
Source Server Version : 90305
Source Host           : localhost:5432
Source Database       : testmcq
Source Schema         : public

Target Server Type    : PGSQL
Target Server Version : 90305
File Encoding         : 65001

Date: 2016-03-06 22:50:51
*/


-- ----------------------------
-- Sequence structure for definition_id_seq
-- ----------------------------
DROP SEQUENCE "public"."definition_id_seq";
CREATE SEQUENCE "public"."definition_id_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;
SELECT setval('"public"."definition_id_seq"', 1, true);

-- ----------------------------
-- Sequence structure for keyword_id_seq
-- ----------------------------
DROP SEQUENCE "public"."keyword_id_seq";
CREATE SEQUENCE "public"."keyword_id_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;

-- ----------------------------
-- Sequence structure for subject_id_seq
-- ----------------------------
DROP SEQUENCE "public"."subject_id_seq";
CREATE SEQUENCE "public"."subject_id_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;

-- ----------------------------
-- Table structure for definition
-- ----------------------------
DROP TABLE IF EXISTS "public"."definition";
CREATE TABLE "public"."definition" (
"id" int4 DEFAULT nextval('definition_id_seq'::regclass) NOT NULL,
"keyword_id" int4 NOT NULL,
"definition" varchar COLLATE "default" NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of definition
-- ----------------------------
INSERT INTO "public"."definition" VALUES ('1', '1', 'asdfa');

-- ----------------------------
-- Table structure for keyword
-- ----------------------------
DROP TABLE IF EXISTS "public"."keyword";
CREATE TABLE "public"."keyword" (
"id" int4 DEFAULT nextval('keyword_id_seq'::regclass) NOT NULL,
"key" varchar COLLATE "default" NOT NULL,
"type" varchar COLLATE "default",
"definition_id" int4 NOT NULL,
"chapter" int4,
"subject_id" int4 NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of keyword
-- ----------------------------

-- ----------------------------
-- Table structure for subject
-- ----------------------------
DROP TABLE IF EXISTS "public"."subject";
CREATE TABLE "public"."subject" (
"id" int4 DEFAULT nextval('subject_id_seq'::regclass) NOT NULL,
"subject" varchar COLLATE "default" NOT NULL,
"lecturer_name" varchar COLLATE "default",
"book_name" varchar COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of subject
-- ----------------------------

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------
ALTER SEQUENCE "public"."definition_id_seq" OWNED BY "definition"."id";
ALTER SEQUENCE "public"."keyword_id_seq" OWNED BY "keyword"."id";
ALTER SEQUENCE "public"."subject_id_seq" OWNED BY "subject"."id";

-- ----------------------------
-- Primary Key structure for table definition
-- ----------------------------
ALTER TABLE "public"."definition" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table keyword
-- ----------------------------
ALTER TABLE "public"."keyword" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table subject
-- ----------------------------
ALTER TABLE "public"."subject" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Foreign Key structure for table "public"."keyword"
-- ----------------------------
ALTER TABLE "public"."keyword" ADD FOREIGN KEY ("definition_id") REFERENCES "public"."definition" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "public"."keyword" ADD FOREIGN KEY ("subject_id") REFERENCES "public"."subject" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION;
